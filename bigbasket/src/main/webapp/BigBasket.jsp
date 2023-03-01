<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details validation</title>
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
				src="https://cdn.siasat.com/wp-content/uploads/2020/03/bigbasket.jpg" width="80"
				height="48" class="d-inline-block align text-top"></a><a
				href="index.jsps">Home</a>
		</div>
	</nav>
	<h1>BigBasket order confirm</h1>
	<h3><span style="color: red;">${message}</span></h3> 
	<form action="BigBasket" method="post">
	Search by ID <input type="text" name="id">
	<input type="submit" value="search"/>
	<div>
	<h3>Search Results</h3>
	customer : ${bigBasketDTO.customer}
	address : ${bigBasketDTO.address}
	location : ${bigBasketDTO.location}
	contact : ${bigBasketDTO.contact}
	pinCode : ${bigBasketDTO.pinCode}
	bill : ${bigBasketDTO.bill}
	email : ${bigBasketDTO.email}
	passWord : ${bigBasketDTO.passWord}
	item : ${bigBasketDTO.item}
	area : ${bigBasketDTO.area}
	</div>
	</form>
</body>
</html>