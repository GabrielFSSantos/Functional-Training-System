package objetos_dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.ConnectionFactory;
import objetos.Gastos;

public class GastosDAO {


    public GastosDAO() {
       
    }
	
    public void adiciona(Gastos gasto) throws Exception {
        String sql =    "INSERT INTO public.\"Gastos\"" +
                        "(valor, data, descricao, \"CPF_Funcionario\")" +
                        "values (?,?,?,?)";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {

            stmt.setFloat(1, gasto.getValor());
            stmt.setDate(2, gasto.getData());
            stmt.setString(3, gasto.getDescricao());
            stmt.setString(4, gasto.getFuncionario().getCPF());
           
//            System.out.println(stmt);
            
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void remove(Gastos gasto) throws Exception {
        String sql =   "DELETE " +
                        "FROM public.\"Gastos\" " + 
                        "WHERE \"id\"=?";

        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);         
      	
        try {
            stmt.setInt(1, gasto.getId());
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
      }
	
    public ArrayList<Gastos> getGastos(String CPF_Funcionario) throws Exception {

        String sql =    "SELECT * " +
                        "FROM public.\"Gastos\"" +
                        "WHERE \"CPF_Funcionario\" = ?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        try {
            ArrayList<Gastos>lista = new ArrayList();

            stmt.setString(1, CPF_Funcionario);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Gastos gasto = new Gastos();

                gasto.setId(rs.getInt("Id"));
                gasto.setValor(rs.getFloat("Valor"));
                gasto.setData(rs.getDate("data"));
                gasto.setDescricao(rs.getString("descricao"));
                gasto.setFuncionario(new FuncionarioDAO().getFuncionario(rs.getString("CPF_Funcionario")));
                
                lista.add(gasto);
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
	
    public ArrayList<Gastos> getGastos(Date data) throws Exception {

        String sql = "SELECT * " +
                         "FROM public.\"Gastos\"" +
                         "WHERE \"data\" = ?";

        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        ArrayList<Gastos>lista=new ArrayList();

        try {
            Gastos gasto = new Gastos();
            
            stmt.setDate(1, data);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                gasto.setId(rs.getInt("Id"));
               gasto.setValor(rs.getFloat("Valor"));
                gasto.setData(rs.getDate("data"));
                gasto.setDescricao(rs.getString("descricao"));
                gasto.getFuncionario().setCPF(rs.getString("CPF_Funcionario"));
                lista.add(gasto);
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
    
    public ArrayList<Gastos> getLista() throws Exception {

        String sql =    "SELECT * " +
                        "FROM public.\"Gastos\"" ;
                        
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        try {
            ArrayList<Gastos>lista = new ArrayList();

            //stmt.setString(1, CPF_Funcionario);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Gastos gasto = new Gastos();

                gasto.setId(rs.getInt("Id"));
                gasto.setValor(rs.getFloat("Valor"));
                gasto.setData(rs.getDate("data"));
                gasto.setDescricao(rs.getString("descricao"));
                gasto.setFuncionario(new FuncionarioDAO().getFuncionario(rs.getString("CPF_Funcionario")));
                
                lista.add(gasto);
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
    
    public Gastos getGasto(int id) throws Exception {
    	String sql =    "SELECT * " +
                        "FROM public.\"Gastos\"" +
                        "WHERE \"id\" = ?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
    	try {
            Gastos gasto = new Gastos();
             
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                gasto.setId(rs.getInt("Id"));
                gasto.setValor(rs.getFloat("Valor"));
                gasto.setData(rs.getDate("data"));
                gasto.setDescricao(rs.getString("descricao"));
                gasto.setFuncionario(new FuncionarioDAO().getFuncionario(rs.getString("CPF_Funcionario")));

            }
            rs.close();

            return gasto;
             
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public ArrayList<Gastos> getGastos(int mes, int ano) throws Exception {

        String sql =    "SELECT * " +
                        "FROM public.\"Gastos\" GA " +
                        "WHERE to_char(GA.data, 'MM')=? AND to_char(GA.data, 'YYYY')=? ";
                        
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        try {
            ArrayList<Gastos>lista = new ArrayList();

            stmt.setString(1, String.valueOf(mes));
            stmt.setString(2, String.valueOf(ano));
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Gastos gasto = new Gastos();

                gasto.setId(rs.getInt("id"));
                gasto.setValor(rs.getFloat("Valor"));
                gasto.setData(rs.getDate("data"));
                gasto.setDescricao(rs.getString("descricao"));
                gasto.setFuncionario(new FuncionarioDAO().getFuncionario(rs.getString("CPF_Funcionario")));
                
                lista.add(gasto);
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
    
    public ArrayList<Gastos> getGastos(int ano) throws Exception {

        String sql =    "SELECT * " +
                        "FROM public.\"Gastos\" GA " +
                        "WHERE to_char(GA.data, 'YYYY')=? ";
                        
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        try {
            ArrayList<Gastos>lista = new ArrayList();

            stmt.setString(1, String.valueOf(ano));
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Gastos gasto = new Gastos();

                gasto.setId(rs.getInt("id"));
                gasto.setValor(rs.getFloat("Valor"));
                gasto.setData(rs.getDate("data"));
                gasto.setDescricao(rs.getString("descricao"));
                gasto.setFuncionario(new FuncionarioDAO().getFuncionario(rs.getString("CPF_Funcionario")));
                
                lista.add(gasto);
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
