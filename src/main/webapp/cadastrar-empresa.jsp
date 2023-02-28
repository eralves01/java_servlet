<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaempresa" var="servletNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Empresa</title>
</head>
<body>
	<form action="${ servletNovaEmpresa }" method="POST">
		Nome: <input type="text" name="nome" />
		<br>
		CNPJ: <input type="text" name="cnpj" />
		<br>
		<button>Cadastrar</button>
	</form>
</body>
</html>