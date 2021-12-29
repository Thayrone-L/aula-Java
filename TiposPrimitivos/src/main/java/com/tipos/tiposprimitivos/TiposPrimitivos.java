/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tipos.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author thayrone
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = entrada.nextLine();
        System.out.println("Digite a nota:");
        float nota= entrada.nextFloat();
        System.out.format(" %s sua nota é %.2f \n\n", nome ,nota);
    }
    
}
