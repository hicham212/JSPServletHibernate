<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>list utilisateurs</title>
</head>
<body>
	
	
	<h3>List utilisateurs</h3>
	<table>
		<c:forEach items="${data}" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.userName}</td>
				<td>${u.email}</td>
				<td>${u.phone}</td>
			</tr>
		</c:forEach>
	</table>
		
	<a href="${pageContext.request.contextPath}/register.jsp" > Ajouter user </a> 
	
</body>
</html>