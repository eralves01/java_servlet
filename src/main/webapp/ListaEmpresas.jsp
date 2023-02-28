<%@	page import="java.util.List,br.com.ericalves.gerenciador.modelo.Empresa" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			<li>Nome: ${ empresa.nome } - CNPJ: ${ empresa.cnpj }</li>
			<a href="/gerenciador/removeEmpresa?id=${ empresa.id }">Remover</a> | <a href="/gerenciador/mostraEmpresa?id=${ empresa.id }">Editar</a>
		</c:forEach>
	</ul>
</body>
</html>