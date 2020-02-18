package objetos;

import java.sql.Date;


public class Gastos {

	int id;
	float valor;
	Date data;
	String descricao;
	Funcionario funcionario;
	
	public Gastos(int id, float valor, Date data, String descricao, Funcionario funcionario) {
		super();
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.descricao = descricao;
		this.funcionario = funcionario;
	}
	
	public Gastos() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	

	

	
	
	
}
