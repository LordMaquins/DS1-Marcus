
package Instanciado;

import javax.swing.JOptionPane;
public class FunCal {
    void sub (){
          
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        
        int sub = a-b;
        
        JOptionPane.showMessageDialog(null,"o valor da subtração é: " + sub);
      
    }
        
    
}
