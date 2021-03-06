package com.luv.com.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControlerServlet
 */
@WebServlet("/StudentControlerServlet")
public class StudentControlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private StudentDbUtil studentDbUtil;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	
	@Override
	public void init() throws ServletException {
		super.init();
		//create our student db util... and pass in the conn pool/datasource
		try {
			studentDbUtil = new StudentDbUtil(dataSource);
		}
		catch(Exception exc) {
			throw new ServletException(exc);
		}
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//list the student ... in MVC fashion
		try {
		listStudents(request, response);
		}
		catch(Exception exc) {
			throw new ServletException(exc);
		}	
	}


	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//get students from db util
		List<Student> students = studentDbUtil.getStudent();
		//add students to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send to JSP page (view)
		RequestDispatcher dispathecher = request.getRequestDispatcher("/list-students.jsp");
		dispathecher.forward(request, response);
	}

}
