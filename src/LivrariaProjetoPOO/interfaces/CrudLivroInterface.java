/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.interfaces;



import LivrariaProjetoPOO.basica.Livro;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudLivroInterface {
    
    public boolean insert(Livro livro) throws SQLException, Exception;
    
    public boolean update(Livro livro) throws SQLException, Exception;
    
    public boolean delete(Livro livro) throws SQLException, Exception;

    public List<Livro> select() throws SQLException, Exception;   
    
    public List<Livro> selectByCodigoLivro(Livro livro) throws SQLException, Exception;
    
    public List<Livro> selectByTitulo(Livro livro) throws SQLException, Exception;
   
    public List<Livro> selectByAutor(Livro livro) throws SQLException, Exception;
    
}
