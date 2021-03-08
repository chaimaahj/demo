<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Les produits disponibles</title>
</head>
<body>
<table>
	<tr>
		<td>ID</td>
		<td>Nom du produit</td>
		<td>Description</td>
		<td>Prix</td>
		<td>Image</td>
	</tr>
  <p:forEach items="${pdtList}" var="item">
    <tr>
      <td>${item.idPdt}</td>
      <td>${item.nomPdt}</td>
      <td>${item.description}</td>
      <td>${item.prix}</td>
      <td>${item.photo}</td>
    </tr>
  </p:forEach>
</table>
</body>
</html>