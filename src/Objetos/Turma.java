package objetos;

import java.util.ArrayList;
import objetos_dao.Turma_AlunoDAO;

public class Turma {

	int id, quantidade;
	String horario;
	Instrutor instrutor;
	
	public Turma(int id, int quantidade, String horario, Instrutor instrutor) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.horario = horario;
		this.instrutor = instrutor;
	}
	
	public Turma() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public ArrayList<Aluno> getAlunos() throws Exception {
            Turma_AlunoDAO tadao = new Turma_AlunoDAO();
            return tadao.getAlunos(this.id);
	}
	
}
