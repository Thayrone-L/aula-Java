/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somaaula12;

import java.util.Scanner;

/**
 *
 * @author thayrone
 */
public class SomaAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero: ");
            n=teclado.nextInt();
            s+=n;
            System.out.println("Quer continhuar?");
            resp = teclado.next();        
        
        }while(resp.equals("S"));
        
        System.out.println("Asoma de todos os valores é: "+s);
        
    }
    
}
