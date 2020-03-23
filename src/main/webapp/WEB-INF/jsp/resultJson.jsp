<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<body>
<h1>List of persons</h1>
<c:forEach var="client" items="${ clients }">
<div>
<json:object>
  <json:property name="Nom:" value="${client.nom}"/>
  <c:out value="${ client } "/>
</json:object>
</div>
</c:forEach>
</body>
</html>

