
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result page</title>
</head>
<body>
<h1>List of persons</h1>
<table>
<c:forEach var="client" items="${watchlist}" >
<div>
<c:out value="${client.id}"/>
<c:out value="${client.nom}"/>
</div>
</c:forEach>
<table>
</body>
</html>




