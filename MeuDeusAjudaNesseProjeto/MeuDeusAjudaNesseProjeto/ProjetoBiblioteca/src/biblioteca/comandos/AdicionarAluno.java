package biblioteca.comandos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biblioteca.dao.AlunoDao;
import biblioteca.modelos.Aluno;

public class AdicionarAluno implements Logica {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Aluno aluno = new Aluno();

		String id = request.getParameter("id");
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String endereco = request.getParameter("endereco");
        String dataText = request.getParameter("dataNascimento");
		Calendar data = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataText);
			data = Calendar.getInstance();
			data.setTime(date);
		} catch (Exception e) {
			
		}

		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setEndereco(endereco);
		aluno.setDataNascimento(data);
		
		try {
			if (id == null || id.equals("0") || id.isEmpty() || id.length() == 0) {
				new AlunoDao().inserir(aluno);
			} else {
				aluno.setId(Long.parseLong(id));
				new AlunoDao().atualizar(aluno);
			}

		} catch (Exception e) {
			
		}
		return "aluno-cadastrado.jsp" ;
	}

	}

	

