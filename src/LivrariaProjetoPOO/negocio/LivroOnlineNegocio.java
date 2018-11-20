/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.negocio;

import LivrariaProjetoPOO.basica.LivroOnline;
import LivrariaProjetoPOO.interfaces.CrudLivroOnlineInterface;
import LivrariaProjetoPOO.repositorio.LivroOnlineRepositorio;
import LivrariaProjetoPOO.util.banco.Conexao;
import LivrariaProjetoPOO.validacao.ExceptionMessage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class LivroOnlineNegocio implements CrudLivroOnlineInterface{
    
     Conexao conexao = new Conexao();
    
    
     private final LivroOnlineRepositorio livroOnlineRepositorio;
    
     public LivroOnlineNegocio(){
      livroOnlineRepositorio = new LivroOnlineRepositorio();
    }

    @Override
    public boolean insert(LivroOnline livroOnline) throws SQLException, Exception {
         validarAtributosOnline(livroOnline);
         return livroOnlineRepositorio.insert(livroOnline);   
    }

    @Override
    public boolean update(LivroOnline livroOnline) throws SQLException, Exception {
     
        return livroOnlineRepositorio.update(livroOnline);
    }

    @Override
    public boolean delete(LivroOnline livroOnline) throws SQLException, Exception {
       
        return livroOnlineRepositorio.delete(livroOnline);
         
    }

    @Override
    public List<LivroOnline> select() throws SQLException, Exception {
        
        return livroOnlineRepositorio.select();
    }
    
    public boolean validarCodOnlinle(LivroOnline livroOnline) throws SQLException, Exception{
        
        if(livroOnline.getCodlivro() == null){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_CODLIVROONLINE_NULL);
        }
        if(livroOnline.getCodlivro().isEmpty()){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_CODLIVROONLINE_VAZIO);
        }
        
        return true;
    }
    
    public boolean validarTituloLivroOnline(LivroOnline livroOnline) throws SQLException, Exception{
    
    
         if(livroOnline.getTituloLivro()== null) {
          throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_TITULO_NULL);
         }
         if(livroOnline.getTituloLivro().isEmpty()){
          throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_TITULO_VAZIO);
         }
         if(livroOnline.getTituloLivro().length() > 30) {
         throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_TITULO_TAMANHO);
         }
        return true;
    }
    
    public boolean validarAutorLivroOnline(LivroOnline livroOnline) throws SQLException, Exception{
    
       if(livroOnline.getAutorLivro()== null){
       throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_AUTOR_NULL);
       }
       if(livroOnline.getAutorLivro().isEmpty()){
       throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_AUTOR_VAZIO);
       }
       if(livroOnline.getAutorLivro().length() > 30){
       throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_AUTOR_TAM);
       }
       return true;
    }
    
    public boolean validarDescricaoLivroOnline(LivroOnline livroOnline) throws SQLException, Exception{
    
        if(livroOnline.getDescricaoLivro()== null){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_DESCRICAO_NULL);
        }
        if(livroOnline.getDescricaoLivro().isEmpty()){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_DESCRICACAO_VAZIO);
        }
        if(livroOnline.getDescricaoLivro().length() > 40){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVROONLINE_DESCRICACAO_TAM);
        }
        
        return true;
    }
    
    
    public boolean validarSiteLivroOnline(LivroOnline livroOnline) throws SQLException, Exception{
    
        if(livroOnline.getSiteLivro()== null){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVONLINE_SITE_NULL);
        }
        if(livroOnline.getSiteLivro().isEmpty()){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVONLINE_SITE_VAZIO);
        }
        if(livroOnline.getSiteLivro().length() > 80){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVONLINE_SITE_TAM);
        }
        return true;
    }
    
    
    public boolean validarClubeLibroOnline(LivroOnline livroOnline) throws SQLException, Exception{
    
        if(livroOnline.getClubeLivro()== null){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVONLINE_CLUBE_NULL);
        }
        if(livroOnline.getClubeLivro().isEmpty()){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVONLINE_CLUBE_VAZIO);
        }
        if(livroOnline.getClubeLivro().length() > 40){
        throw new Exception(" ATENÇÃO: " + ExceptionMessage.ExceptionMessageLivroOnline.LIVONLINE_CLUBE_TAM);
        }
        return true;
    }
    
   /* public boolean verificarCodigo(LivroOnline livroOnline) throws SQLException, Exception{
    
        for(int i = 0; i < livroOnline.getCodlivro().length(); i++){
        
            
        } 
    
    
        return true;
    }*/
    
  
    
    public void validarAtributosOnline(LivroOnline livroOnline) throws SQLException, Exception{
    
         validarCodOnlinle(livroOnline);
         validarTituloLivroOnline(livroOnline);
         validarAutorLivroOnline(livroOnline);
         validarDescricaoLivroOnline(livroOnline);
         validarSiteLivroOnline(livroOnline);
         validarClubeLibroOnline(livroOnline);
    }
}
