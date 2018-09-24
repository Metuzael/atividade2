package biblioteca.comandos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.modelos.Aluno;

public class RemoverAluno implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Long id = null;
		Aluno aluno = null;
		
		try {
			id = Long.parseLong(request.getParameter("id"));
			aluno = new AlunoDao().getAlunoById(id);

			if(new AlunoDao().remover(aluno)){
				
			}else {
				return null;
			}
			
		} catch (Exception e) {
			
		}
		return "AlunoRemovido.jsp";
	}
	

}
