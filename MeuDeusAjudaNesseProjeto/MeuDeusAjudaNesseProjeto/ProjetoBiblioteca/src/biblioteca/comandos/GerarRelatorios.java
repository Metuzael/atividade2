package biblioteca.comandos;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.dao.EmprestimoDao;
import biblioteca.modelos.Aluno;
import biblioteca.modelos.Emprestimo;

public class GerarRelatorios implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Emprestimo> emprestimos = new ArrayList<>();
		List<Aluno> alunosEmDias = new ArrayList<>();
		List<Aluno> alunosAtrasados = new ArrayList<>();
		
		try {
			for(Aluno aluno : new AlunoDao().getLista()){
				if(!aluno.getEmprestimo().isEmpty()){
					if(aluno.isStatus()){
						alunosEmDias.add(aluno);
					}else {
						alunosAtrasados.add(aluno);
					}
				}
			}
			emprestimos = new EmprestimoDao().getLista();

			request.setAttribute("emprestimo", emprestimos);
			request.setAttribute("alunosEmDias", alunosEmDias);
			request.setAttribute("alunosAtrasados", alunosAtrasados);
			
		} catch (Exception e) {
			
		}
		
		return "Relatorio.jsp";
	};
	

}
