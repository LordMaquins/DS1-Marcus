
package ex05;

import javax.swing.JOptionPane;
public class Teste {
    void areaT () {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        a= a*b/2;
         System.out.println("A área do triângulo é "+ a);
         
         
        
        
        
    }
    
    void Q(){
        int b= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        int h= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        a = b*h;
                System.out.println("A área do quadrado é: "+ a);
        
    }
            
          
        
    
}
