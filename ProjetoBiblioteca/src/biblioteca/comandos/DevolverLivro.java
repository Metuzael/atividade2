package biblioteca.comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.EmprestimoDao;
import biblioteca.dao.LivroDao;
import biblioteca.modelos.Livro;

public class DevolverLivro implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		long id = Long.parseLong(request.getParameter("id"));
		Livro livro = new LivroDao().getLivroById(id);
		
		try{
			if(new EmprestimoDao().removerByLivro(livro)){
				request.setAttribute
				("menssage", livro.getTitulo() + " O livro foi devolvido à biblioteca. ");
			}else {
				
			}
		}
		catch (Exception e) {
			
		}
		
		return "index.jsp";
	}
	

}
