<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8"/>
		<title>Lista de mensagens</title>	
		<link rel= "stylesheet" type="text/css" href="estilo.css"/>
	</head>
	<body>
	
		<header>
			<c:import url="topo.jsp">
				<c:param name="pagina" value="1"/>
			</c:import>
		</header>
		
		<main>					
			<div class="principal">	
			
				<h3>Nova mensagem</h3>
						
				<form action="ServletGravarMensagem" method="post" class="formulario">
					
					<div class="campo-formulario">
						<label for="email" class="descricao-campo">E-mail</label>
						<input type="text" name="email" class="campo"/>							
					</div>
						
					<div class="campo-formulario">	
						<label for="mensagem" class="descricao-campo">Mensagem</label>						
						<textarea name="mensagem" class="campo"></textarea>						
					</div>						
	
					<input type="submit" value="Gravar" class="botao"/>
							
				</form>
				
			</div>
		</main>
		
		<footer>
			<c:import url="rodape.jsp"/>
		</footer>
	</body>
</html>