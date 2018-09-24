package biblioteca.comandos;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.modelos.Aluno;

public class BuscaAluno implements Logica {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		List<Aluno> result = new ArrayList<>();

		try {
			result = new AlunoDao().getLista();
			
		} catch (Exception e) {
			
		}
		
		
		request.setAttribute("alunos", result);

		return "ListarAlunos.jsp";
		
	}
	
	
}
