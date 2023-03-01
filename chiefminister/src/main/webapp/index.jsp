<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CM info</title>
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
				src="http://en.wikipedia.org/wiki/Special:FilePath/BasavarajBommai.jpg" width="80"
				height="48" class="d-inline-block align text-top"></a> <a
				href="CM.jsp">Home Page</a>
		</div>
	</nav> 
	<form action="cm" method="post">
				CM Name <input type="text" name="name"/><br>
				Party Name <select name="party"><br>
				<option value="">Select</option>
				<option>BJP</option>
				<option>INC</option>
				<option>JDS</option>
				<option>KJP</option>
				<option>nota</option></select>
				State <select name="state"><br>
				<option value="">Select</option>
				<option>KA</option>
				<option>TN</option>
				<option>AP</option>
				<option>nota</option>
				</select>
				Tenure <select name="tenure"><br>
				<option value="">Select</option>
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>nota</option>
				</select>
				 <textarea rows="3" cols="20" name="portfolio">Portfolio</textarea><br>
				<input type="submit" value="order" class="btn btn primary"/>
				</form>
</body>
</html>