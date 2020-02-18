package objetos;

import java.sql.Timestamp;

public class Agendamento {

	Aluno aluno;
	String descricao;
	Timestamp data_hora;
	
	public Agendamento(Aluno aluno, String descricao, Timestamp data_hora) {
		super();
		this.aluno = aluno;
		this.descricao = descricao;
		this.data_hora = data_hora;
	}
	
	public Agendamento() {}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Timestamp getData_hora() {
		return data_hora;
	}

	public void setData_hora(Timestamp data_hora) {
		this.data_hora = data_hora;
	}
	
	
	
	
}
