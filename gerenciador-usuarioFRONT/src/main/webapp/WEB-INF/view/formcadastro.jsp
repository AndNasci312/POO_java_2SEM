<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> CADASTRO DE USUÁRIO </title>
</head>
<body>
	<h1> cadastro de usuário </h1>
	<form action="portal" method="post"> 
	<!-- get, post, dopost    -->
	nome: <input type="text" name="txtnome" autocomplete="off" required> <br> <br>
	login: <input type="text" name="txtlogin" autocomplete="off" required> <br> <br>
	senha: <input type="password" name="txtsenha" autocomplete="off" required> <br> <br>
	
	<input type="hidden" name="acao" value="cadastrar">
	<input type="submit" value="salvar">
	
	 </form>
</body>
</html>