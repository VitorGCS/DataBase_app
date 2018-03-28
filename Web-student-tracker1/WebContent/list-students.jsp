<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Tracker App</title>
	<link type="text/css" rel="styLesheet" href="css/style.css">
</head>

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
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
					<tr>
						<td> ${tempStudent.firstName}</td>
						<td> ${tempStudent.lastName}</td>
						<td> ${tempStudent.e_mail}</td>
				</c:forEach>			
			</table>
		</div>
	</div>

</body>

</html>