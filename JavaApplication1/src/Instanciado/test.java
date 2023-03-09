

package Instanciado;

import javax.swing.JOptionPane;
public class test {
    public static void main (String[]args){
    
    FunCal chamar = new FunCal();
 
    String op= JOptionPane.showInputDialog("Digite o operador: " );
    
    if(op.equals ("+")){
        chamar.soma();
        
    }else if (op.equals("-")) {
        chamar.sub();
        
    }else if (op.equals("/")) {
        chamar.div();
    } else if (op.equals("*")){
        chamar.multi();
    }else 
        System.out.println("Valor inválido");
    }
}
