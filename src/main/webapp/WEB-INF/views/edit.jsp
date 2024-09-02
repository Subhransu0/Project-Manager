<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Add Project</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Project Management</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">

			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center">
						<h3>Edit Project</h3>


					</div>

					<div class="card-body">
						<form action="${pageContext.request.contextPath}/updateProject"
							method="post">
							<input type="hidden" name="id" value="${update.id }">
							<div class="mb-3">
								<label>Project Name</label> <input type="text"
									name="projectname" class="form-control"
									value="${update.projectname }" required />
							</div>
							<div class="mb-3">
								<label>Description</label> <input type="text" name="description"
									value="${update.description }" class="form-control" />
							</div>
							<div class="mb-3">
								<label>Skills</label> <input type="text" name="skills"
									value="${update.skills }" class="form-control" />
							</div>
							<div class="mb-3">
								<label>Link</label> <input type="url" name="link"
									value="${update.link }" class="form-control" />
							</div>
							<div class="mb-3">
								<label>Start Date</label> <input type="date" name="startDate"
									value="${update.startDate }" class="form-control" />
							</div>
							<div class="mb-3">
								<label>End Date</label> <input type="date" name="endDate"
									value="${update.endDate }" class="form-control" />
							</div>
							<div class="mb-3 text-center">
								<button type="submit" class="btn btn-primary">Submit
									Project</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS Bundle -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJo.Mp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>
