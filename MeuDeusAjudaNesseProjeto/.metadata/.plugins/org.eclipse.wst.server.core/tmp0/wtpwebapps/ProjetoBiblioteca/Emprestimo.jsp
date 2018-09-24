<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Realizar emprestimo de livros</title>
<style>

body {
	height: 100%;
	background-image:
	url("https://png.pngtree.com/thumb_back/fw800/back_pic/03/92/99/5257e4bc31c91a2.jpg");
}

button{
width: 40%;
margin-left: 30%;
margin-right: 30%;
}

.area-header {
	float:left;
	width:100%;
	background-color:;
}
.icone {
	float:left;
	width:60px;
	height:60px;
	margin-left: 20px;

}
.name-proj {
	float:left;
	margin-top:15px;
	margin-left:15px;
}

footer{
	position: absolute;
	bottom: 20px;
	margin: auto;
	display: block;
	width: 100%;
	text-align: center;
}
#formulario {
	width: 70%;
	padding: 3% 2%;
	margin: 2% 13%;
	background-color: rgba(200,200,200,0.5);
	border-radius: 40px ;
	padding: 1%;
	float:left;
	
}
input[type=text], label{
	width: 50%;
	margin: 0% 25%;
}

</style>
</head>
<body>

   <div id="formulario">
    <form action="servico" id="formulario">
	
		<h2>Relizar Emprestimo:</h2>
	
		<label>Livro: </label> <input type="text" value="${param.titulo }" /><br/>
		<label>Aluno (mat.): </label> <input type="text" name="aluno" maxlength="14" /><br/>
		<input type="hidden" name="livro" value="${idLivro }">
		<input type="hidden" name="comandos" value="EmprestarLivro">
		<br/>
		<button type="submit">Confirmar Emprestimo</button>
	</div>	
		
		<div id="busca">
		<h2>Buscar emprestimos:</h2>
		<form action="servico">
			<input type="text" name="emprestimos" placeholder="Emprestimo...">
			<input type = "hidden" value="BuscaEmprestimo">
			<br><br><br>
			
		</form>
		<br><br>
		
		<form action="servico">
    		<input type = "hidden" name="comandos" value="BuscaEmprestimo">
    		<button type="submit" >Listar emprestimos</button>
		</form>
		
		<br>
	</div>
		
		
	</form>
</body>
</html>