/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.negocio;

import LivrariaProjetoPOO.basica.Livro;
import LivrariaProjetoPOO.interfaces.CrudLivroInterface;
import LivrariaProjetoPOO.repositorio.LivroRepositorio;
import LivrariaProjetoPOO.util.banco.Conexao;
import LivrariaProjetoPOO.validacao.ExceptionMessage.ExceptionMessageLivro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author BrunoTiCaVini
 */
public class LivroNegocio implements CrudLivroInterface{
    
    
    private final LivroRepositorio livrorepositorio;
    
    public LivroNegocio(){
      livrorepositorio = new LivroRepositorio();
    }

    @Override
    public boolean insert(Livro livro) throws SQLException, Exception {
      
          validarAtributos(livro);
          return livrorepositorio.insert(livro); 
          
    }

    @Override
    public boolean update(Livro livro) throws SQLException, Exception {
     return livrorepositorio.update(livro);
    }

    @Override
    public boolean delete(Livro livro) throws SQLException, Exception {
      return livrorepositorio.delete(livro);
    }

    @Override
    public List<Livro> select() throws SQLException, Exception {
       return livrorepositorio.select();
    }

    @Override
    public List<Livro> selectByCodigoLivro(Livro livro) throws SQLException, Exception {
      
        return livrorepositorio.selectByCodigoLivro(livro);
    }

    @Override
    public List<Livro> selectByTitulo(Livro livro) throws SQLException, Exception {
      
        return livrorepositorio.selectByTitulo(livro);
    }

    @Override
    public List<Livro> selectByAutor(Livro livro) throws SQLException, Exception {
       return livrorepositorio.selectByAutor(livro);
    }
    
    
    public boolean validarTituloLivro(Livro livro) throws SQLException, Exception{
    
        if(livro.getTituloLivro()== null) {
          throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_TITULO_NULL);
         }
         if(livro.getTituloLivro().isEmpty()){
          throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_TITULO_VAZIO);
         }
         if(livro.getTituloLivro().length() > 30) {
         throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_TITULO_TAMANHO);
         }
        return true;
    }
    
    public boolean validarAutorLivro(Livro livro) throws SQLException, Exception{
    
       if(livro.getAutorLivro()== null){
       throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_AUTOR_NULL);
       }
       if(livro.getAutorLivro().isEmpty()){
       throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_AUTOR_VAZIO);
       }
        if(livro.getAutorLivro().length() > 30){
       throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_AUTOR_TAM);
       }
       
       return true;
    }
    
    public boolean validarDescricaoLivro(Livro livro) throws SQLException, Exception{
    
        if(livro.getDescricaoLivro()== null){
        throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_DESCRICAO_NULL);
        }
        if(livro.getDescricaoLivro().isEmpty()){
        throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_DESCRICACAO_VAZIO);
        }
        if(livro.getDescricaoLivro().length() > 40){
        throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_DESCRICACAO_TAM);
        }
        
        return true;
    }
    
    public boolean validarCodLivro(Livro livro) throws SQLException, Exception{
    
        if(livro.getCodlivro()== null){
        throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_CODLIVRO_NULL);
        }
        if(livro.getCodlivro().isEmpty()){
        throw new Exception(" ATENÇÃO: " + ExceptionMessageLivro.LIVRO_CODLIVRO_VAZIO);
        }
        
        return true;
    }
    
    public boolean existsCodigo(Livro livro) throws SQLException, Exception{
         return livrorepositorio.existsCodigo(livro);
    }
    public boolean existsTitulo (Livro livro) throws SQLException, Exception{
       return livrorepositorio.existsTitulo(livro);
    }
    
    public void validarAtributos(Livro livro) throws SQLException, Exception{
    
       validarDescricaoLivro(livro);
       validarAutorLivro(livro);
       validarTituloLivro(livro);
       validarCodLivro(livro);
       existsCodigo(livro);
       existsTitulo(livro);
       
    }
     

}
