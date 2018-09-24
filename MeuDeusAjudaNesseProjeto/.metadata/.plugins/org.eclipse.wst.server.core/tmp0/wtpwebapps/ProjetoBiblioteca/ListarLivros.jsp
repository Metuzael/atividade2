<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de livros</title>
</head>
<body>
<table border="2">
		<h1>Lista de Livros</h1>
		<tr>
			<th>Título</th>
			<th>Autor</th>
			<th>Editora</th>
			<th>Ano de publicação</th>
			<th>Edição</th>
			<th>Remover</th>
			<th>Alterar</th>
		</tr>

		<c:forEach var="livro" items="${livros}">

			<tr>
				<td>${livro.titulo}</td>
				<td>${livro.autor}</td>
				<td>${livro.editora}</td>
				<td><fmt:formatDate value="${livro.dataPublicacao.time }" pattern="dd/MM/yyyy" /></td>
				<td>${livro.edicao}</td>
				
				<td> <a href="servico?comandos=RemoverLivro&id=${livro.id }" >Remover</a></td>
				<td> <a href="servico?comandos=AlterarLivro&id=${livro.id }" >Alterar</a></td>
				<td> <a href="Emprestimo.jsp?titulo=${livro.titulo }&idLivro=${livro.id }" >Emprestar</a></td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>