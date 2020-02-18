package objetos;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcionario extends Pessoa{	

    private float salario;
    private String especialidade;
    private String tipo;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, String email, String telefone, float salario, String especialidade, String senha) {		
            super(nome, CPF, email, telefone);		
            this.salario = salario;
            this.especialidade = especialidade;
            this.senha = senha;
    }
    
    public Funcionario(String nome, String CPF, String email, String telefone, float salario, String especialidade, String senha, String tipo) {		
            super(nome, CPF, email, telefone);		
            this.salario = salario;
            this.especialidade = especialidade;
            this.senha = senha;
            this.tipo = tipo;
    }

    public float getSalario() {
            return salario;
    }

    public void setSalario(float salario) {
            this.salario = salario;
    }

    public String getEspecialidade() {
            return especialidade;
    }

    public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean validarSenha(String senha){
    
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(senha.getBytes(), 0, senha.length());
            senha = new BigInteger(1,m.digest()).toString(16);
//            System.out.println(senha);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return this.senha.equals(senha);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Funcionario){
            Funcionario a = (Funcionario)obj;
            
            if(this.getCPF().equals(a.getCPF()))
                return true;
        }
        return false;
    }
    
    
    
    
        
        
	
	
	
	
	
	
	
	

}
