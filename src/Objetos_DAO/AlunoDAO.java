package objetos_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import database.ConnectionFactory;
import objetos.Aluno;

public class AlunoDAO {
	


    public AlunoDAO() {
     
    }
    
    public void adiciona(Aluno aluno) throws Exception {
        String sql = "INSERT INTO public.\"Aluno\"" +
                	 "(nome, \"CPF\", email, telefone, dia_pagamento, sexo, dt_nascimento, imagem, restricao, \"CPF_Nutricionista\" )" +
                	 "values (?,?,?,?,?,?,?,?,?,?)";
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCPF());
            stmt.setString(3, aluno.getEmail());
            stmt.setString(4, aluno.getTelefone());
            stmt.setInt(5, aluno.getDia_pagamento());
            stmt.setString(6, String.valueOf(aluno.getSexo()));
            stmt.setDate(7, aluno.getDt_nascimento());
            stmt.setBytes(8, aluno.getImagem());
            stmt.setString(9, aluno.getRestricao());
            stmt.setString(10, aluno.getNutricionista().getCPF());
            System.out.println(stmt);
            
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close(); 
        }
    }
    
    public Aluno getAluno(String CPF) throws Exception {
    	String sql =    "SELECT * " +
                        "FROM public.\"Aluno\" " +
                        "WHERE \"CPF\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
            Aluno aluno = new Aluno();

            stmt.setString(1, CPF);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                aluno.setCPF(rs.getString("CPF"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTelefone(rs.getString("telefone"));

                aluno.setDia_pagamento(rs.getInt("dia_pagamento"));
                aluno.setSexo(rs.getString("sexo").charAt(0));
                aluno.setDt_nascimento(rs.getDate("dt_nascimento"));
                aluno.setImagem(rs.getBytes("imagem"));
                aluno.setFicha_alimentacao(rs.getString("ficha_alimentacao"));
                aluno.setRestricao(rs.getString("restricao"));

                aluno.setNutricionista(new NutricionistaDAO().getNutricionista(rs.getString("CPF_Nutricionista")));
            }
            rs.close();

            return aluno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }

    }
    
    public ArrayList<Aluno> getLista() throws Exception {
        String sql =    "SELECT * " +
                        "FROM public.\"Aluno\"";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
            
                aluno.setCPF(rs.getString("CPF"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTelefone(rs.getString("telefone"));
                
                aluno.setDia_pagamento(rs.getInt("dia_pagamento"));
                aluno.setSexo(rs.getString("sexo").charAt(0));
                aluno.setDt_nascimento(rs.getDate("dt_nascimento"));
                aluno.setImagem(rs.getBytes("imagem"));
                aluno.setFicha_alimentacao(rs.getString("ficha_alimentacao"));
                aluno.setRestricao(rs.getString("restricao"));
                
                aluno.setNutricionista(new NutricionistaDAO().getNutricionista("CPF_Nutricionista"));

                alunos.add(aluno);
            }
            rs.close();
            
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();   
        }
    }
    
    public void altera(Aluno aluno) throws Exception {
        String sql =    "UPDATE public.\"Aluno\"" +
                        "SET nome=?, " +
                            "email=?, " +
                            "telefone=?," +
                            "dia_pagamento=?," +
                            "sexo=?," +
                            "dt_nascimento=?," +
                            "imagem=?," +
                            "ficha_alimentacao=?," +
                            "restricao=?," +
                            "\"CPF_Nutricionista\"=? " +	        		 
                        "WHERE \"CPF\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
 
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setString(3, aluno.getTelefone());
            stmt.setInt(4, aluno.getDia_pagamento());
            stmt.setString(5, String.valueOf(aluno.getSexo()));
            stmt.setDate(6, aluno.getDt_nascimento());
            stmt.setBytes(7, aluno.getImagem());
            stmt.setString(8, aluno.getFicha_alimentacao());
            stmt.setString(9, aluno.getRestricao());
            if(aluno.getNutricionista() == null)
                stmt.setString(10, null);
            else
                stmt.setString(10, aluno.getNutricionista().getCPF());
            
            stmt.setString(11, aluno.getCPF());
            System.out.println(stmt);
            
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void alteraFicha(Aluno aluno) throws Exception {
        String sql =    "UPDATE public.\"Aluno\"" +
                        "SET ficha_alimentacao=? " +                                    	        		 
                        "WHERE \"CPF\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
 
            stmt.setString(1, aluno.getFicha_alimentacao());            
            stmt.setString(2, aluno.getCPF());
            System.out.println(stmt);
            
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void alteraRestricao(Aluno aluno) throws Exception {
        String sql =    "UPDATE public.\"Aluno\"" +
                        "SET restricao=? " +                                    	        		 
                        "WHERE \"CPF\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
 
            stmt.setString(1, aluno.getRestricao());            
            stmt.setString(2, aluno.getCPF());
            System.out.println(stmt);
            
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void remove(Aluno aluno) throws SQLException {
        String sql =    "DELETE " +
                        "FROM public.\"Aluno\" " + 
                        "WHERE \"CPF\"=?";  
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);   
        
        try{
            stmt.setString(1, aluno.getCPF());
            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }    
}
            
        

