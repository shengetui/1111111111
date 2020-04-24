<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试返回JSON格式的数据</title>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">

	function testResponseBody() {
		//alert("sxasxa");
		var url = "${pageContext.request.contextPath}/json/testResponseBody";
		var params = {id:3,name:"zhangsan"};
		$.post(url,params, function(data) {
			alert(data);
					console.log(data);
					$.each(data, function() {
						var tr = $("<tr align='center'/>");
						
						
						$("<td/>").html(this.age).appendTo(tr);//<td>1</td>
						$("<td/>").html(this.name).appendTo(tr);
						$("<td/>").html(this.username).appendTo(tr);
						
						
						$("#booktable").append(tr);
						
						
						//$(A).appendTo($(B))      把A元素导入到B元素的最后面 
						//$(A).append($(B))        把B元素放入到A元素最后面
						
					});
				}, "json");
		
		}
</script>
</head>
<body>
${pageContext.request.contextPath}<br/>
<button onclick="testResponseBody()">获取数据</button><br/>

	<table id="booktable" border="1" style="border-collapse: collapse;">
		<tr align="center">
			<th>编号</th>
			<th>书名</th>
			<th>作者</th>
			<th>作者</th>
			<th>作者</th>
		</tr>
		
	</table>

</body>
</html>