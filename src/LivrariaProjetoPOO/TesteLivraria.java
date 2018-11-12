/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO;


import LivrariaProjetoPOO.basica.Livro;
import LivrariaProjetoPOO.basica.LivroOnline;
import LivrariaProjetoPOO.repositorio.LivroOnlineRepositorio;
import LivrariaProjetoPOO.repositorio.LivroRepositorio;
import LivrariaProjetoPOO.util.banco.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author BrunoTiCaVini
 */
public class TesteLivraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        //testeBD();
        
        //Livro Físico
        //incluirLivro();
        //alterarLivro();
        //excluirLivro();
        //selecionarLivro();
        //selecionarCodigoLivro();
        //selecionarLivroTitulo();
        //selecionarLivroAutor();
        
        
        // Livro Online
        //inserirLivroOn();
        //alterarLivroOnline();
        //deletarLivroOnline();
        //selecionarLivroOnline();
        
        
        
    }
    
    
       public static void incluirLivro() throws SQLException, Exception{
                Connection con = null;
                Conexao conexao;
                conexao = Conexao.getInstance();

                LivroRepositorio livroRep = new LivroRepositorio();
                Livro livro = new Livro();

                livro.setCodlivro("123");
                livro.setTituloLivro("Aprendendo Java!");
                livro.setAutorLivro("Hemir");
                livro.setDescricaoLivro("Aprenda Java Explicado");

                try {
                   livroRep.insert(livro); 
                   System.out.println("Inseriu Livro");
                }
                catch (Exception ex){
                  System.out.println("Não inseriu Livro");
                }
        
       }
       
        public static void alterarLivro() throws SQLException, Exception{
            
             Connection con =  null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             LivroRepositorio livroRep = new LivroRepositorio();
             Livro livro = new Livro();
             
             livro.setIdLivro(1);
             livro.setCodlivro("0023");
             livro.setTituloLivro("Programação OO");
             livro.setAutorLivro("Bruno Vinicius");
             livro.setDescricaoLivro("Excelente qualidade!");
             
             try {
                livroRep.update(livro);
                 System.out.println("Livro Alterado com sucesso!");
             }
             catch(Exception ex){
                 System.out.println("Livro não foi alterado!");
             }
             
             
        }
        
        public static void excluirLivro() throws SQLException, Exception{
        
             Connection con =  null;
             Conexao conexao;
             conexao = Conexao.getInstance();
        
             LivroRepositorio livroRep = new LivroRepositorio();
             Livro livro = new Livro();
             
             livro.setIdLivro(2);
           
             try {
                livroRep.delete(livro);
                 System.out.println("Livro Deletado com sucesso!");
             }
             catch(Exception ex){
                 System.out.println("Livro não Deletado!");
             }
        
        }
        
        public static void selecionarLivro() throws SQLException, Exception{
        
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            LivroRepositorio livroRep = new LivroRepositorio();
            Livro livro = new Livro();
            
            livro.setIdLivro(1);
            
            try {
                livroRep.select();
                System.out.println("Livro Selecionado");
            }
            catch(Exception ex){
                System.out.println("Livro não Selecionado");
            }
        
        
        
        }
        
        public static void selecionarCodigoLivro() throws SQLException, Exception{
           
              Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            LivroRepositorio livroRep = new LivroRepositorio();
            Livro livro = new Livro();
            
            livro.setCodlivro("123");
            
            try {
                livroRep.selectByCodigoLivro(livro);
                System.out.println("Livro Selecionado pelo Codigo");
            }
            catch(Exception ex){
                System.out.println("Livro não Selecionado pelo codigo");
            }
             
            
        }
        
        public static void selecionarLivroTitulo() throws SQLException, Exception{
           
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            LivroRepositorio livroRep = new LivroRepositorio();
            Livro livro = new Livro();
            
            livro.setTituloLivro("Aprendendo Java");
            
            try {
                livroRep.selectByTitulo(livro);
                System.out.println("Livro Selecionado pelo Titulo");
            }
            catch(Exception ex){
                System.out.println("Livro não Selecionado pelo Titulo");
            }
             
            
        }
        
        public static void selecionarLivroAutor() throws SQLException, Exception{
           
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            LivroRepositorio livroRep = new LivroRepositorio();
            Livro livro = new Livro();
            
            livro.setAutorLivro("Hemir");
            
            try {
                livroRep.selectByAutor(livro);
                System.out.println("Livro Selecionado pelo Autor");
            }
            catch(Exception ex){
                System.out.println("Livro não Selecionado pelo Autor");
            }
             
            
        }
    
        public static void testeBD(){
        Connection con = null;
        Conexao conexao;
        conexao = Conexao.getInstance();
        
        try{
        con = conexao.Conectar();
            System.out.println("Conectou");
            
        conexao.Desconectar();
            System.out.println("desconectou");
        
        }
        catch(Exception ex) {
            System.out.println("Falhou");
       
        }
    }
        
    public static void inserirLivroOn() throws SQLException, Exception{
    
    
                Connection con = null;
                Conexao conexao;
                conexao = Conexao.getInstance();

                LivroOnlineRepositorio livroOnRep = new LivroOnlineRepositorio();
                LivroOnline livroOnline = new LivroOnline();

                livroOnline.setCodlivro("123");
                livroOnline.setTituloLivro("Aprendendo Java!");
                livroOnline.setAutorLivro("Hemir");
                livroOnline.setDescricaoLivro("Aprenda Java Explicado");
                livroOnline.setSiteLivro("www.livroOnline.com");
                livroOnline.setClubeLivro("Meu Clube");
                

                try {
                   livroOnRep.insert(livroOnline);  
                   System.out.println("Inseriu Livro Online");
                }
                catch (Exception ex){
                  System.out.println("Não inseriu Livro Online");
                }
    }
    
    
    public static void alterarLivroOnline() throws SQLException, Exception{
            
             Connection con =  null;
             Conexao conexao;
             conexao = Conexao.getInstance();
             
             LivroOnlineRepositorio livroOnlieRep = new LivroOnlineRepositorio();
             LivroOnline livroOnline = new LivroOnline();
             
             livroOnline.setIdLivroOnline(1);
             livroOnline.setCodlivro("0023");
             livroOnline.setTituloLivro("Programação OO");
             livroOnline.setAutorLivro("Bruno Vinicius");
             livroOnline.setDescricaoLivro("Excelente qualidade!");
             livroOnline.setSiteLivro("www.google.com");
             livroOnline.setClubeLivro("Para amigos");
             
             try {
                livroOnlieRep.update(livroOnline);
                 System.out.println("Livro Onlinle Alterado com sucesso!");
             }
             catch(Exception ex){
                 System.out.println("Livro Online não foi alterado!");
             }
        }
    
    public static void deletarLivroOnline() throws SQLException, Exception{
     
                Connection con = null;
                Conexao conexao;
                conexao = Conexao.getInstance();
                
                LivroOnlineRepositorio livroOnline = new LivroOnlineRepositorio();
                LivroOnline livroOn = new LivroOnline();
                
                livroOn.setIdLivroOnline(1);
                
                try {
                  livroOnline.delete(livroOn);
                    System.out.println("Livro Online Deletado com Sucesso!");
                }
                catch(Exception ex){
                    System.out.println("Livro Online não foi Deletado!");
                }
    }
    
    
    public static void selecionarLivroOnline() throws SQLException, Exception{
    
    
            Connection con = null;
            Conexao conexao;
            conexao = Conexao.getInstance();
            
            LivroOnlineRepositorio livroRepOnline = new LivroOnlineRepositorio();
            LivroOnline livroOn = new LivroOnline();
            
            livroOn.setIdLivroOnline(2);
            
            try {
                livroRepOnline.select();
                System.out.println("LivroOnline Selecionado!");
            }
            catch(Exception ex){
                System.out.println("LivroOnline não Selecionado!");
            }
        }
}
    

