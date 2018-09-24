package biblioteca.comandos;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.dao.EmprestimoDao;
import biblioteca.modelos.Aluno;
import biblioteca.modelos.Emprestimo;

public class BuscaEmprestimo implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Emprestimo> result = new ArrayList<>();

		try {
			result = new EmprestimoDao().getLista();
			
		} catch (Exception e) {
			
		}
		
		
		request.setAttribute("emprestimos", result);

		return "ListarEmprestimos.jsp";
		
	}
	
	

}
