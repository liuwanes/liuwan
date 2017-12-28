<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.page {
	/* width:1000px; */
	margin-left: 39%;
}

.pagec {
	overflow: hidden;
	font-size: 20px;
}

.pagecl, .pagecr {
	float: left;
}

.pagecl div {
	text-align: justify;
	margin-bottom: 10px;
}

.pagecr div {
	margin-bottom: 10px;
}

.pagecr select {
	width: 173px;
	height: 27px;
}

.pagecr input {
	height: 20px;
}

.submit {
	margin-left: 100px;
	width: 100px;
	height: 30px;
}

.title {
	text-align: center;
}
</style>
</head>
<body>
	<div class="title">
		<h1>航班信息编辑</h1>
	</div>
	<div class="page">
		<form action="updateplane" method="post">
			<div class="pagec">
				<div class="pagecl">
					<div>航班编号：</div>
					<div>选择始发地城市：</div>
					<div>选择目的地：</div>
					<div>始发时间：</div>
					<div>到达时间：</div>
					<div>价格：</div>
					<div>航空公司：</div>
					<div>机件信息：</div>
					<div>燃油信息：</div>
				</div>
				<div class="pagecr">
					<div>
						<c:forEach var="airport" items="${airports}">
							<input type="text" value="${airport.pmfight}" name="pmfight" />
						</c:forEach>
					</div>
					<div>
						<select name="pmstartcity">
							<c:forEach var="airport" items="${airportss}">
								<option value="${airport.paid }">${airport.pacity}</option>
							</c:forEach>
						</select>
					</div>
					<div>
						<select name="pmendcity">
							<c:forEach var="province" items="${provinces}">
								<option value="${province.cityid }">
									${province.cityname}</option>
							</c:forEach>
						</select>
					</div>
					<div>
						<c:forEach var="airport" items="${airports}">
							<input class="time" type="time" name="pmstarttime"
								value="${airport.pmstarttime }" />
						</c:forEach>
					</div>
					<div>
						<c:forEach var="airport" items="${airports}">
							<input class="time" type="time" name="pmendtime"
								value="${airport.pmendtime }" />
						</c:forEach>
					</div>
					<div>
						<c:forEach var="airport" items="${airports}">
							<input type="text" name="pmprice" value="${airport.pmprice }" />
						</c:forEach>
					</div>
					<div>
						<select name="pcid">
							<c:forEach var="planecompany" items="${planecompanys}">
								<option value="${planecompany.pcid }">
									${planecompany.pcname}</option>
							</c:forEach>
						</select>
					</div>
					<div>
						<select name="pcid">
							<c:forEach var="planeoil" items="${planeoils}">
								<option value="${planeoil.pcid }">
									机件费：${planeoil.pocreate}</option>
							</c:forEach>
						</select>
					</div>
					<div>
						<select name="poid">
							<c:forEach var="planeoil" items="${planeoils}">
								<option value="${planeoil.poid}">
									燃油费：${planeoil.pooil}
								</option>
							</c:forEach>
						</select>
					</div>
				</div>

			</div>
			<input type="submit" value="提交" class="submit" />
		</form>
	</div>
</body>
</html>