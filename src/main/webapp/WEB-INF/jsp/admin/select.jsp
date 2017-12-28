<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机票信息</title>
<style type="text/css">
.center {
	Margin: 0 auto;
	min-width: 1000px;
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

table {
	border-collapse: collapse;
	text-align: center;
}

table th {
	text-align: center;
}

#num {
	float: right;
	margin-right: 10px;
}
</style>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">  
    function deleteUser(pmid){              
		if(confirm("您确认删除吗？")){   
			window.location.href="getDeletes?pmid="+pmid;
		}  
	}  
    function getredact(pmid){
    	window.location.href=pmid+"/getredact";
    	
    }
</script>
</head>
<body>
	<%
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		String date = format.format(new Date());
	%>
	<div class="center">
		<div class="row">
			<div class="col-md-12">
				<center>
					<h1>机票信息管理</h1>
				</center>
			</div>
		</div>

		<div>
			<center>
				<h3 id="box">你可以根据时间范围查询机票信息</h3>
				<form action="getAllTimes">
					开始：<input type="time" name="start" value="<%=date%>" class="start" />
					至：<input type="time" name="end" value="<%=date%>" class="end" /> <input
						type="submit" value="查询" class="sub">
				</form>
				<br />
			</center>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>ID</th>
						<th>航班编号</th>
						<th>始发地城市</th>
						<th>目的地城市</th>
						<th>始发时间</th>
						<th>到达时间</th>
						<th>价格</th>
						<th>航空公司</th>
						<th>机建信息</th>
						<th>燃油信息</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${Admininserts }" var="msg" varStatus="status">
						<tr>
							<td>${msg.pmid }</td>
							<td>${msg.pmfight }</td>
							<td><c:forEach items="${airports }" var="airport">
									<c:if test="${airport.paid == msg.pmid}">
									${airport.pacity }
								</c:if>
								</c:forEach></td>
							<td><c:forEach items="${provinces }" var="province">
									<c:if test="${province.cityid == msg.pmid}">
									${province.cityname }
								</c:if>
								</c:forEach></td>
							<td>${msg.pmstarttime }</td>
							<td>${msg.pmendtime }</td>
							<td>${msg.pmprice }</td>
							<td><c:forEach items="${planecompanys }" var="planecompany">
									<c:if test="${planecompany.pcid == msg.pcid}">
									${planecompany.pcname }
								</c:if>
								</c:forEach></td>
							<td><c:forEach items="${planeoils }" var="planeoil">
									<c:if test="${planeoil.poid == msg.poid}">
									${planeoil.pocreate }
								</c:if>
								</c:forEach></td>
							<td><c:forEach items="${planeoils }" var="planeoil">
									<c:if test="${planeoil.poid == msg.poid}">
									${planeoil.pooil }
								</c:if>
								</c:forEach></td>
							<td><a type="button" href="javascript:void(0)"
								onclick="getredact(${msg.pmid})" class="btn btn-info btn-sm">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									编辑
							</a> <a type="button" href="javascript:void(0)"
								onclick="deleteUser(${msg.pmid})" class="btn btn-danger btn-sm">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
							</a></td>
						<tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<hr style="height: 1px; border: none; border-top: 1px solid #ccc;" />
		<div class="row">
			<div class="col-md-6">当前第：${pageNum}页，总共：${pageMax}页</div>
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul id="num" class="pagination">
					<li><a
						href="<%request.getContextPath();%>getAdmininserts?pageNum=1">首页</a></li>
					<c:if test="${pageNum != 1}">
						<li><a
							href=" <% request.getContextPath();%>getAdmininserts?pageNum=${pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>

						</a></li>
						<li class="active"><a href="#">${pageNum}</a></li>
					</c:if>
					<c:if test="${pageNum == 1}">
						<li class="active"><a href="#">${pageNum}</a></li>
					</c:if>
					<c:if test="${pageNum != pageMax}">
						<li><a
							href="<% request.getContextPath();%>getAdmininserts?pageNum=${pageNum+1}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a
						href="<% request.getContextPath();%>getAdmininserts?pageNum=${pageMax}">末页</a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>