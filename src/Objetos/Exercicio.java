package objetos;

public class Exercicio {

	
	String nome;
	Aluno aluno;
	int repeticao;
	Equipamento equipamento;
	
	public Exercicio(String nome, Aluno aluno, int repeticao, Equipamento equipamento) {
		super();
		this.nome = nome;
		this.aluno = aluno;
		this.repeticao = repeticao;
		this.equipamento = equipamento;
	}
	
	public Exercicio() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public int getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
	
	
}
