<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍库存登记系统</title>
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<style type="text/css">
table {
	border-collapse: collapse;
	text-align: center;
}
</style>
</head>
<body>
	<center>
		<h2>获取全部的用户信息</h2>
	</center>

	<table
		style="border: 1px solid black; cellspacing: 0; cellpadding: 0; margin: 0 auto; width: 600px;">
		<tr>
			<td style="border: 1px solid black">用户编号</td>
			<td style="border: 1px solid black">用户昵称</td>
			<td style="border: 1px solid black">用户详情信息</td>
			<td style="border: 1px solid black">用户权限</td>
		</tr>
		<c:forEach items="${users }" var="user" varStatus="status">
			<tr>
				<td style="border: 1px solid black">${user.uid }</td>
				<td style="border: 1px solid black">${user.uname}</td>
				<td style="border: 1px solid black"><a
					href="${user.uid }/getUser">详情</a></td>
				<td style="border: 1px solid black"></td>
			<tr>
		</c:forEach>
	</table>
	<center>
	<h3>
		<a href="<% request.getContextPath();%>getUsers?pageNum=1">首页</a>&nbsp;&nbsp;&nbsp;
		<c:if test="${pageNum==1 }">
						上一页&nbsp;&nbsp;&nbsp;
					</c:if>
		<c:if test="${pageNum!=1 }">
			<a href=" <% request.getContextPath();%>getUsers?pageNum=${pageNum-1}">上一页</a>&nbsp;&nbsp;&nbsp;
					</c:if>
		<c:if test="${pageNum == pageMax }">
						下一页&nbsp;&nbsp;&nbsp;
					</c:if>
		<c:if test="${pageNum != pageMax }">
			<a href=" <% request.getContextPath();%>getUsers?pageNum=${pageNum+1}">下一页</a>&nbsp;&nbsp;&nbsp;
		</c:if>
		<a href=" <% request.getContextPath();%>getUsers?pageNum=${pageMax }">尾页</a>&nbsp;&nbsp;&nbsp;
	</h3>
</center>

	

</body>
</html>






