package objetos;

import java.sql.Date;

public class Avaliacao {

	float altura;
	float peso;
	Date data;
	Aluno aluno;
	float porcentagem_gordura;
	float porcentagem_massa;
	
	public Avaliacao(float altura, float peso, Date data, Aluno aluno, float porcentagem_gordura,
			float porcentagem_massa) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.data = data;
		this.aluno = aluno;
		this.porcentagem_gordura = porcentagem_gordura;
		this.porcentagem_massa = porcentagem_massa;
	}
	
	public Avaliacao() {}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public float getPorcentagem_gordura() {
		return porcentagem_gordura;
	}

	public void setPorcentagem_gordura(float porcentagem_gordura) {
		this.porcentagem_gordura = porcentagem_gordura;
	}

	public float getPorcentagem_massa() {
		return porcentagem_massa;
	}

	public void setPorcentagem_massa(float porcentagem_massa) {
		this.porcentagem_massa = porcentagem_massa;
	}
	
	
	
	
	
}
