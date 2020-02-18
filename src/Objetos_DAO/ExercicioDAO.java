package objetos_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import objetos.Exercicio;

public class ExercicioDAO {


    public ExercicioDAO() {

    }

    public void adiciona(Exercicio exercicio) throws Exception {
        String sql = "INSERT INTO public.\"Exercicio\"" +
                         "(nome, \"CPF_Aluno\", repeticao, \"id_Equipamento\")" +
                         "values (?,?,?,?)";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {

            stmt.setString(1,exercicio.getNome());
            stmt.setString(2, exercicio.getAluno().getCPF());
            stmt.setInt(3, exercicio.getRepeticao());                
            if(exercicio.getEquipamento() != null)
                stmt.setInt(4, exercicio.getEquipamento().getId());
            else
                stmt.setNull(4, java.sql.Types.INTEGER);

//            System.out.println(stmt);

            stmt.execute();

        } catch (SQLException e) {
            throw new Exception("Não foi possível inserir o exercício no banco");
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
        
    public Exercicio getExercicio(String nome, String CPF_Aluno) throws Exception{
        String sql =    "SELECT nome, \"CPF_Aluno\", repeticao, \"id_Equipamento\""+
                        "FROM public.\"Exercicio\"" +
                        "WHERE nome=? AND \"CPF_Aluno\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        try {
            Exercicio exercicio = new Exercicio();

            stmt.setString(1, nome);
            stmt.setString(2, CPF_Aluno);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                exercicio.setNome(rs.getString("nome"));
                exercicio.setRepeticao(rs.getInt("repeticao"));
                exercicio.setAluno(new AlunoDAO().getAluno(CPF_Aluno));

                if(rs.getInt("id_Equipamento") >= 0)
                    exercicio.setEquipamento(new Objetos_DAO.EquipamentoDAO().getEquipamento(rs.getInt("id_Equipamento")));             

            }
            rs.close();

            return exercicio;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }


    }

    public ArrayList<Exercicio> getExercicios(String CPF_Aluno) throws Exception{
        String sql =    "SELECT * " +
                        "FROM public.\"Exercicio\" " +
                        "WHERE \"CPF_Aluno\"=?";

        ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {

            stmt.setString(1, CPF_Aluno);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Exercicio exercicio = new Exercicio();
                exercicio.setNome(rs.getString("nome"));
                exercicio.setRepeticao(rs.getInt("repeticao"));
                exercicio.setAluno(new AlunoDAO().getAluno(CPF_Aluno));

                if(rs.getInt("id_Equipamento") >= 0)
                    exercicio.setEquipamento(new Objetos_DAO.EquipamentoDAO().getEquipamento(rs.getInt("id_Equipamento")));

                exercicios.add(exercicio);

            }
            rs.close();

            return exercicios;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }

    public void altera(Exercicio antigo, Exercicio novo) throws Exception {
        String sql =    "UPDATE public.\"Exercicio\""+
                        "SET nome=?, " +
                            "\"CPF_Aluno\"=?, " +
                            "repeticao=?, " +
                            "\"id_Equipamento\"=? " +
                        "WHERE nome=? AND \"CPF_Aluno\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {

            stmt.setString(1,novo.getNome());
            stmt.setString(2, novo.getAluno().getCPF());
            stmt.setInt(3, novo.getRepeticao());
            if(novo.getEquipamento() != null)
                stmt.setInt(4, novo.getEquipamento().getId());
            else
                stmt.setNull(4, java.sql.Types.INTEGER);

            stmt.setString(5,antigo.getNome());
            stmt.setString(6, antigo.getAluno().getCPF());

//                System.out.println(stmt);

            stmt.execute();

        } catch (SQLException e) {
            throw new Exception("Não foi possível alterar o exercício no banco");
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
        
    public void remove(Exercicio exercicio) throws Exception {
        String sql =    "DELETE " + 
                        "FROM public.\"Exercicio\" "+                            
                        "WHERE nome=? AND \"CPF_Aluno\"=?";
        
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        try {

            stmt.setString(1,exercicio.getNome());
            stmt.setString(2, exercicio.getAluno().getCPF());

//            System.out.println(stmt);

            stmt.execute();

        } catch (SQLException e) {
            throw new Exception("Não foi possível excluir o exercício do banco");
        } finally {
            stmt.close(); 
            connection.close();            
        }
    }
      
}
