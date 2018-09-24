package biblioteca.comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.LivroDao;
import biblioteca.modelos.Livro;

public class AlterarLivro implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			Long id = Long.parseLong(request.getParameter("id"));
			Livro livro = new LivroDao().getLivroById(id);
			
			request.setAttribute("livro", livro);
		} catch (Exception e) {
			
		}
		
		return "Livro.jsp";
	}
	

}
