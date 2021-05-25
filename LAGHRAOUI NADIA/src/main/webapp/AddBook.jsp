<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>

<form action="AddBook" method="post" class="row g-3">
  <div class="col-md-4">
    <label for="validationDefault01" class="form-label">Id Category</label><br>
    <input type="number" class="form-control" name="IdCategory" id="validationDefault01">
  </div>
  <div class="col-md-4">
    <label for="validationDefault02" class="form-label">Name of book</label><br>
    <input type="text" class="form-control" name="namebook" id="validationDefault02" >
  </div>
  <div class="col-md-4">
    <label for="validationDefault02" class="form-label">Author</label><br>
    <input type="text" class="form-control" name="author"  id="validationDefault02">
  </div>
<button type="submit" class="btn btn-dark">Add Book</button>
  
  </form>
</body>
</html>