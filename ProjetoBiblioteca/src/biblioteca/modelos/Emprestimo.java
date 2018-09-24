package biblioteca.modelos;

import java.util.Calendar;

public class Emprestimo {
	
	public final static int DIAS_DE_DURACAO = 14;
	public final static int MAXIMO_LIVROS = 3;

	private Calendar dataEmprestimo;
	private Calendar dataDevolucao;
	private long livro;  
	private long aluno;
	
	private boolean status;
	
	public boolean isStatus() {
		return status;
		
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public long getLivro() {
		return livro;
	}

	public void setLivro(long livro) {
		this.livro = livro;
	}

	public long getAluno() {
		return aluno;
	}

	public void setAluno(long aluno) {
		this.aluno = aluno;
	}

	public static int getDiasDeDuracao() {
		return DIAS_DE_DURACAO;
	}

	public static int getMaximoLivros() {
		return MAXIMO_LIVROS;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setAluno(Aluno aluno2) {
		// TODO Auto-generated method stub
		
	}

	public void setLivro(Livro livro2) {
		// TODO Auto-generated method stub
		
	}

	
}
	
