<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员管理页面</title>
<style type="text/css">
a{
	color:black;
	text-decoration: none;
}
a:hover{
	color: blue;
}

</style>
</head>
<body>
	<center>
		<h1>管理员管理系统</h1>
	</center>
	<a href="#"><h2>用户管理</h2></a>
	<ul>
		<li><a href="getUsers?pageNum=1">获取全部的用户的信息</a></li>
	</ul>
	<a href="#"><h2>机票管理</h2></a>
	<ul>
		<li><a href="getAdmininserts?pageNum=1">获取全部的机票信息</a></li>
		<li><a href="getairports">添加机票信息</a></li>
	</ul>
</body>
</html>