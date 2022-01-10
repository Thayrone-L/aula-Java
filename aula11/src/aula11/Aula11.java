/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

/**
 *
 * @author thayrone
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cc=1;
        
        while(cc<=10){
             cc++;
            if(cc==3 || cc==7){
               
                continue;
            
            }else if(cc==9){
                
                break;
            }
        
            System.out.println("Cambalhota: " + cc);
            
        }
        
        System.out.println("Aqui já é fora do laço");
                
    }
    
}
