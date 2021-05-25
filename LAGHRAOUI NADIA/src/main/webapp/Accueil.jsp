<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import= "com.util.Student" %>
      <%@ page import= "com.util.Book" %>
    <%@ page import= "com.util.Category" %>
    <%@ page import= "com.util.CategoryOfBook" %>
        <%@ page import= "com.util.BookManager" %>
    
      <%@ page import= "java.util.List" %>
    <% Student m=(Student)session.getAttribute("Student");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="main.css">
 <title>Accueil</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
 
 </head>
 <body>
	
	<div class="header">
		<nav>			
		<ul class="menu">
				<li><a href="#">   </a></li>
				<li><a href="#">   </a></li>	
				<li><a href="#">   </a></li>				
				<li><a href="#">   </a></li>				
				<li><a href="#">   </a></li>				
				<li><a href="#">ACCUEIL</a></li>
				<li><a href="Login.jsp">SIGN IN/ SIGN UP</a></li>
			</ul>
	</nav>
	</div>
	<%
		CategoryOfBook c= new CategoryOfBook();
		List<Category> ct= c.ShowAllCategory();
		List<Book> bo= null;
		String IdCategory;
		if(request.getParameter("category") ==null || request.getParameter("category").equals("all"))
		{
			BookManager s= new BookManager();
			bo = s.ShowBooks();
			IdCategory = "all";
		}else{
			
			String Id = request.getParameter("category");
			IdCategory = Id;
			bo= c.SearchByCategory(Integer.parseInt(IdCategory));
		}
	%>
<form action="AddBook.jsp" method="post">
<button type="submit" class="btn btn-dark">Add Book</button>
</form>
<form action="AddCategory.jsp" method="post">
<button type="submit" class="btn btn-dark">Add Category</button>

</form>
	<form>  
  <div >
    <label >Category</label>
    <select>
      	<option value="all" <%=IdCategory.equals("all")?"selected":""%>>all</option>
		<%
		for(Category e : ct){	
		%>
<option value="<%=e.getIdCategory()%>"<%=IdCategory.equals(String.valueOf(e.getIdCategory()))?"selected":""%>><%=e.getCategory() %></option>
<%
		}
%>
    </select>
  </div>
  </form>

	<table class="table">
  <thead>
    <tr>
      <th scope="col">Name Book</th>
      <th scope="col">Author</th>
    </tr>
  </thead>
  <tbody>
  	<%
	for(Book b : bo){
	%>	
    <tr>
      <td><%=b.getNamebook() %></td>
      <td><%=b.getAuthor() %></td>
    </tr>
    <%
	}
	%>
  </tbody> 
  </table>
</body>
</html>