<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Les produits disponibles</title>
</head>
<body>
	<table>
  <p:forEach items="${pdtsList}" var="item">
    <tr>
      <td><c:out value="${item}" /></td>
    </tr>
  </p:forEach>
</table>
</body>
</html>