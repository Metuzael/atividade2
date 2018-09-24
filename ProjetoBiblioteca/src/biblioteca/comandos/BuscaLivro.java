package biblioteca.comandos;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.LivroDao;
import biblioteca.modelos.Livro;

public class BuscaLivro implements Logica {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String titulo = request.getParameter("titulo");
		List<Livro> result = new ArrayList<>();
		
		try {
			
			if(titulo== null || titulo.equals("0") || titulo.isEmpty() || titulo.length() == 0){
				result = new LivroDao().getLista();
			}
		
			else {
				for(Livro livro : new LivroDao().getLista()){
					if(livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
						result.add(livro);
					}
				}
			}
		} catch (Exception e) {
			
		}
		
		
		request.setAttribute("livros", result);
		
		return "ListarLivros.jsp";
	};
	

	
}
