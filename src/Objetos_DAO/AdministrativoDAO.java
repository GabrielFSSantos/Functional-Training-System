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
import objetos.Administrativo;
import objetos.Funcionario;

public class AdministrativoDAO {

    public AdministrativoDAO() {

    }
    
    

    public void adiciona(Administrativo administrativo) throws Exception {
        String sql =    "INSERT INTO public.\"Administrativo\"" +
                        "(nome, \"CPF\", email, telefone, salario, especialidade, senha)" +
                        "values (?,?,?,?,?,?,?)";
       
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            stmt.setString(1, administrativo.getNome());
            stmt.setString(2, administrativo.getCPF());
            stmt.setString(3, administrativo.getEmail());
            stmt.setString(4, administrativo.getTelefone());
            stmt.setFloat(5, administrativo.getSalario());
            stmt.setString(6, administrativo.getEspecialidade()); 
            
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(administrativo.getSenha().getBytes(), 0, administrativo.getSenha().length());        
            stmt.setString(7, new BigInteger(1,m.digest()).toString(16));
 //         System.out.println(stmt);
            
            stmt.execute();
     
            new FuncionarioDAO().adiciona((Funcionario)administrativo);
            
        } catch (SQLException e) {
            throw new Exception("Não foi possível cadastrar o Administrador no banco");
        } catch (NoSuchAlgorithmException ex) {
            throw new Exception("Encriptação da senha falhou");
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public Administrativo getAdministrativo(String CPF) throws Exception {
    	String sql =    "SELECT * " +
                        "FROM public.\"Administrativo\" " +
                        "WHERE \"CPF\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
    	 try {
            Administrativo administrativo = new Administrativo();

            stmt.setString(1, CPF);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                administrativo.setCPF(rs.getString("CPF"));
                administrativo.setNome(rs.getString("nome"));
                administrativo.setEmail(rs.getString("email"));
                administrativo.setTelefone(rs.getString("telefone"));

                administrativo.setSalario(rs.getFloat("salario"));
                administrativo.setEspecialidade(rs.getString("especialidade"));
                administrativo.setSenha(rs.getString("senha"));

            }
            rs.close();
            stmt.close();

            return administrativo;

        } catch (SQLException e) {
            throw new Exception("Administrador não encontrado");
        } finally {
            stmt.close(); 
            connection.close();  
        }
    }
    
    public ArrayList<Administrativo> getLista() throws Exception {
        String sql =    "SELECT * "+
                        "FROM public.\"Administrativo\"";   
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	Administrativo administrativo = new Administrativo();
            
            	administrativo.setCPF(rs.getString("CPF"));
                administrativo.setNome(rs.getString("nome"));
                administrativo.setEmail(rs.getString("email"));
                administrativo.setTelefone(rs.getString("telefone"));

                administrativo.setSalario(rs.getFloat("salario"));
                administrativo.setEspecialidade(rs.getString("especialidade"));
                administrativo.setSenha(rs.getString("senha"));

                administrativos.add(administrativo);
            }
            rs.close();
            stmt.close();
            
            return administrativos;
            
        } catch (SQLException e) {
            throw new Exception("Não foi possível recuperar os administradores");
        } finally {
            stmt.close(); 
            connection.close();  
        }
    }
    
    public void altera(Administrativo administrativo) throws Exception{
        
        new FuncionarioDAO().altera((Funcionario)administrativo);
        
//        String sql = "UPDATE public.\"Administrativo\"" +
//	        		 "SET nome=?, " +
//	        		 	"email=?, " +
//	        		 	"telefone=?," +
//	        		 	"salario=?," +
//	        		 	"especialidade=?," +
//                                        "senha=?" +                
//	        		 "WHERE \"CPF\"=?";
//        try {
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            
//            stmt.setString(1, administrativo.getNome());
//            stmt.setString(2, administrativo.getEmail());
//            stmt.setString(3, administrativo.getTelefone());
//            stmt.setFloat(4, administrativo.getSalario());
//            stmt.setString(5, administrativo.getEspecialidade());
//            
//            MessageDigest m = MessageDigest.getInstance("MD5");
//            m.update(administrativo.getSenha().getBytes(), 0, administrativo.getSenha().length());        
//            stmt.setString(6, new BigInteger(1,m.digest()).toString(16));
//            
//            stmt.setString(7, administrativo.getCPF());
//            
//            stmt.execute();
//            stmt.close();
//            
//            new FuncionarioDAO().altera((Funcionario)administrativo);
//            
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }   catch (NoSuchAlgorithmException ex) {
//                Logger.getLogger(AdministrativoDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
    }
    
    public void remove(Administrativo administrativo) throws Exception {
    	 
        new FuncionarioDAO().remove((Funcionario)administrativo);
        
    }
}

