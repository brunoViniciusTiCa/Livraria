/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.fachada;


import LivrariaProjetoPOO.basica.LivroOnline;
import LivrariaProjetoPOO.negocio.LivroOnlineNegocio;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class LivroOnlineFachada {
    
      LivroOnlineNegocio livroonlinenegocio = null;
   
   public boolean salvarLivro(LivroOnline livroOnline)throws SQLException, Exception{
     
       livroonlinenegocio = new LivroOnlineNegocio();
       livroonlinenegocio.insert(livroOnline);
       
       return true;
   }
   
   public boolean alterarLivro(LivroOnline livroOnline) throws SQLException, Exception{
   
       livroonlinenegocio = new LivroOnlineNegocio();
       livroonlinenegocio.update(livroOnline);
       
       return true;
   }
   
   public boolean deleteLivro(LivroOnline livroOnline) throws SQLException, Exception{
   
       livroonlinenegocio = new LivroOnlineNegocio();
       livroonlinenegocio.delete(livroOnline);
       
       return true;
   }
   
   public List<LivroOnline> selecionarLivro() throws SQLException, Exception{
   
      livroonlinenegocio = new LivroOnlineNegocio();
      return livroonlinenegocio.select();
       
   }
    
}
