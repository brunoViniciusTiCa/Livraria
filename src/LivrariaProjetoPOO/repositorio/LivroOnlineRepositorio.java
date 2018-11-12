/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.repositorio;

import LivrariaProjetoPOO.basica.Livro;
import LivrariaProjetoPOO.basica.LivroOnline;
import LivrariaProjetoPOO.interfaces.CrudLivroOnlineInterface;
import LivrariaProjetoPOO.util.banco.Conexao;
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
public class LivroOnlineRepositorio implements CrudLivroOnlineInterface{
    
    Conexao conexao = new Conexao();

    @Override
    public boolean insert(LivroOnline livroOnline) throws SQLException, Exception {
        
         conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "INSERT INTO LivroOn (codLivro,tituloLivro,autorLivro,descricaoLivro,siteLivro,clubeLivro) VALUES(?,?,?,?,?,?)";
        
        PreparedStatement preparedstatemente = connection.prepareStatement(sql);
        
        preparedstatemente.setString (1, livroOnline.getCodlivro());
        preparedstatemente.setString (2, livroOnline.getTituloLivro());
        preparedstatemente.setString (3, livroOnline.getAutorLivro());
        preparedstatemente.setString (4, livroOnline.getDescricaoLivro());
        preparedstatemente.setString (5, livroOnline.getSiteLivro());
        preparedstatemente.setString (6, livroOnline.getClubeLivro());
        
        preparedstatemente.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
        
    }

    @Override
    public boolean update(LivroOnline livroOnline) throws SQLException, Exception {
   
        conexao = Conexao.getInstance();
        
        Connection connection = conexao.Conectar();
        
        String sql = "UPDATE LivroOn set codLivro = ?, tituloLivro = ?, autorLivro = ?, descricaoLivro = ?, siteLivro = ?, clubeLivro = ? "
                + " WHERE idLivroOnline = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString    (1, livroOnline.getCodlivro());
        preparedStatement.setString    (2, livroOnline.getTituloLivro());
        preparedStatement.setString    (3, livroOnline.getAutorLivro());
        preparedStatement.setString    (4, livroOnline.getDescricaoLivro());
        preparedStatement.setString    (5, livroOnline.getSiteLivro());
        preparedStatement.setString    (6, livroOnline.getClubeLivro());
        preparedStatement.setInt       (7, livroOnline.getIdLivroOnline());
        
        
        
        preparedStatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }
    

    @Override
    public boolean delete(LivroOnline livroOnline) throws SQLException, Exception {
      
        conexao = Conexao.getInstance();
        Connection connection = conexao.Conectar();
        
        String sql = "DELETE FROM LivroOn WHERE idLivroOnline = ? ";
        
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        
        preparedstatement.setInt(1, livroOnline.getIdLivroOnline());
        
        preparedstatement.executeUpdate();
        
        conexao.Desconectar();
        
        return true;
    }

    @Override
    public List<LivroOnline> select() throws SQLException, Exception {
     
         List<LivroOnline> LivroOnlines = new ArrayList<>();
        
        conexao = Conexao.getInstance();
       
        java.sql.Connection connection = conexao.Conectar();
        
        String sql = "Select * from LivroOn";
        
        PreparedStatement preparedstatement = connection.prepareStatement(sql);

        ResultSet resultLivroOnlie = preparedstatement.executeQuery();
        
        while(resultLivroOnlie.next()) {
          
            LivroOnline L = new LivroOnline();
            
            L.setIdLivroOnline(resultLivroOnlie.getInt("IdLivroOnline"));
            L.setCodlivro(resultLivroOnlie.getString("CodLivro"));
            L.setTituloLivro(resultLivroOnlie.getString("TituloLivro"));
            L.setAutorLivro(resultLivroOnlie.getString("AutorLivro"));
            L.setDescricaoLivro(resultLivroOnlie.getString("DescricaoLivro"));
            L.setSiteLivro(resultLivroOnlie.getString("SiteLivro"));
            L.setClubeLivro(resultLivroOnlie.getString("ClubeLivro"));
            
            LivroOnlines.add(L);
            
        }
        conexao.Desconectar();
        return LivroOnlines; 
    }

    
    
}
