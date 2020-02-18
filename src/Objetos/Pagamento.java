package objetos;

import java.sql.Date;

public class Pagamento {

	float valor;
	Date data;
	Aluno aluno;
	boolean multa;
	
	public Pagamento(float valor, Date data, Aluno aluno, boolean multa) {
		super();
		this.valor = valor;
		this.data = data;
		this.aluno = aluno;
		this.multa = multa;
	}
	
	public Pagamento() {}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
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

	public boolean isMulta() {
		return multa;
	}

	public void setMulta(boolean multa) {
		this.multa = multa;
	}
	
	
	
	
}
