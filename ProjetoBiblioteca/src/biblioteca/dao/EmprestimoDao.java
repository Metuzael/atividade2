package biblioteca.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import biblioteca.modelos.Aluno;
import biblioteca.modelos.Emprestimo;
import biblioteca.modelos.Livro;

public class EmprestimoDao {

	private Connection connection;

	public EmprestimoDao() {
		connection = ConnectionFactory.getConnection();
	}
	public boolean inserir(Emprestimo emprestimo) {

		String sql = "insert into Emprestimo (aluno, livro, dataEmprestimo) " + "values (?, ?, ?);";
	
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, emprestimo.getAluno());
			stmt.setLong(2, emprestimo.getLivro());
			stmt.setDate(3, new java.sql.Date(emprestimo.getDataEmprestimo().getTimeInMillis()));
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public List<Emprestimo> getLista() {
		List<Emprestimo> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from emprestimo");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Emprestimo emprestimo = new Emprestimo();
				
				
				Aluno aluno = new AlunoDao().getAlunoById(rs.getLong("aluno"));
				Livro livro = new LivroDao().getLivroById(rs.getLong("livro"));
				emprestimo.getAluno();
				emprestimo.getLivro();
				
                Calendar dataEmprestimo = Calendar.getInstance();
				dataEmprestimo.setTime(rs.getDate("dataEmprestimo"));
				emprestimo.setDataEmprestimo(dataEmprestimo);

				Calendar dataDevolucao = null;
				dataDevolucao = (Calendar) dataEmprestimo.clone();
				dataDevolucao.add(Calendar.DAY_OF_MONTH , Emprestimo.DIAS_DE_DURACAO);
				
				emprestimo.setDataEmprestimo(dataEmprestimo);
				emprestimo.setDataDevolucao(dataDevolucao);
				
				
				if(Calendar.getInstance().after(dataDevolucao)) {
					emprestimo.setStatus(false);
				}else {
					emprestimo.setStatus(true);
				}

				
				result.add(emprestimo);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Emprestimo> getListaByAluno(Aluno aluno) {
		List<Emprestimo> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from emprestimo where aluno=?");
			stmt.setLong(1, aluno.getId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Emprestimo emprestimo = new Emprestimo();
				
				aluno = new AlunoDao().getAlunoById(rs.getLong("aluno"));
				Livro livro = new LivroDao().getLivroById(rs.getLong("livro"));
				emprestimo.getAluno();
				emprestimo.getLivro();

				Calendar dataEmprestimo = Calendar.getInstance();
				dataEmprestimo.setTime(rs.getDate("dataEmprestimo"));
				emprestimo.setDataEmprestimo(dataEmprestimo);

				Calendar dataDevolucao = null;
				dataDevolucao = (Calendar) dataEmprestimo.clone();
				dataDevolucao.add(Calendar.DAY_OF_MONTH , Emprestimo.DIAS_DE_DURACAO);
				
				emprestimo.setDataEmprestimo(dataEmprestimo);
				emprestimo.setDataDevolucao(dataDevolucao);
				
				if(Calendar.getInstance().after(dataDevolucao)) {
					emprestimo.setStatus(false);
				}else {
					emprestimo.setStatus(true);
				}

				result.add(emprestimo);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Emprestimo> getListaByLivro(Livro livro) {
		List<Emprestimo> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from emprestimo where livro=?");
			stmt.setLong(1, livro.getId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Emprestimo emprestimo = new Emprestimo();
				
				Aluno aluno = new AlunoDao().getAlunoById(rs.getLong("aluno"));
				livro = new LivroDao().getLivroById(rs.getLong("livro"));
				emprestimo.getAluno();
				emprestimo.getLivro();

				Calendar dataEmprestimo = Calendar.getInstance();
				dataEmprestimo.setTime(rs.getDate("dataEmprestimo"));
				emprestimo.setDataEmprestimo(dataEmprestimo);

				Calendar dataDevolucao = null;
				dataDevolucao = (Calendar) dataEmprestimo.clone();
				dataDevolucao.add(Calendar.DAY_OF_MONTH , Emprestimo.DIAS_DE_DURACAO);
				
				emprestimo.setDataEmprestimo(dataEmprestimo);
				emprestimo.setDataDevolucao(dataDevolucao);
				
				if(Calendar.getInstance().after(dataDevolucao)) {
					emprestimo.setStatus(false);
				}else {
					emprestimo.setStatus(true);
				}

				result.add(emprestimo);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean remover(Emprestimo emprestimo) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from emprestimo where livro=?");
			
			stmt.setLong(1, emprestimo.getLivro());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean removerByLivro(Livro livro) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from emprestimo where livro=?");
			//stmt.setString(2, emprestimo.getAluno().getMatricula());
			stmt.setLong(1, livro.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
