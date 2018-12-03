/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.validacao;

import LivrariaProjetoPOO.basica.Livro;
import java.sql.SQLException;

/**
 *
 * @author BrunoTiCaVini
 */
public interface ExceptionMessage{
    
    public interface ExceptionMessageLivro{
        
        
        public final static String LIVRO_JA_CADASTRADO = "Livro não pode ser cadastrado, Codigo já existe!";
        
        public final static String LIVRO_TITULO_CADASTRADO = "Livro não pode ser cadastrado, Titulo já existe!";
        
        public final static String LIVRO_CODLIVRO_NULL = " Cod do livro nulo, cadastrar corretamente. ";
        
        public final static String LIVRO_CODLIVRO_VAZIO = " Cod do livro vazio, cadastrar corretamente. ";
        
        
        
        public final static String LIVRO_TITULO_NULL = "Titulo do livro nulo, cadastrar corretamente.";
        
        public final static String LIVRO_TITULO_VAZIO = "Titulo do livro vazio, cadastrar corretamente.";
        
        public final static String LIVRO_TITULO_TAMANHO = "Titulo do livro é maior que o permitido. Permitido até 30 caracteres";
        
    
        
        public final static String LIVRO_AUTOR_NULL = "Autor do livro nulo, cadastrar corretamente.";
        
        public final static String LIVRO_AUTOR_VAZIO = "Autor do livro vazio, cadastrar corretamente."; 
        
        public final static String LIVRO_AUTOR_TAM = "Autor do livro passou o tamanho permitido. Permitido até 30 caracteres"; 
        
        
        
        public final static String LIVRO_DESCRICAO_NULL = "Descrição do livro nulo, cadastrar corretamente.";
        
        public final static String LIVRO_DESCRICACAO_VAZIO = "Descrição do livro vazio, cadastrar corretamente."; 
       
        public final static String LIVRO_DESCRICACAO_TAM = "Descrição do livro passou o tamanho permitido. Permitido até 40 caracteres"; 
    }
    
    
   public interface ExceptionMessageLivroOnline{
   
   
        public final static String LIVROONLINE_JA_CADASTRADO = "LivroOnline não pode ser cadastrado, já existe este livro!";
        
        public final static String LIVROONLINE_CODLIVROONLINE_NULL = " Cod do LivroOnline nulo, cadastrar corretamente. ";
        
        public final static String LIVROONLINE_CODLIVROONLINE_VAZIO = " Cod do LivroOnline vazio, cadastrar corretamente. ";
        
        
        
        public final static String LIVROONLINE_TITULO_NULL = "Titulo do LivroOnline nulo, cadastrar corretamente.";
        
        public final static String LIVROONLINE_TITULO_VAZIO = "Titulo do LivroOnline vazio, cadastrar corretamente.";
        
        public final static String LIVROONLINE_TITULO_TAMANHO = "Titulo do LivroOnline é maior que o permitido. Permitido até 30 caracteres";
        
    
        
        public final static String LIVROONLINE_AUTOR_NULL = "Autor do LivroOnline nulo, cadastrar corretamente.";
        
        public final static String LIVROONLINE_AUTOR_VAZIO = "Autor do LivroOnline vazio, cadastrar corretamente."; 
        
        public final static String LIVROONLINE_AUTOR_TAM = "Autor do LivroOnline passou o tamanho permitido. Permitido até 30 caracteres"; 
        
        
        
        public final static String LIVROONLINE_DESCRICAO_NULL = "Descrição do LivroOnline nulo, cadastrar corretamente.";
        
        public final static String LIVROONLINE_DESCRICACAO_VAZIO = "Descrição do LivroOnline vazio, cadastrar corretamente."; 
       
        public final static String LIVROONLINE_DESCRICACAO_TAM = "Descrição do LivroOnline passou o tamanho permitido. Permitido até 40 caracteres";
       
       
        public final static String LIVONLINE_SITE_NULL = "Site do LivroOnline nulo, cadastre corretamente.";
        
        public final static String LIVONLINE_SITE_VAZIO = "Site do LivroOnline vazio, cadastre corretamente.";
        
        public final static String LIVONLINE_SITE_TAM =  " Tamanho do site do LivroOnline maior que o permitido, cadastre corretamente. Permitido até 80 caracteres";
   
        
        public final static String LIVONLINE_CLUBE_NULL = "Clube do LivroOnline nulo, cadastre corretamente.";
        
        public final static String LIVONLINE_CLUBE_VAZIO = "Clube do LivroOnline vazio, cadastre corretamente.";
        
        public final static String LIVONLINE_CLUBE_TAM =  " Tamanho do clube do LivroOnline maior que o permitido, cadastre corretamente. Permitido até 40 caracteres";
   } 
    
    
}
