
package ex05;

import javax.swing.JOptionPane;


public class Ex05 {

   
    public static void main(String[]args){
        
        try{
        int b= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        int h= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
        
       int areaQ = b*h;
                JOptionPane.showMessageDialog(null, "O valor da área do quadrado é :" + areaQ);
                
                if(areaQ<0){
                    System.out.println("Valor inválido");
                    
                } 
        } catch 
        
    }
    
    void areaQ(){
        
        int a= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        
        int  area= a*b/2;
         System.out.println("A área do triângulo é "+ area);
         
        
        
        
    }
    
}
