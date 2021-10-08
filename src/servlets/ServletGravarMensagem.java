package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Historico;
import modelo.Mensagem;

@WebServlet("/ServletGravarMensagem")
public class ServletGravarMensagem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Historico historico= (Historico) getServletContext().getAttribute("historico");
		String email= request.getParameter("email");
		String mensagem= request.getParameter("mensagem");
		
		Mensagem m= new Mensagem(email, mensagem);		
		historico.salvarMensagem(m);		
				
		request.setAttribute("mensagens", historico.listar());
		request.getRequestDispatcher("listarMensagens.jsp").forward(request, response);		
	}
}
