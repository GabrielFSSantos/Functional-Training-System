package objetos_dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.ConnectionFactory;
import objetos.Avaliacao;

public class AvaliacaoDAO {


    public AvaliacaoDAO() {
    }
    
    public void adiciona(Avaliacao avaliacao) throws Exception {
        String sql = "INSERT INTO public.\"Avaliacao\"" +
                	 "(altura, peso, data,\"CPF_Aluno\",porcentagem_gordura, porcentagem_massa)" +
                	 "values (?,?,?,?,?,?)";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
            stmt.setFloat(1, avaliacao.getAltura());
            stmt.setFloat(2, avaliacao.getPeso());
            stmt.setDate(3, avaliacao.getData());
            stmt.setString(4, avaliacao.getAluno().getCPF());
            stmt.setFloat(5, avaliacao.getPorcentagem_gordura());
            stmt.setFloat(6, avaliacao.getPorcentagem_massa());           
            
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
	
    public ArrayList<Avaliacao> getAvaliacao(String CPF_Aluno) throws Exception {

        String sql = "SELECT * " +
                         "FROM public.\"Avaliacao\"" +
                         "WHERE \"CPF_Aluno\" = ?";

        ArrayList<Avaliacao>lista=new ArrayList();

        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

         try {
            Avaliacao avaliacao = new Avaliacao();

            stmt.setString(1, CPF_Aluno);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {            	 
                avaliacao.setAltura(rs.getFloat("altura"));
                avaliacao.setPeso(rs.getFloat("peso"));
                avaliacao.setData(rs.getDate("data"));
                avaliacao.setAluno(new AlunoDAO().getAluno(rs.getString("CPF_Aluno")));
                avaliacao.setPorcentagem_gordura(rs.getFloat("porcentagem_gordura"));
                avaliacao.setPorcentagem_massa(rs.getFloat("porcentagem_massa"));
                lista.add(avaliacao);
            }
            rs.close();

            return lista;

        } catch (SQLException e) {
                throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }

    }
    
    public ArrayList<Avaliacao> procura_avaliacoes_aluno_data(String CPF,Date data) throws Exception {
	
	String sql = "SELECT * " +
			 "FROM public.\"Avaliacao\"" +
			 "WHERE \"CPF_Aluno\", data = ?,?";
	ArrayList<Avaliacao>lista=new ArrayList();
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
	
        try {
            Avaliacao avaliacao = new Avaliacao();

            stmt.setString(1, CPF);
            stmt.setDate(2, data);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

               avaliacao.setAltura(rs.getFloat("altura"));
               avaliacao.setPeso(rs.getFloat("peso"));
               avaliacao.setData(rs.getDate("data"));
               AlunoDAO alunoDB = new AlunoDAO();            
               avaliacao.setAluno(alunoDB.getAluno(rs.getString("CPF_Aluno")));
               avaliacao.setPorcentagem_gordura(rs.getFloat("porcentagem_gordura"));
               avaliacao.setPorcentagem_massa(rs.getFloat("porcentagem_massa"));
               lista.add(avaliacao);
            }
            rs.close();
            return lista;
         
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
               stmt.close(); 
               connection.close();            
        }
	
    }
	
}
