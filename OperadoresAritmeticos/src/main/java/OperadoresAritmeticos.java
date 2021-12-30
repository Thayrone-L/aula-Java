/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thayrone
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        int n1=3;
        int n2=5;
        float media=(n1+n2)/2;
        System.out.printf("A media entre %s e %s é %.2f",n1,n2,media);*/
        //pré incremento
        
        
        
        /*
        int  numero=5;
        int valor = 5 + ++numero;
        System.out.println("Pre incremento");
        System.out.println("a variável valor vale: "+valor);
        System.out.println("a variável numero vale: "+numero);
        //pós incremento
        int  numero2=5;
        int valor2 = 5 + numero2++;
        System.out.println("Pós incremento");
        System.out.println("a variável valor 2 vale: "+valor2);
        System.out.println("a variável numero 2 vale: "+numero2);
        
        // O mesmo será válido para o decremento 
        
         int  numero3=5;
        int valor3 = 5 + --numero3;
        System.out.println("Pre decremento");
        System.out.println("a variável valor vale: "+valor3);
        System.out.println("a variável numero vale: "+numero3);
        //pós incremento
        int  numero4=5;
        int valor4 = 5 + numero4--;
        System.out.println("Pos decremento");
        System.out.println("a variável valor 2 vale: "+valor4);
        System.out.println("a variável numero 2 vale: "+numero4);
*/
        
        // Arredondamentos
        float v=8.1f;
        int ar=(int) Math.round(v);
        System.out.println(" 8,1 arredondado (round): "+ar);
        int ac=(int) Math.ceil(v);
        System.out.println(" 8,1 arredondado (ceil): "+ac);
        int af=(int) Math.floor(v);
        System.out.println(" 8,1 arredondado (floor): "+af);
        
        
    }
    
}
