<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
111111111------${l }---request--${name2 }----sesstion-0---${name3 }

<br>
webservlet-----${name4 }-----${name5 }
<br>
zhanhao+-------${ss }
<br>
<img  src="/SpringMvc/${imageUrl }">
文件下载：
<img src="images/${imageUrl }" width="200px"/>
<a href="javascript:window.location.href = 'SpringMvc?filename=/' + encodeURIComponent( /'${requestScope.imageUrl }' )">
${requestScope.imageUrl }
</a>

<%-- 
  <form:form  method="post" action="e/e1" modelAttribute="command">
	
			<td>姓名:</td>
			<td><form:input path="username"/></td>
		
			<td>年龄:</td>
			<td><form:input path="age"/></td>
		<td>密码:</td>
			<td><form:hidden path="name"/></td>
			
		
</form:form> 
 --%>

<%-- <form:form modelAttribute="iid">
<form:select path="id">
<form:options items="${list }" itemLabel="name" itemValue="id"/>
</form:select>



</form:form>

 --%>


</body>
</html>