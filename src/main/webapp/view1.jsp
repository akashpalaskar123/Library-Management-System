<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type ="text/css">


input{border-radius: 20px;box-shadow: 5px 5px #8808;}
   body{
font-family : sans-serif;

font-colour: solid white;
 h1  color: white; 
}
section{
border: 10px solid white;
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
    

table, th, td
 {
  border: 5px solid black;
  border-collapse: collapse;
}
th, td 
{
  padding: 15px;
}
</style>

</head>
<body>
<div class="container">
	 <center>
	<h1>Library</h1>
	<h3>Books</h3>
	
	<table >
  <tr>
    <th>Book Name</th>
    <th>Book Author</th> 
    <th>Book price</th>
   
  </tr>
	<c:forEach var="b" items="${login}">
	
   <tr>
   
  <td>${b.bname}</td>
    <td>${b.bauthor} </td>
    <td> ${b.bprice}</td>
    
    
     </tr>
		

	
	<br/>
	</c:forEach>
	</table>
	
	 </center>
	 </div>
</body>
</html>