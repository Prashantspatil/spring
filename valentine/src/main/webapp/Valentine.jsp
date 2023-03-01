<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valentine-Day</title>
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
				src="https://tse1.mm.bing.net/th?id=OIP.93nDS_b2sLcSWZ4w5qEuQQHaEs&pid=Api&P=0" width="80"
				height="48" class="d-inline-block align text-top"></a> <a
				href="index">Home</a>
		</div>
	</nav> 
	<h1>Couple's Details Saving</h1>
	<c:forEach items="${error}" var="e">
	<span style="color: red;">${e.message}</span><br>
	</c:forEach>
	<form action="Valentine" method="post">
	<pre>
				Name <input type="text" name="name"/><br>
				Valentine Name <input type="text" name="valentineName"/><br>
				Places <select name="places"><br>
				<option value="">Select</option>
				<c:forEach items="${places}" var="p"><option value="${p}">${p}</option></c:forEach> 
				</select>
				gifts <select name="gifts"><br>
				<option value="">Select</option>
				<c:forEach items="${gifts}" var="g"><option value="${g}">${g}</option></c:forEach> 
				</select>
				<input type="submit" value="save"/>
				</pre>
				</form>
</body>
</html>