<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.turma.model.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALTERAR USU�RIO</title>
</head>
<body>
	<h1> alterar usu�rio </h1>

	<form action="portal" method="post">
	
	c�digo: <input type="text" name="txtcodigo" value="${usuario.id}" readonly> <br> <br>
	nome:  <input type="text" name="txtnome" value="${usuario.nome}"> <br> <br>
	login: <input type="text" name="txtLogin" value="${usuario.login}"> <br> <br>
	senha: <input type="text" name="txtsenha" value="${usuario.senha}"> <br> <br>
	
	<input type="hidden" name="acao" value="alterar">
	
	<input type="submit" value="salvar">
	
	</form>
 
</body>
</html>