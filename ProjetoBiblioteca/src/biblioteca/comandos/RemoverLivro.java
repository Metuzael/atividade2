package biblioteca.comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.LivroDao;
import biblioteca.modelos.Livro;

public class RemoverLivro implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
				Long id = null;
				Livro livro = null;
				
				try {
					id = Long.parseLong(request.getParameter("id"));
					livro = new LivroDao().getLivroById(id); 
					
					if(new LivroDao().remover(livro)){
						
					}else {
						
					}
				} catch (Exception e) {
					return null;
				}
				return "LivroRemovido.jsp";
			}
	}


