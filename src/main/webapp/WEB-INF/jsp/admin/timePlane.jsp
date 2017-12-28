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
			<th style="border: 1px solid black">ID</th>
			<th style="border: 1px solid black">航班编号</th>
			<th style="border: 1px solid black">始发地城市</th>
			<th style="border: 1px solid black">目的地城市</th>
			<th style="border: 1px solid black">始发时间</th>
			<th style="border: 1px solid black">到达时间</th>
			<th style="border: 1px solid black">价格</th>
			<th style="border: 1px solid black">航空公司</th>
			<th style="border: 1px solid black">机建信息</th>
			<th style="border: 1px solid black">燃油信息</th>
		</tr>
		<c:forEach items="${AllTimes }" var="msg" varStatus="status">
			<tr>
				<td style="border: 1px solid black">${msg.pmid }</td>
				<td style="border: 1px solid black">${msg.pmfight }</td>
				<td style="border: 1px solid black">
					<c:forEach items="${airports }" var="airport">
						<c:if test="${airport.paid == msg.pmid}">
							${airport.pacity }
						</c:if>
			       	</c:forEach>
		       	</td>
				<td style="border: 1px solid black">
					<c:forEach items="${provinces }" var="province">
						<c:if test="${province.cityid == msg.pmid}">
							${province.cityname }
						</c:if>
			       	</c:forEach>
				</td>
				<td style="border: 1px solid black">${msg.pmstarttime }</td>
				<td style="border: 1px solid black">${msg.pmendtime }</td>
				<td style="border: 1px solid black">${msg.pmprice }</td>
				<td style="border: 1px solid black">
					<c:forEach items="${planecompanys }" var="planecompany">
						<c:if test="${planecompany.pcid == msg.pcid}">
							${planecompany.pcname }
						</c:if>
			       	</c:forEach>
				</td>
				<td style="border: 1px solid black">
					<c:forEach items="${planeoils }" var="planeoil">
						<c:if test="${planeoil.poid == msg.poid}">
							${planeoil.pocreate }
						</c:if>
			       	</c:forEach>
				</td>
				<td style="border: 1px solid black">
					<c:forEach items="${planeoils }" var="planeoil">
						<c:if test="${planeoil.poid == msg.poid}">
							${planeoil.pooil }
						</c:if>
			       	</c:forEach>
			    </td>
			<tr>
		</c:forEach>
	</table>
	<br>
	<center><h3><a href="getAdmininserts?pageNum=1">返回首页</a></h3></center>
</body>
</html>