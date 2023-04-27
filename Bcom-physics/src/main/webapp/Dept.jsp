<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department Names</title>

<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">


<style>
.table {
	margin-top: 200px;
	margin-left: 100px;
}

#A1 {
	background: pink;
}

#s1 {
	background: coral;
}
</style>

</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: brown">


			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
		</nav>
	</header>
	
	<h3 class="text-center">List of Employess</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/FormServlet" class="btn btn-success">Add new Dept</a>
			</div>
			<br>

	<table class="table">
		<thead>
			<tr>

				<th scope="col" id="A1">Deptno</th>
				<th scope="col" id="A1">DName</th>
				<th scope="col" id="A1">Location</th>
				<th id="A1">Action </th>	

			</tr>
		</thead>
		<tbody>

			<c:forEach var="Dept" items="${DeptList}">

				<tr id="s1">

					<td><c:out value="${Dept.deptno}" /></td>

					<td><c:out value="${Dept.dname}" /></td>

					<td><c:out value="${Dept.loc}" /></td>


					<td><a href="EditServlet?empno=<c:out value='${emp.empno}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?empno=<c:out value='${emp.empno}' />">Delete</a></td>


				</tr>

			</c:forEach>





		</tbody>
	</table>

</body>
</html>




