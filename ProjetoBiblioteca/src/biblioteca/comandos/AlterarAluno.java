package biblioteca.comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.modelos.Aluno;

public class AlterarAluno implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			Long id = Long.parseLong(request.getParameter("id"));
			Aluno aluno = new AlunoDao().getAlunoById(id);
			
			request.setAttribute("aluno", aluno);
		} catch (Exception e) {
			
		}
		
		return "Aluno.jsp";
	}
	

}
