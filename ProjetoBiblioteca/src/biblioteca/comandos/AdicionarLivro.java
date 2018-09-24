package biblioteca.comandos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.LivroDao;
import biblioteca.modelos.Livro;

public class AdicionarLivro implements Logica {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		Livro livro = new Livro();
		
		String id = request.getParameter("id");
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String editora = request.getParameter("editora");
		int edicao = Integer.parseInt(request.getParameter("edicao"));
		
		String dataText = request.getParameter("publicacao");
		Calendar data = null;
		
		try {
			Date date = new SimpleDateFormat("yyyy").parse(dataText);
			data = Calendar.getInstance();
			data.setTime(date);
		} catch (ParseException e) {
			
		}
		
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setEditora(editora);
		livro.setEdicao(edicao);
		livro.setDataPublicacao(data);
			
		try {
			if(id == null || id.equals("0") || id.isEmpty()){
				new LivroDao().inserir(livro);
			}else {
				livro.setId(Long.parseLong(id));
				new LivroDao().atualizar(livro);
			}
			request.setAttribute("menssage", "O livro " + titulo + " foi adicionado/alterado com sucesso.");
			
		} catch (Exception e) {
			
		}
		return "livro-cadastrado.jsp";
	}

}
