/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author BrunoTiCaVini
 */
public interface ConexaoInterface {
    
    public Connection Conectar() throws SQLException ;
    public void Desconectar() throws SQLException ;
    
}
