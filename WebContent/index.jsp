<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${pageContext.request.contextPath}<br/>

<a href="xxx/xxx">默认</a>

<a href="xxx/name2">request</a>

<a href="xxx/name3">sesstion</a>
<a href="xxx/name4">webservlet</a>
<br>
<a href="c/cc">测试</a>
<br>

<a href="e/ee">异常处理</a>
<br>
<a href="e/e1"> from 表单</a>
<br>
<br>
<a href="f/f"> from 表单2</a>
<form action="h/hhh" method="post">
shuru<input type="text" name="hap">
tjiao<input type="submit">
</form>

------------
<form action="I/II" method="post">
账号<input type="text" name="id"><br>
密码<input type="text" name="name"><br>
tjiao<input type="submit">
</form>
<br>
----文件上传下载----------
<form action="j/j" method="post" enctype="multipart/form-data">
图片<input type="file" name="file">
提交<input type="submit" value="上传"></form>
-----拦截器--------
${lanjie }
<form action="k" method="post">
账号<input type="text" name="id"><br>
密码<input type="text" name="name"><br>
tjiao<input type="submit">
</form>

<a href="${pageContext.request.contextPath}/index.jsp">返回index</a>
</body>
</html>