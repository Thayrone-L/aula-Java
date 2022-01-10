/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepitaaula12;
import javax.swing.JOptionPane;
/**
 *
 * @author thayrone
 */
public class ExercicioRepitaAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, pares=0, impares=0, soma=0,cont=0, acem=0, media;

        do{
            
            
        n= Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe o numero: <br><em>(valor 0 interrompe)</em></br></html>"));
        if(n>=100){
        acem++;
        }
        if(n%2==0){
        pares++;
        }else{
        impares++;
        }
         soma += n;
         cont++;
        
        }while(n!=0);
        media=soma/cont;
        JOptionPane.showMessageDialog(null,"<html>A soma dos valores é <strong>" + soma + "</strong><br> A media dos Valores é "+ media+"<br>Pares: "+ pares+" <br>Impares: "+ impares+ "<br> Maiores que 100: "+ acem+ "<br> A quantidade é "+ n+"</html>");
        
    }
}
