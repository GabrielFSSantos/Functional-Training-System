package Objetos_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.ConnectionFactory;
import java.util.ArrayList;
import objetos.Equipamento;


public class EquipamentoDAO {

	

    public EquipamentoDAO() {
       
    }

    public void adiciona(Equipamento equipamento) throws Exception {
        String sql = "INSERT INTO public.\"Equipamento\"" +
                         "(nome, status, p_manutencao, u_manutencao)" +
                         "values (?,?,?,?)";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {

            //stmt.setInt(1,equipamento.getId());
            stmt.setString(1, equipamento.getNome());
            stmt.setString(2, equipamento.getStatus());
            stmt.setDate(3, equipamento.getP_manutencao());
            stmt.setDate(4, equipamento.getU_manutencao());

            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
	    
    public void remove(Equipamento equipamento) throws Exception {
         String sql =   "DELETE " +
                        "FROM public.\"Equipamento\" " + 
                        "WHERE \"id\"=?";  

        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);         

          try {
              stmt.setInt(1, equipamento.getId());

              stmt.execute();

          } catch (SQLException e) {
              throw new RuntimeException(e);
          } finally {
            stmt.close(); 
            connection.close();            
        }
      }
	    
	    
    public Equipamento getEquipamento(int id) throws Exception {
        String sql = "SELECT * " +
                                 "FROM public.\"Equipamento\"" +
                                 "WHERE \"id\" = ?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
                Equipamento equipamento = new Equipamento();

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                equipamento.setId(rs.getInt("id"));
                equipamento.setNome(rs.getString("nome"));
                equipamento.setStatus(rs.getString("status"));
                equipamento.setP_manutencao(rs.getDate("p_manutencao"));
                equipamento.setU_manutencao(rs.getDate("u_manutencao"));

            }
            rs.close();

            return equipamento;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }

    }
            
    public ArrayList<Equipamento> getLista() throws Exception {
        String sql =    "SELECT * " +
                        "FROM public.\"Equipamento\"";
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Equipamento equipamento = new Equipamento();

                         equipamento.setId(rs.getInt("id"));
                         equipamento.setNome(rs.getString("nome"));
                         equipamento.setStatus(rs.getString("status"));
                         equipamento.setP_manutencao(rs.getDate("p_manutencao"));
                         equipamento.setU_manutencao(rs.getDate("u_manutencao"));

                equipamentos.add(equipamento);
            }
            rs.close();

            return equipamentos;
        } catch (SQLException e) {
           throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void altera(Equipamento equipamento) throws Exception{
        String sql =    "UPDATE public.\"Equipamento\"" +                
                        "SET nome=?, " +
                            "status=?," +
                            "p_manutencao=?," +
                            "u_manutencao=?" +                                             
                        "WHERE \"id\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
                        //stmt.setInt(1,equipamento.getId());
            stmt.setString(1, equipamento.getNome());
            stmt.setString(2, equipamento.getStatus());
            stmt.setDate(3, equipamento.getP_manutencao());
            stmt.setDate(4, equipamento.getU_manutencao());
                    
                    stmt.setInt(5, equipamento.getId());
            System.out.println(stmt);
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }

	
}
