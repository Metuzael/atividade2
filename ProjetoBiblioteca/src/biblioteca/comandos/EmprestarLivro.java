package biblioteca.comandos;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.dao.EmprestimoDao;
import biblioteca.dao.LivroDao;
import biblioteca.modelos.Aluno;
import biblioteca.modelos.Emprestimo;
import biblioteca.modelos.Livro;

public class EmprestarLivro implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
        Emprestimo emprestimo = null;
		
		try {
			emprestimo = new Emprestimo();
			
			long idLivro = Long.parseLong(request.getParameter("livro"));
			Livro livro = new LivroDao().getLivroById(idLivro);
			String matAluno = request.getParameter("aluno");
			Aluno aluno = new AlunoDao().getAlunoByMatricula(matAluno);
			Calendar data = Calendar.getInstance();
			
			emprestimo.setLivro(livro);
			emprestimo.setAluno(aluno);
			emprestimo.setDataEmprestimo(data);
			
			System.out.println("Aqui está");
			
			if(!aluno.isStatus()){
				
				return "Aluno.jsp";
			}
			
			if(aluno.getEmprestimo().size() >= Emprestimo.MAXIMO_LIVROS){
				
				return "Relatorio.jsp";
			}
			
			
			if (new EmprestimoDao().inserir(emprestimo)) {
				request.setAttribute
				("menssage", "Emprestimo para " + aluno.getMatricula() + " realizado com sucesso!");
			}else {
				
			}
		} catch (Exception e) {
			
		}
		return "LivroEmprestado.jsp";
	}
	

}
