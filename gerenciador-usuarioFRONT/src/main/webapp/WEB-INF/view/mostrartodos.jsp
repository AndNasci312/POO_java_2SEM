<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MOSTRAR TODOS</title>
</head>
<body>
	Olá ${usuarioLogado.nome}
	<a href="logout"> <button> sair </button> </a>
	<h1>mostrar usuários</h1>

	
	<a href="?acao=formcadastro.jsp">
		<button>cadastrar usuário</button>
	</a>

<!-- <c:if test="${not empty lista}"> </c:if > -->
	<!-- <h3> nenhum user cadastrado	</h3>  -->
	<table border="1" style="width: 80%">
		<thead>
			<tr style="" background-color:black;color:white">
				<th>Id:</th>
				<th>Nome:</th>
				<th>Login:</th>
				<th>Senha:</th>
				<th coolspan="3">ação</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="usuario" items="${lista}">
				<tr>
					<td>${usuario.id}</td>
					<td>${usuario.nome}</td>
					<td>${usuario.login}</td>
					<td>${usuario.senha}</td>
					<td><a href="?acao=alterar?id=${usuario.id}">
							alterar </a></td>
					<td><a href="?acao=excluir?id=${usuario.id}">
							excluir </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>