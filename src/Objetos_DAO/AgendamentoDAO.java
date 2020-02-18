package objetos_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.ConnectionFactory;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import objetos.Agendamento;

public class AgendamentoDAO {

    public AgendamentoDAO() {
          
    }

    public void adiciona( Agendamento agendamento) throws Exception {
        String sql = "INSERT INTO public.\"Agendamento\"" +
                         "(\"CPF_Aluno\", descricao, data_hora)" +
                         "values (?,?,?)";
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            stmt.setString(1,agendamento.getAluno().getCPF());
            stmt.setString(2, agendamento.getDescricao());
            stmt.setTimestamp(3, agendamento.getData_hora());

            System.out.println(stmt);

            stmt.execute();

        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível adicionar o agendamento ao banco");
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    
    public ArrayList<Agendamento> getLista() throws Exception {
        String sql =    "SELECT * " +
                        "FROM public.\"Agendamento\"";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {
            ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento agendamento = new Agendamento();
                
                agendamento.setAluno(new AlunoDAO().getAluno(rs.getString("CPF_Aluno")));
                agendamento.setData_hora(rs.getTimestamp("data_hora"));
                agendamento.setDescricao(rs.getString("descricao"));
                
                agendamentos.add(agendamento);
            }
            rs.close();
            
            return agendamentos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public ArrayList<String> getHorarios(Date data) throws Exception {
        
        String sql =    "SELECT to_char(data_hora, 'HH24:MI') as hora_minuto " +
                        "FROM public.\"Agendamento\"" +
                        "WHERE DATE(data_hora) = ?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            ArrayList<String> horarios = new ArrayList<String>();
           
            stmt.setDate(1, data);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                horarios.add(rs.getString("hora_minuto"));                                        
            }
            rs.close();
            
            return horarios;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public ArrayList<Agendamento> getAgendamentos(Date data) throws Exception {
        
        String sql =    "SELECT * " +
                        "FROM public.\"Agendamento\"" +
                        "WHERE DATE(data_hora) = ?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

            stmt.setDate(1, data);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setAluno(new AlunoDAO().getAluno(rs.getString("CPF_Aluno")));
                agendamento.setData_hora(rs.getTimestamp("data_hora"));
                agendamento.setDescricao(rs.getString("descricao"));
                
                agendamentos.add(agendamento);
            }
            rs.close();
            
            return agendamentos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public Agendamento getAgendamento(String CPF_Aluno, Timestamp data_hora) throws Exception {
        
        String sql =    "SELECT * " +
                        "FROM public.\"Agendamento\"" +
                        "WHERE \"CPF_Aluno\"=? AND data_hora=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            Agendamento agendamento = null;
            
            stmt.setString(1, CPF_Aluno);
            stmt.setTimestamp(2, data_hora);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                agendamento = new Agendamento();
                agendamento.setAluno(new AlunoDAO().getAluno(rs.getString("CPF_Aluno")));
                agendamento.setData_hora(rs.getTimestamp("data_hora"));
                agendamento.setDescricao(rs.getString("descricao"));
            }
            rs.close();
            
            return agendamento;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
    
    public void altera(Agendamento agendamento_antigo, Agendamento agendamento_novo) throws Exception{
        String sql =   " UPDATE public.\"Agendamento\"" +
                        "SET \"CPF_Aluno\"=?, descricao=?, data_hora=?" +
                        "WHERE \"CPF_Aluno\"=? AND data_hora=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        try {
            stmt.setString(1, agendamento_novo.getAluno().getCPF());
            stmt.setString(2, agendamento_novo.getDescricao());
            stmt.setTimestamp(3, agendamento_novo.getData_hora());
            
            stmt.setString(4, agendamento_antigo.getAluno().getCPF());
            stmt.setTimestamp(5, agendamento_antigo.getData_hora());
            System.out.println(stmt);
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
        
    }
    
    
    public void remove(Agendamento agendamento) throws Exception {
    	 String sql =   "DELETE " +
                        "FROM public.\"Agendamento\" " + 
                        "WHERE \"CPF_Aluno\"=? AND data_hora=?" ; 

        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);         
    	
        try {
            stmt.setString(1, agendamento.getAluno().getCPF());
            stmt.setTimestamp(2, agendamento.getData_hora());
            System.out.println(stmt);
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
	
}
