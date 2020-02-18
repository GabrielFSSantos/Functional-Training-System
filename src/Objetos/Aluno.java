package objetos;

import java.sql.Date;
import javax.swing.ImageIcon;

public class Aluno extends Pessoa{
	
    private int dia_pagamento;
    private char sexo;
    private Date dt_nascimento;
    private byte[] imagem;
    private String ficha_alimentacao;
    private String restricao;
    private Nutricionista nutricionista;

    public Aluno() {

    }

    public Aluno(String nome, String CPF, String email, String telefone, int dia_pagamento, char sexo, Date dt_nascimento, byte[] imagem, String restricao) {
            super(nome, CPF, email, telefone);
            this.dia_pagamento = dia_pagamento;
            this.sexo = sexo;
            this.dt_nascimento = dt_nascimento;
            this.imagem = imagem;
            this.restricao = restricao;		
    }

    public int getDia_pagamento() {
            return dia_pagamento;
    }

    public void setDia_pagamento(int dia_pagamento) {
            this.dia_pagamento = dia_pagamento;
    }

    public char getSexo() {
            return sexo;
    }

    public void setSexo(char sexo) {
            this.sexo = sexo;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getFicha_alimentacao() {
            return ficha_alimentacao;
    }

    public void setFicha_alimentacao(String ficha_alimentacao) {
            this.ficha_alimentacao = ficha_alimentacao;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }    

    public String getRestricao() {
            return restricao;
    }

    public void setRestricao(String restricao) {
            this.restricao = restricao;
    }

    public Nutricionista getNutricionista() {
            return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
            this.nutricionista = nutricionista;
    }
    

    
    public ImageIcon getIcon(){
        
        ImageIcon icon = new ImageIcon(this.imagem);
        
        return icon;
    }

    @Override
    public String toString() {
            return super.toString();
    }
    
     @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aluno){
            Aluno a = (Aluno)obj;
            
            if(this.getCPF().equals(a.getCPF()))
                return true;
        }
        return false;
    }

	
	
	
	

}
