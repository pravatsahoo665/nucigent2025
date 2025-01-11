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
		<form:form action="deletdata" method="post" modelAttribute="key"
			class="form-horizontal">
		ENTER  DELETE ID:<form:input id="id" path="id" type="text" />
			<br>
			<button type="submit">DELETE</button>

		</form:form>
		<br>
	</center>

</body>
</html>