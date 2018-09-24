<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Alunos</title>
</head>
<body>
<table border="2">
		<h1>Lista de Alunos</h1>
		<tr>
			<th>Matrícula</th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Data de Nascimento</th>
			<th>Endereço</th>
			<th>Remover</th>
		</tr>

		<c:forEach var="aluno" items="${alunos}">

			<tr>
				<td>${aluno.matricula}</td>
				<td>${aluno.nome}</td>
				<td>${aluno.cpf }</td>
				<td><fmt:formatDate value="${aluno.dataNascimento.time}"
						pattern="dd/MM/yyyy" />
				</td>
				<td>${aluno.endereco}</td>
				
				<td> <a href="servico?comandos=RemoverAluno&id='${aluno.id }'">Remover</a></td>
				<td> <a href="servico?comandos=AlterarAluno&id='${aluno.id }'">Alterar</a></td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>