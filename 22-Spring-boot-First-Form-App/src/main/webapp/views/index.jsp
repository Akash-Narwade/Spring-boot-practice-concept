<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveProduct" method="POST">
  <table>
	  <tr>
		  <td> Product ID: </td>
		  <td> <input type="text" name="pid"/> </td>     
	  </tr>
	   <tr>
		  <td> Product Name: </td>
		  <td> <input type="text" name="pname"/> </td>      
	  </tr>
	   <tr>
		  <td> Product Price</td>
		 <td> <input type="text" name="price"/> </td>     
	  </tr>
	   <tr>
		  <td> <input type="rest" name="Rest"/> </td>
		  <td> <input type="submit" name="Submit"/> </td>    
	  </tr>
  </table>
</form>
</body>
</html>