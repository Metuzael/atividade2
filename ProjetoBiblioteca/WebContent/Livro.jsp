<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de livros</title>
<style>

body {
	height: 100%;
	background-image:
	url("data:image/jpeg;base64,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");
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
	  <h2>Cadastrar Livro: </h2>
   <form action="servico " id="formulario">
		<label>Titulo: </label> <input type="text" name="titulo" value="${livro.titulo }"/><br/>
	    <label>Autor: </label> <input type="text" name="autor" value="${livro.autor }"/><br/>
		<label>Edi��o: </label> <input type="text" name="edicao" value="${livro.edicao }"/><br/>
		<label>Editora: </label> <input type="text" name="editora" value="${livro.editora }"/><br/>
		<label>Ano de Publica��o: </label> <input type="text" name="publicacao" maxlength="4" value="<fmt:formatDate value='${livro.dataPub.time }' pattern='yyyy'/>"/><br/>
		<input type="hidden" name="comandos" value="AdicionarLivro">
		     <c:choose>
			 <c:when test="${not empty livro}">
			 <input type="hidden" name="id" value="${livro.id }">
			</c:when>
			</c:choose>
		<button type="submit">Adicionar Livro</button>
	</form>
	</div>
	
	<div id="busca">
		<h2>Buscar Livros:</h2>
		<form action="servico">
			<input type="text" name="titulo" placeholder="T�tulo...">
			<input type = "hidden" value="BuscaLivro">
			<br><br><br>
			<button type="enviar">Pesquisar</button>
		</form>
		<br><br>
		
		<form action="servico">
    		<input type = "hidden" name="comandos" value="BuscaLivro">
    		<button type="submit" >Listar Todos</button>
		</form>
		
		<br>
	</div>
	
</body>
</html>