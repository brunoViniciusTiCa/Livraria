/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LivrariaProjetoPOO.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author BrunoTiCaVini
 */
public class Uteis {
    
    private static final String TITULO_INFO = "Informação";
    private static final String TITULO_ERRO = "Error";
    private static final String TITULO_CONF = "Confirmar";
    
    public static void AlertInfo(Component comp , String message){
        
        JOptionPane.showMessageDialog(comp, message , TITULO_INFO, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void AlertError(Component comp , String message){
        
        JOptionPane.showMessageDialog(comp, message , TITULO_ERRO, JOptionPane.ERROR_MESSAGE);
        
    }
    
    public static void AlertInfo(Component comp , String message , String titulo){
        
        JOptionPane.showMessageDialog(comp, message , titulo, JOptionPane.ERROR_MESSAGE);
        
    }
    
    public static void AlertError(Component comp , String message , String titulo){
        
        JOptionPane.showMessageDialog(comp, message , titulo, JOptionPane.ERROR_MESSAGE);
        
    }
    
    public static int ConfirmeDialog(Component component, String message){
         //int re = JOptionPane.showConfirmDialog (null, "Deseja realmente deletar esse autor?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);
         return JOptionPane.showConfirmDialog (null, message ,TITULO_CONF,JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
    public static int ConfirmeDialog(Component component, String message, String titulo){
         return JOptionPane.showConfirmDialog (null, message ,titulo ,JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
    public static String toString(Object object){
        return String.valueOf(object);
    }
    
}
