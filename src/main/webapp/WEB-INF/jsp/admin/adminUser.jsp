<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>遛弯</title>
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
table {
	border-collapse: collapse;
	text-align: center;
}

#box {
	color: #F1970A;
}

.start, .end {
	border-radius: 5px;
}
.sub {
	border: 0;
	width: 60px;
	height: 30px;
	line-height: 30px;
	background-color: #F1970A;
	border-radius: 5px;
}
</style>
<style type="text/css">
#div1 {
    width: 73px;
    height: 38px;
    border-radius: 50px;
    position: relative;
}

#div2 {
    width: 36px;
    height: 33px;
    border-radius: 48px;
    position: absolute;
    background: white;
    box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.4);
}

.open1 {
	background: rgba(0, 184, 0, 0.8);
}

.open2 {
	top: 2px;
	right: 1px;
}

.close1 {
	background: rgba(255, 255, 255, 0.4);
	border: 3px solid rgba(0, 0, 0, 0.15);
	border-left: transparent;
}

.close2 {
	left: 0px;
	top: 0px;
	border: 2px solid rgba(0, 0, 0, 0.1);
}
</style>
    <script type="text/javascript">
    	window.onload=function(){
        var div2=document.getElementById("div2");
        var div1=document.getElementById("div1");
        div2.onclick=function(){
          div1.className=(div1.className=="close1")?"open1":"close1";
          div2.className=(div2.className=="close2")?"open2":"close2";
        }
    }
    </script>
</head>
<body>
	<%
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    String date= format.format(new Date());
	%>

	<center>
		<h1>获取全部的用户信息</h1>
	</center>
	<div>
	<center>
		<h3 id="box">你可以根据时间范围查询用户</h3>
		<form action="getAllTime">
		开始：<input type="date"  name="start" value="<%=date %>"  class="start"/>
		至：<input type="date"  name="end" value="<%=date %>"  class="end"/>
		 <input type="submit" value="查询" class="sub">
		</form>
		<br>
	</center>
	</div>
	<br>
	<table style="border: 1px solid black; cellspacing: 0; cellpadding: 0; margin: 0 auto; width: 600px;">
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
				<td style="border: 1px solid black">
					 <div id="div1" class="open1">
        				<div id="div2" class="open2"></div>
    				</div>
				</td>
			<tr>
		</c:forEach>
	</table>
	<center>
		<h5>当前第：${pageNum}页，总共：${pageMax}页</h5>
	</center>
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






