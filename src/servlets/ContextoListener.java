package servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import modelo.Historico;

@WebListener
public class ContextoListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent evento) {
		
		ServletContext contexto= evento.getServletContext();
		contexto.setAttribute("historico", new Historico());
	}

	@Override
	public void contextDestroyed(ServletContextEvent evento) {
		
		ServletContext contexto= evento.getServletContext();
		contexto.removeAttribute("historico");
	}
}
