<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/mainServlet" var="NovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Empresa</title>
</head>
<body>
	<form action="${ NovaEmpresa }" method="POST">
		Nome: <input type="text" name="nome" />
		<br>
		CNPJ: <input type="text" name="cnpj" />
		<br>
		<input type="hidden" name="action" value="NovaEmpresa">
		<button>Cadastrar</button>
	</form>
</body>
</html>