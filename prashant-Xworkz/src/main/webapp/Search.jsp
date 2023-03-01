<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				src=""https://tse2.mm.bing.net/th?id=OIP.eV85twrsAL_wcTZPaR2B1gHaHK&pid=Api&P=0"" width="80"
				height="48" class="d-inline-block align text-top"></a> <a
				href="save">Save</a>
				<a href="launch">Search</a>
		</div>
	</nav> 
	<h1>Satellite Search</h1>
	<h3><span style="color: red;">${message}</span></h3>
	<form action="launch" method="get">
	Search by Id <input type="text" name="id"/>
	<input type="submit" value="search">
	</form>
	<div>
	<h3>Search details:</h3>
	name : ${dto.name}</br>
	station : ${dto.station}</br>
	budget : ${dto.budget}</br>
	localDateTime : ${dto.localDateTime}</br>
	chairman : ${dto.chairman}
	</div>
</body>
</html>