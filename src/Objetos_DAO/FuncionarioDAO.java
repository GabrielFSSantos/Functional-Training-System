package objetos_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.ConnectionFactory;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Funcionario;

public class FuncionarioDAO {


    public FuncionarioDAO() {
    }
    
    public void adiciona(Funcionario funcionario) throws Exception {
        String sql =    "INSERT INTO public.\"Funcionario\"" +
                        "(nome, \"CPF\", email, telefone, salario, especialidade, senha)" +
                        "values (?,?,?,?,?,?,?)";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(3, funcionario.getEmail());
            stmt.setString(4, funcionario.getTelefone());
            stmt.setFloat(5, funcionario.getSalario());
            stmt.setString(6, funcionario.getEspecialidade());
            stmt.setString(7, "Nenhum");
           
 //         System.out.println(stmt);
            
            stmt.execute();           
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public Funcionario getFuncionario(String CPF) throws Exception {
    	String sql = "SELECT F.*, PG.relname  " +
                     "FROM public.\"Funcionario\" F, pg_class PG " +
                     "WHERE \"CPF\"=? AND F.tableoid = PG.oid  AND pg.relname != 'Funcionario'";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
    	try {
            Funcionario funcionario = null;
             
            stmt.setString(1, CPF);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               funcionario = new Funcionario();
               funcionario.setCPF(rs.getString("CPF"));
               funcionario.setNome(rs.getString("nome"));
               funcionario.setEmail(rs.getString("email"));
               funcionario.setTelefone(rs.getString("telefone"));

               funcionario.setSalario(rs.getFloat("salario"));
               funcionario.setEspecialidade(rs.getString("especialidade"));
               funcionario.setSenha(rs.getString("senha"));
               funcionario.setTipo(rs.getString("relname"));

            }
//            System.out.println(funcionario.getTipo());

            rs.close();

            return funcionario;
             
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    	
    }
    
    public ArrayList<Funcionario> getLista() throws Exception {
        String sql = "SELECT F.*, pg.relname " +
                     "FROM public.\"Funcionario\" F, pg_class PG " +
                     "WHERE F.tableoid = PG.oid AND pg.relname != 'Funcionario'";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            ArrayList<Funcionario> funcionarioes = new ArrayList<Funcionario>();
//          System.out.println(stmt);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	Funcionario funcionario = new Funcionario();
            
            	funcionario.setCPF(rs.getString("CPF"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setTelefone(rs.getString("telefone"));
				    
				funcionario.setSalario(rs.getFloat("salario"));
				funcionario.setEspecialidade(rs.getString("especialidade"));
                                
                                funcionario.setTipo(rs.getString("relname"));

				funcionarioes.add(funcionario);
            }
            rs.close();
            
            return funcionarioes;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void altera(Funcionario funcionario) throws Exception {
        String sql =    "UPDATE public.\"Funcionario\"" +
                        "SET nome=?, " +
                            "email=?, " +
                            "telefone=?," +
                            "salario=?," +
                            "especialidade=?," +
                            "senha=?" + 
                        "WHERE \"CPF\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
  
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEmail());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setFloat(4, funcionario.getSalario());
            stmt.setString(5, funcionario.getEspecialidade());
            if(funcionario.getSenha() != null){
                MessageDigest m = MessageDigest.getInstance("MD5");
                m.update(funcionario.getSenha().getBytes(), 0, funcionario.getSenha().length());        
                stmt.setString(6, new BigInteger(1,m.digest()).toString(16));
            } else
                stmt.setString(6, new FuncionarioDAO().getFuncionario(funcionario.getCPF()).getSenha());
            stmt.setString(7, funcionario.getCPF());
            
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void remove(Funcionario funcionario) throws Exception{
    	String sql =    "DELETE " +
                        "FROM public.\"Funcionario\" " + 
                        "WHERE \"CPF\"=?";    
         
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
    	try {
            stmt.setString(1, funcionario.getCPF());

            stmt.execute();

        } catch(SQLException e){
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
        
    }

}

