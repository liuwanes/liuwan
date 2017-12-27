<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
	text-align: center;
}
a{
	text-decoration: none
}
</style>
</head>
<body>

	<center>
		<h2>根据时间获取全部的用户信息</h2>
	</center>
	
	<table style="border: 1px solid black; cellspacing: 0; cellpadding: 0; margin: 0 auto; width: 600px;">
		<tr>
			<td style="border: 1px solid black">用户编号</td>
			<td style="border: 1px solid black">用户昵称</td>
			<td style="border: 1px solid black">用户生日</td>
		</tr>
		<c:forEach items="${users }" var="user" varStatus="status">
			<tr>
				<td style="border: 1px solid black">${user.uid }</td>
				<td style="border: 1px solid black">${user.uname}</td>
				<td style="border: 1px solid black">
					<f:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/>
				</td>
			<tr>
		</c:forEach>
	</table>
	<br>
	<center><h3><a href="getUsers?pageNum=1">返回首页</a></h3></center>
	
</body>
</html>