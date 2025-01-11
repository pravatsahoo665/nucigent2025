<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form:form action="insertdata" method="post" modelAttribute="key"
			class="form-horizontal">
		
ENTER NAME:<form:input id="name" path="name" type="text" />
			<br>
	ENTER EMAIL:<form:input id="email" path="email" type="email" />
			<br>
	ENTER STATE:<form:input id="state" path="state" type="text" />
			<br>
ENTER Location:<form:input id="location" path="location" type="text" />
			<br>
			<br>
			<button type="submit" style="background-color: blue">
				<h style="color:white">SUBMIT</h>
			</button>

		</form:form>
		<br>
	</center>

</body>
</html>