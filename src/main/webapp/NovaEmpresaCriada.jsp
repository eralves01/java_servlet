<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty empresa }">
		<h1>Cadastro de Empresas:</h1>
		<h2>Nome: ${ empresa.nome }  </h2>
		<h2>CNPJ: ${ empresa.cnpj } </h2>
		<h4>UPDATED: <fmt:formatDate value="${ empresa.update }" pattern="dd/MM/yyyy"/></h4>
	</c:if>
	<c:if test="${ empty empresa }">
		<h1>Nenhuma empresa cadastrada:</h1>
	</c:if>
</body>
</html>