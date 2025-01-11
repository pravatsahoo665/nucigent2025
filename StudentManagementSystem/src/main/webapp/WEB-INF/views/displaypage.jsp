<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>LOCATION</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>STATE</th>
				<th>DELETE</th>
				<th>UPDATE</th>
				
				
				
			</tr>
			<tbody>
				<c:forEach var="o" items="${office}">
					<tr>
						<td>${o.id}</td>
						<td>${o.location}</td>	
						<td>${o.name}</td>
						<td>${o.email}</td>
						<td>${o.state}</td>
						<td><a href="delete?id=${o.id}">DELETE</a></td>
						<td><a href="update?id=${o.id}">UPDATE</a></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
</body>
</html>