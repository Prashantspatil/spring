<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Satellite</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">ISRO<img alt=""
				src="https://tse2.mm.bing.net/th?id=OIP.eV85twrsAL_wcTZPaR2B1gHaHK&pid=Api&P=0"
				width="80" height="48" class="d-inline-block align text-top"></a>
			<a href="index.jsp">home</a> <a href="Search.jsp">Search</a>
		</div>
	</nav>
	<form action="save" method="post">
		Name<input type="text" name="name"><br> Station <select
			name="station">
			<option value=" ">SELECT</option>
			<c:forEach items="${station} " var="s">
				<option label="${s}">${s}</option>
			</c:forEach>
		</select> <br> Chairman <select name="chairman">
			<option value=" ">SELECT</option>
			<c:forEach items="${chairman} " var="c">
				<option label="${c}">${c}</option>
			</c:forEach>
		</select> <br> LocalDateTime : <input type="datetime-local" name="localDateTime"><br>
		Budget : <input type="number" name="budget"><br> <input
			type="submit" value="send" class="btn-btn-primery">
	</form>
</body>
</html>
