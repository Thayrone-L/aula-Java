/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresaula14;

import java.util.Scanner;

/**
 *
 * @author thayrone
 */
public class AulaVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite q a quantidade de notas");
        int limite =Integer.parseInt(teclado.nextLine());
        int totalNotas=0;
        int n[] = new int[limite];
        int cont = 1;
        for(int i=0; i<=n.length-1;i++){
            
            System.out.println("Digite a "+ cont +"º nota");
            n[i] = Integer.parseInt(teclado.nextLine());
            cont++;
             totalNotas+=n[i]; 
        }
    
    
        float media = totalNotas/n.length;
        System.out.println("A media entre as " + Integer.toString(cont-1) + "notas foi: " + media);
        
    }
    
}
