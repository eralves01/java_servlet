<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/mainServlet" var="editaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty empresa }">
		<form action="${ editaEmpresa }" method="POST">
			<h1>Editar Empresa:</h1>
			<h2><input type="hidden" name="id" value="${ empresa.id }"></h2>
			<h2><input type="hidden" name="action" value="EditaEmpresa"></h2>
			<h2>Nome: <input type="text" name="nome" value="${ empresa.nome }" /></h2>
			<h2>CNPJ: <input type="text" name="cnpj" value="${ empresa.cnpj }" /></h2>
			<button>Enviar</button>
		</form>
	</c:if>
	<c:if test="${ empty empresa }">
		<h1>Nenhuma empresa cadastrada:</h1>
	</c:if>
</body>
</html>