<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentification</title>
<link href="style.css" rel="stylesheet" >
</head>
<body>
<h2>Register Page</h2><br>    
    <div class="login">    
    <form id="login" method="post" action="AddStudent">  
      
        <label><b>Log in<br/>
        </b>    
        </label>    
        <input type="text" name="log" id="Uname" placeholder="Login">    
        <br><br>    
        <label>
        <b>Password     
        </b>    
        </label>    
        <input type="Password" name="pass" id="Pass" placeholder="Password">    
        <br><br>    
        <label><b>Last name<br/>
        </b>    
        </label>    
        <input type="text" name="lname" id="Uname" placeholder="Last name">    
        <br><br>
        <label><b>First name<br/>
        </b>    
        </label>    
        <input type="text" name="fname" id="Uname" placeholder="First name">    
        <br><br>
        <input type="submit" name="log" id="log" value="Register">       
        <br><br>    
           
       <a href="Login.jsp">Sign in</a>    
    </form>     
</div>
</body>
</html>