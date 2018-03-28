<%@ page import="java.util.*, com.luv.com.web.jdbc.*"%>

<!DOCTYPE html>
<html>
<head>
	<title>Student Tracker App</title>
</head>
<%
	//get the student from the request object (sent by servlet)
	List<Student> theStudents = (List<Student>) request.getAttribute("STUDENT_LIST");


%>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>FooBar University</2>		
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email Name</th>
				</tr>
				<% for(Student tempStudent : theStudents){ %>
					<tr>
						<td><%= tempStudent.getFirstName()%></td>
						<td><%= tempStudent.getLastName()%></td>
						<td><%= tempStudent.getE_mail() %></td>
					</tr>
				<% } %>			
			</table>
		</div>
	</div>

</body>

</html>