<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
	
	<form action="searchbychairman" method="get">
	Search by Chairman <input type="search" name="chairman"/>
	<input type="submit" value="search">
	</form>
	
	<div>
		<table class="table">
		
			<tr>
			<th scope="col"> Id </th>
			<th scope="col"> Name </th>
			<th scope="col"> Station </th>
			<th scope="col"> Budget </th>
			<th scope="col"> LocalDateTime </th>
			<th scope="col"> Chairman </th>
			<th scope="col"> Edit </th>
			<th scope="col"> Delete </th>
			</tr>
			
	<c:forEach items = "${lists}"  var = "s" >
	
	<tr>
			<td> ${s.id} </td>
			<td> ${s.name} </td>
			<td> ${s.station} </td>
			<td> ${s.budget} </td>
			<td> ${s.localDateTime} </td>
			<td> ${s.chairman} </td>
			<td><a href="update?id=${s.id}">Edit</a>
			<td><a href="delete?id=${s.id}">Delete</a> 
    </tr>			
	
	</c:forEach>
		
		
		</table>
	
	</div>
	

</body>
</html>