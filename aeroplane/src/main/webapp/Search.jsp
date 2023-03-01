<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aeroplane</title>
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
				href="register">Register</a>
				<a href="search">Search</a>
		</div>
	</nav> 
	<h1>Aeroplane Search</h1>
	<h3><span style="color: red;">${message}</span></h3>
	<form action="search" method="get">
	Search by Id <input type="text" name="id"/>
	<input type="submit" value="search">
	</form>
	<div>
	<h3>Search details:</h3>
	company : ${dto.company}</br>
	name : ${dto.name}</br>
	country : ${dto.country}</br>
	type : ${dto.type}</br>
	cost : ${dto.cost}
	</div>
</body>
</html>