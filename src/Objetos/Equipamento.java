package objetos;

import java.sql.Timestamp;
import java.sql.Date;

public class Equipamento {
	
    int id;
    String nome;
    String status;
    Date p_manutencao;
    Date u_manutencao;
    public Equipamento(int id, String nome, String status, Date p_manutencao, Date u_manutencao) {
            super();
            this.id = id;
            this.nome = nome;
            this.status = status;
            this.p_manutencao = p_manutencao;
            this.u_manutencao = u_manutencao;
    }

    public Equipamento() {}

    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public String getStatus() {
            return status;
    }
    public void setStatus(String status) {
            this.status = status;
    }
    public Date getP_manutencao() {
            return p_manutencao;
    }
    public void setP_manutencao(Date p_manutencao) {
            this.p_manutencao = p_manutencao;
    }
    public Date getU_manutencao() {
            return u_manutencao;
    }
    public void setU_manutencao(Date u_manutencao) {
            this.u_manutencao = u_manutencao;
    }

    @Override
    public String toString() {
        return  nome;
    }
    
    
	
	
	

}
