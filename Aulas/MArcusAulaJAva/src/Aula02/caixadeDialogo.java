package Aula02;

import javax.swing.JOptionPane;

public class caixadeDialogo {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int idade = 18;    
        JOptionPane.showMessageDialog(null,"Seu nome é: "+ nome + " e você pussui "+ idade+ " anos");
    }

}
 