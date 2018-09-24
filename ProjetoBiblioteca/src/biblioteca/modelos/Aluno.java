package biblioteca.modelos;

import java.util.Calendar;
import java.util.List;

import biblioteca.dao.EmprestimoDao;

public class Aluno {
	
    private long id;
	private String matricula;
	private String nome;
	private String cpf;
	private Calendar dataNascimento;
	private String endereco;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Emprestimo> getEmprestimo(){
		return new EmprestimoDao().getListaByAluno(this);
	}
	public boolean isStatus(){
		for(Emprestimo emprestimo : this.getEmprestimo()){
			if(!emprestimo.isStatus()){
				return emprestimo.isStatus();
			}
		}
		return true;
	}
	
}
