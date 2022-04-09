<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html  style="height: 780px;">
<head>
<meta charset="ISO-8859-1">
<title>Update data</title>

<style type ="text/css">
 h2 { color: black;

  }
h3 { color: white; }
input{border-radius: 20px;}
   body{
font-family : sans-serif;

font-colour: solid black;
 h1  color: black; 


}
section{

height: 90vh;
position: relative;
    }
    
    
    .container{

max-width: 700px;
width: 100%;

height: 50vh;
display: flex;
align-items : center;
justify-content: center;
border-radius: 30px;

position: absolute;
right: 0;
left: 0;
top : 0;
bottom:0;
margin:auto
}
    
table, th, td {
  border: 5px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
</style>
</head>
<body>
<div class="container">

<center>
<h2>Updateing Books Record</h2>

 if you want to view books => <a href="show">Click Here</a><br><br>

<form action="update">
Book name  : <input type="text" name="bname"><br><br>
Book Author  : <input type="text" name="bauthor"><br><br>
Book Price  : <input type="text" name="bprice"><br><br>
             <input type="submit" value="submit" ><br><br>
             </form>

</center>
</div>
</body>
</html>