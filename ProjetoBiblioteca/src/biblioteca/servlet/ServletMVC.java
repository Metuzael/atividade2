package biblioteca.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.comandos.Logica;
@WebServlet("/servico")
public class ServletMVC extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		String answer = null;
		String logicaRequest = request.getParameter("comandos");
		String commando = "biblioteca.comandos." + logicaRequest;
		try {
			Class<?> classe = Class.forName(commando);
			Logica logica = (Logica)classe.newInstance();

			answer = logica.execute(request, response);
		} catch (Exception e) {
			
		}
		
		dispatcher = request.getRequestDispatcher(answer);
		dispatcher.forward(request, response);
	}
	
}
