<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log</title>
<link href="style.css" rel="stylesheet" >
</head>
<body>
<h2>Login Page</h2><br>    
    <div class="login">    
    <form id="login" method="post" action="Authentification">  
      
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
            
        <input type="submit" name="log" id="log" value="Sign in">       
        <br><br>    
        <input type="checkbox" id="check">    
        <span>Remember me</span>    
        <br><br>    
       <a href="Register.jsp">Sign up</a>    
    </form>     
</div>  

</body>
</html>