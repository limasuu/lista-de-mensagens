<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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
				<c:param name="pagina" value="2"/>
			</c:import>
		</header>
		
		<main>
			<div class="principal2">
			
				<div class="lista">
					<h3>Lista de mensagens</h3>
					
					<table>
						<thead>
							<tr>
								<td>E-mail</td>
								<td>Mensagem</td>
								<td>Nº de caracteres da mensagem</td>
							</tr>
						</thead>
						
						<tbody>
							<c:forEach var="m" items="${mensagens}">
								<tr>
									<td><c:out value="${m.email}"/></td>
									<td><c:out value="${m.mensagem}"/></td>
									<td>${fn:length(m.mensagem)}</td>
								</tr>
							</c:forEach>
						</tbody>
					
					</table>			
				</div>
				
				<p><a href="ServletNovaMensagem">Escrever uma nova mensagem</a></p>
			
			</div>		
		</main>
		
		<footer>
			<c:import url="rodape.jsp"/>
		</footer>
	</body>
</html>