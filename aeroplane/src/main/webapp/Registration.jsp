<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airoplane</title>
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
			<a class="navbar-brand" href="#">APTC<img alt=""
				src="https://tse3.mm.bing.net/th?id=OIP.dvbpdw3ritJQD2rzzURJCgHaEK&pid=Api&P=0" width="80"
				height="48" class="d-inline-block align text-top"></a> <a
				href="index.jsp">home</a>
				<a href="Search.jsp">Search</a>
		</div>
	</nav> 
	<form action="register" method="post">
	Company<input type="text" name="company"><br>
	Name<input type="text" name="name"><br>
	Type <select name="type">
	<option value=" ">SELECT</option>
	<c:forEach items="${type} " var="i">
	<option label="${i}">${i}</option>
	</c:forEach>
	 </select>
	 <br>
	 Country	<select name="country">
	<option value=" ">SELECT</option>
	<c:forEach items="${country} " var="c">
	<option label="${c}">${c}</option>
	</c:forEach>
	 </select>
	 <br>
	 Cost : <input type="number" name="cost"><br>
	<input type="submit" value="send" class="btn-btn-primery">
	</form>
	
	
</body>
</html>