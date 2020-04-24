<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>错误的页面：${requestScope.ex.message}</h1>
	<form:form modelAttribute="gg" method="post" action="register">
		<fieldset>
			<legend>register</legend>
			<p>
				<label>name:</label>
				<form:input path="id" />
				<form:errors path="id" cssStyle="color:red" />
			</p>
			<p>
				<label>password:</label>
				<form:errors path="name" cssStyle="color:red" />
			</p>

			<p id="buttons">
				<input id="submit" type="submit" value="register"> <input
					id="reset" type="reset" value="reset">
			</p>
		</fieldset>
	</form:form>
</body>
</html>