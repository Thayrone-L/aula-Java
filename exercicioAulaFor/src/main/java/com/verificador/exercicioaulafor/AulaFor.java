/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.verificador.exercicioaulafor;
import javax.swing.JOptionPane;
/**
 *
 * @author thayrone
 */
public class AulaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        for(int cc=1; cc<=3; cc++){
        
            n+= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a " + cc +"º nota"));
        
        }
        float media = n/3;
        JOptionPane.showMessageDialog(null,"A media é:" + media);
    }
    
}
