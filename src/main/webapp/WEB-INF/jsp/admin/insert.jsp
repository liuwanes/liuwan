<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.page{
		/* width:1000px; */
		margin-left:39%;
	}
	.pagec{
		overflow:hidden;
		font-size:20px;
	}
	.pagecl,.pagecr{
		float:left;
	}
	.pagecl div{
		text-align:justify;
		margin-bottom:10px;
	}
	.pagecr div{
		margin-bottom:10px;
	}
	.pagecr select{
		width:173px;
		height:27px;
	}
	.pagecr input{
		height:20px;
	}
	.submit{
		margin-left:100px;
		width:100px;
		height:30px;
	}
	.title{
		text-align:center;
		}
</style>
</head>
<body>

	<div class="title"><h1>航班信息添加</h1></div>
	<div class="page">
		<form action="insert" method="post">
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
					<input type="text" value="${admininsert.pmfight}" name="pmfight"/>
				</div>
				<div>
					<select name="pmstartcity">
						<option>始发地城市</option>
						<c:forEach var="airport" items="${airports}">
							<option value="${airport.paid }">
								${airport.pacity}
							</option>
						</c:forEach>
					</select>
				</div>
				<div>
					<select name="pmendcity">
						<option>目的地城市</option>
						<c:forEach var="province" items="${provinces}">
							<option value="${province.cityid }">
								${province.cityname}
							</option>
						</c:forEach>
					</select>
				</div>
				<div>
					<input class="time" type="time" name="pmstarttime" value="(String)${admininsert.pmstarttime }"/>
				</div>
				<div>
					<input class="time" type="time" name="pmendtime" value="(String)${admininsert.pmendtime }"/>
				</div>
				<div>
					<input type="text" name="pmprice" value="${admininsert.pmprice }"/>
				</div>
				<div>
					<select name="pcid">
						<option>选择航空公司</option>
						<c:forEach var="planecompany" items="${planecompanys}">
							<option value="${planecompany.pcid }">
								${planecompany.pcname}
							</option>
						</c:forEach>
					</select>
				</div>
				<div>
					<select name="pcid">
						<option>选择机件信息</option>
						<c:forEach var="planeoil" items="${planeoils}">
							<option value="${planeoil.pcid }">
								机件费：${planeoil.pocreate}
							</option>
						</c:forEach>
					</select>
				</div>
				<div>
					<select name="poid">
						<option>选择燃油信息</option>
						<c:forEach var="planeoil" items="${planeoils}">
							<option value="${planeoil.poid}">
								燃油费：${planeoil.pooil}
							</option>
						</c:forEach>
					</select>
				</div>
			</div>
			
		</div>
			<input type="submit" value="提交" class="submit"/>
		</form>
	</div>
</body>
</html>