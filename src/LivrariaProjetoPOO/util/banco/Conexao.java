/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.util.banco;

import LivrariaProjetoPOO.interfaces.ConexaoInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author BrunoTiCaVini
 */
public class Conexao implements ConexaoInterface {
    
    private  final String  URL_BD;
    private  final String  USUARIO_BD;
    private  final String  SENHA_BD;
    private static Conexao instancia;
    private Connection conexaoBd;
    
 public Conexao() {
        //ResourceBundle rb = ResourceBundle.getBundle("burgueriarafael.util.banco.configDB");
        URL_BD = "jdbc:mysql://localhost:3306/LivrariaPOO";
        USUARIO_BD = "root";
        SENHA_BD = ""; 
    }

    public static Conexao getInstance(){
        if(instancia == null){
           instancia = new Conexao();
        }
        return instancia;
    }

    
    @Override
    public Connection Conectar() throws SQLException {
        
        //zerando a variavel de conexao
        conexaoBd = null;
        //Estabelecendo a conexao como banco de dados
        conexaoBd = DriverManager.getConnection(URL_BD, USUARIO_BD, SENHA_BD);
        
        return conexaoBd;
    }

    @Override
    public void Desconectar() throws SQLException {
        if(conexaoBd!=null){
            conexaoBd.close();
        }
    }
    
}
