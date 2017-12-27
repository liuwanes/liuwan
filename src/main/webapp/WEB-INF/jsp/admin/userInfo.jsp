<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	text-decoration: none;
}

</style>
</head>
<body>
<center>
	<h2>用户详情页页面</h2>
	<table style="border:1px solid  #000 ;width: 450px;">
		<tr >
			<td style="border:1px solid #000"><h4>用户编号：${user.uid }</h4></td>
		</tr>
		<tr>
			<td style="border:1px solid #000"><h4>用户编号：${user.uname }</h4></td>
		</tr>
		<tr>
			<td style="border:1px solid #000"><h4>用户生日：<f:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></h4></td>
		</tr>
	</table>
	<center><h4><a href="../getUsers?pageNum=1">返回用户信息页面</a></h4></center>
</center>
</body>
</html>