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
			<a href="save">Save</a> <a href="Search.jsp">Search</a>
			<a href = "SearchByChairman.jsp"> SearchByChairman </a>
		</div>
	</nav>
	<h1>Satellite Update Page</h1>
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
	<div><span style="color: green;">${message}</span></div>
	<form action="update" method="post">
	
	<div class="mb-3">
	<label for="formFile" class="form-label">Id</label>
	<input type="text" class="form-control" name="id" readonly value="${dto.id}">
	</div>
	
	<div class="mb-3">
	<label for="formFile" class="form-label">Name</label>
	<input type="text" class="form-control" name="name" readonly value="${dto.name}">
	</div>
	
	<div class="mb-3">
	<label for="formFile" class="form-label">Budget</label>
	<input type="text" class="form-control" name="budget" readonly value="${dto.budget}">
	</div>
	
	<div class="mb-3">
	<label for="formFile" class="form-label">LocalDateTime</label>
	<input type="text" class="form-control" name="localDateTime" readonly value="${dto.localDateTime}">
	</div>
	
	Chairman <select class="form-select" aria-label="Default select example" name="chairman" required="required">
	<option selected value="${dto.chairman}">${dto.chairman}</option>
	<c:forEach items="${chairman}" var="c">
	<option value="${c}">${c}</option>
	</c:forEach>
	</select>
	
	station <select class="form-select" aria-label="Default select example" name="station" required="required">
	<option selected value="${dto.station}">${dto.station}</option>
	<c:forEach items="${station}" var="s">
	<option value="${s}">${s}</option>
	</c:forEach>
	</select>
	
	<input type="submit" value="Update" class="btn btn-primary">
	
	</form>
</body>
</html>