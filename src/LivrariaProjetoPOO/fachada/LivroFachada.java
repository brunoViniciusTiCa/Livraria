/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.fachada;

import LivrariaProjetoPOO.basica.Livro;
import LivrariaProjetoPOO.negocio.LivroNegocio;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class LivroFachada {

   LivroNegocio livronegocio = null;
   
   public boolean salvarLivro(Livro livro)throws SQLException, Exception{
     
       livronegocio = new LivroNegocio();
       livronegocio.insert(livro);
       
       return true;
   }
   
   public boolean alterarLivro(Livro livro) throws SQLException, Exception{
   
       livronegocio = new LivroNegocio();
       livronegocio.update(livro);
       
       return true;
   }
   
   public boolean deleteLivro(Livro livro) throws SQLException, Exception{
   
       livronegocio = new LivroNegocio();
       livronegocio.delete(livro);
       
       return true;
   }
   
   public List<Livro> selecionarLivro() throws SQLException, Exception{
   
      livronegocio = new LivroNegocio();
      return livronegocio.select();
       
   } 
   
   public boolean selecionarByCodigo(Livro livro) throws SQLException, Exception{
     
       livronegocio = new LivroNegocio();
       livronegocio.selectByCodigoLivro(livro);
       
       return true;
       
       
   }
   
   public boolean selecionarByTitulo(Livro livro) throws SQLException, Exception{
         
       livronegocio = new LivroNegocio();
       livronegocio.selectByTitulo(livro);
       
       return true;
   }
   
   
   
   
   
   
}
