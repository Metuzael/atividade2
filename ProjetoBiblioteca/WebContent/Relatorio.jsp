<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Relatorios</title>
</head>
<body>
<table border="2">
	
		<h2>Alunos em Dias</h2>
		<tr>
			<th>Matrícula</th>
			<th>Nome</th>
		</tr>

		<c:forEach var="aluno" items="${alunosEmDias }" >
		
		

			<tr>
				<td>${aluno.matricula}</td>
				<td>${aluno.nome}</td>

				<table border="2">
					<tr>
						<th>Livro</th>
						<th>DataEmprestimo</th>
						<th>DataDevolucao</th>
					</tr>
					
					<c:forEach var="emprestimo" items="${aluno.emprestimo }">
						<td>${emprestimo.livro.titulo }</td>
						<td><fmt:formatDate value="${emprestimo.dataEmprestimo.time }" pattern="dd/MM/yyyy" /></td>
						<td><fmt:formatDate value="${emprestimo.dataDevulucao.time }" pattern="dd/MM/yyyy" /></td>
					</c:forEach>
				</table>
			</tr>

		</c:forEach>
	</table>
	<table border="2">
	
		<h2>Alunos Atrasados</h2>
		<tr>
			<th>Matrícula</th>
			<th>Nome</th>
		</tr>

		<c:forEach var="aluno" items="${alunosAtrasados }" >
		
		

		<tr>
			<td>${aluno.matricula}</td>
			<td>${aluno.nome}</td>

	 <table border="2">
				<tr>
					<th>Livro</th>
					<th>DataEmprestimo</th>
					<th>DataDevolucao</th>
				</tr>
					
				<c:forEach var="emprestimo" items="${aluno.emprestimo }">
					<td>${emprestimo.livro.titulo }</td>
					<td><fmt:formatDate value="${emprestimo.dataEmprestimo.time }" pattern="dd/MM/yyyy" /></td>
					<td><fmt:formatDate value="${emprestimo.dataDevolucao.time }" pattern="dd/MM/yyyy" /></td>
						
				</c:forEach>
			</table>
			   </tr>

		      </c:forEach>
	</table>
</body>
</html>