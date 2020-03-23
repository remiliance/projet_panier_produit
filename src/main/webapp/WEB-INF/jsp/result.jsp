<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result page</title>
</head>
<body>
<h1>List of persons</h1>
<c:forEach items="${ clients }" var="client">
<div>
<c:out value="client.nom }"/>
</div>
</c:forEach>
</body>
</html>