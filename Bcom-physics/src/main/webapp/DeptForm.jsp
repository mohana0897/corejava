<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">


<style>
.form-group {
	width: 300px
}
</style>



</head>


<body>


	<form action="/Bcom-physics/AddDept" method="post">
		<div class="form-group">
			<label for="deptno">Department number</label> <input type="text"
				name="dno" class="form-control"> <br>



		</div>

		<div class="form-group">
			<label for="dname">Departname Name</label> <input type="text"
				name="deptname" class="form-control"> <br>

		</div>
		<div class="form-group">
			<label for="loc">Location</label> <input type="text" name="location"
				class="form-control">
		</div>

		<br>



		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
</html>