/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.interfaces;

import LivrariaProjetoPOO.basica.Livro;
import LivrariaProjetoPOO.basica.LivroOnline;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public interface CrudLivroOnlineInterface {
    
    public boolean insert (LivroOnline livroOnline) throws SQLException, Exception;
    
    public boolean update (LivroOnline livroOnline) throws SQLException, Exception;
    
    public boolean delete (LivroOnline livroOnline) throws SQLException, Exception;
    
    public List<LivroOnline> select() throws SQLException, Exception;   
    
    
    
}
