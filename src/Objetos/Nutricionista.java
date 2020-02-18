package objetos;

public class Nutricionista extends Funcionario{
	
    public Nutricionista() {

    }

    public Nutricionista(String nome, String CPF, String email, String telefone, float salario, String especialidade, String senha) {
            super(nome, CPF, email, telefone, salario, especialidade, senha);

    }

    public Nutricionista(Funcionario f) {
        super(f.getNome(), f.getCPF(), f.getEmail(), f.getTelefone(), f.getSalario(), f.getEspecialidade(), f.getSenha());

    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Nutricionista){
            Nutricionista a = (Nutricionista)obj;
            
            if(this.getCPF().equals(a.getCPF()))
                return true;
        }
        return false;
    }



}
