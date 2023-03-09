
package Exercicios3;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
public class Ex01 {
    public static void main(String[]args){
        String nome = JOptionPane.showInputDialog("Digite seu nome : ");
        JOptionPane.showMessageDialog(null,"Seu nome é : "+ nome);
    }
    
}
