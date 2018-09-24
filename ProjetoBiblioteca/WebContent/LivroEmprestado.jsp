<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emprestimo</title>
</head>
<body>
<h1>O Livro ${param.titulo } foi emprestado com sucesso para o aluno ${param.matricula } !</h1>

<table border="2">
		<h1>Lista de Livros</h1>
		<tr>
			<th>Aluno</th>
			<th>Livro</th>
			<th>Data de emprestimo</th>
			<th>Remover</th>
			
		</tr>

		<c:forEach var="emprestimo" items="${emprestimos}">

			<tr>
				<td>${emprestimo.aluno}</td>
				<td>${emprestimo.livro}</td>
				<td><fmt:formatDate value="${emprestimo.dataDeEmprestimo.time }" pattern="dd/MM/yyyy" /></td>
				
				
				<td> <a href="servico?comandos=DevolverLivro&id=${livro.id }" >Devolver</a></td>
				
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>