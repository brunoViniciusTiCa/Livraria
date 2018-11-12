/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.repositorio;



import LivrariaProjetoPOO.basica.Livro;
import LivrariaProjetoPOO.interfaces.CrudLivroInterface;
import LivrariaProjetoPOO.util.banco.Conexao;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class LivroRepositorio implements CrudLivroInterface{
    
         Conexao conexao = new Conexao();
    
    
    @Override
    public boolean insert(Livro livro) throws SQLException, Exception {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "INSERT INTO livros (codLivro,tituloLivro,autorLivro,descricaoLivro) VALUES(?,?,?,?)";
        
        PreparedStatement preparedstatemente = connection.prepareStatement(sql);
       
        
        preparedstatemente.setString (1, livro.getCodlivro());
        preparedstatemente.setString (2, livro.getTituloLivro());
        preparedstatemente.setString (3, livro.getAutorLivro());
        preparedstatemente.setString (4, livro.getDescricaoLivro());
        
        preparedstatemente.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }
    
     @Override
    public boolean update(Livro livro) throws SQLException, Exception {
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "UPDATE livros set codLivro = ?, tituloLivro = ?, autorLivro = ?, descricaoLivro = ? "
                + " WHERE idLivro = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString(1, livro.getCodlivro());
        preparedStatement.setString(2, livro.getTituloLivro());
        preparedStatement.setString(3, livro.getAutorLivro());
        preparedStatement.setString(4, livro.getDescricaoLivro());
        preparedStatement.setInt(5, livro.getIdLivro());
        
        
        preparedStatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public boolean delete(Livro livro) throws SQLException, Exception {
         
        conexao.Conectar();
        
        Connection connection = conexao.Conectar();
        
        String sql = "DELETE FROM livros WHERE idLivro = ?";
         
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setInt(1, livro.getIdLivro());
        
        preparedStatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;        
        
    }

    

    @Override
    public List<Livro> select() throws SQLException, Exception {
        
       List<Livro> Livros = new ArrayList<>();
        
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from livros";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);

        ResultSet resultLivro = preparedstatement.executeQuery();
        
        while(resultLivro.next()) {
          
            Livro L = new Livro();
            
            L.setIdLivro(resultLivro.getInt("IdLivro"));
            L.setCodlivro(resultLivro.getString("CodLivro"));
            L.setTituloLivro(resultLivro.getString("TituloLivro"));
            L.setAutorLivro(resultLivro.getString("AutorLivro"));
            L.setDescricaoLivro(resultLivro.getString("DescricaoLivro"));
            
            Livros.add(L);
            
        }
        conexao.Desconectar();
        return Livros; 
       
    }

    @Override
    public List<Livro> selectByCodigoLivro(Livro livro) throws SQLException, Exception {
       
        List<Livro> Livros = new ArrayList<>();
       
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from livros WHERE codLivro = ? ";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setString(1, livro.getCodlivro());

        ResultSet resultLivros = preparedstatement.executeQuery();
        
        while(resultLivros.next()) {
          
            Livro L = new Livro();
            
            L.setIdLivro(resultLivros.getInt("IdLivro"));
            L.setCodlivro(resultLivros.getString("CodLivro"));
            L.setTituloLivro(resultLivros.getString("TituloLivro"));
            L.setAutorLivro(resultLivros.getString("AutorLivro"));
            L.setDescricaoLivro(resultLivros.getString("DescricaoLivro"));
            
            Livros.add(L);
            
        }
        conexao.Desconectar();
        return Livros;
    }

    @Override
    public List<Livro> selectByTitulo(Livro livro) throws SQLException, Exception {
   
           List<Livro> Livros = new ArrayList<>();
       
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from livros WHERE tituloLivro = ? ";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setString(1, livro.getTituloLivro());

        ResultSet resultLivros = preparedstatement.executeQuery();
        
        while(resultLivros.next()) {
          
            Livro L = new Livro();
            
            L.setIdLivro(resultLivros.getInt("IdLivro"));
            L.setCodlivro(resultLivros.getString("CodLivro"));
            L.setTituloLivro(resultLivros.getString("TituloLivro"));
            L.setAutorLivro(resultLivros.getString("AutorLivro"));
            L.setDescricaoLivro(resultLivros.getString("DescricaoLivro"));
            
            Livros.add(L);
            
        }
        conexao.Desconectar();
        return Livros;        
    }

    @Override
    public List<Livro> selectByAutor(Livro livro) throws SQLException, Exception {
    
        
           List<Livro> Livros = new ArrayList<>();
       
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from livros WHERE autorLivro = ? ";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setString(1, livro.getAutorLivro());

        ResultSet resultLivros = preparedstatement.executeQuery();
        
        while(resultLivros.next()) {
          
            Livro L = new Livro();
            
            L.setIdLivro(resultLivros.getInt("IdLivro"));
            L.setCodlivro(resultLivros.getString("CodLivro"));
            L.setTituloLivro(resultLivros.getString("TituloLivro"));
            L.setAutorLivro(resultLivros.getString("AutorLivro"));
            L.setDescricaoLivro(resultLivros.getString("DescricaoLivro"));
            
            Livros.add(L);
            
        }
        conexao.Desconectar();
        return Livros; 
    }
    
      public boolean isCodExistente(Livro livro) throws SQLException, Exception {
        boolean exists = false;
        
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "SELECT codLivro FROM livros WHERE codLivro = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, livro.getCodlivro());

        ResultSet resultLivro = preparedStatement.executeQuery();
        if (!resultLivro.next()) {
            if (resultLivro.getString("Codigo Livro") != null) {
               
                exists = true;
            }
        }

        conexao.Desconectar();
        return exists;
    }

   
}
