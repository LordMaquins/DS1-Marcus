
package Instanciado;

import javax.swing.JOptionPane;


public class multi {

    void multi() {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

        int multi = a * b;

        JOptionPane.showMessageDialog(null, "o valor da subtração é: " + multi);
    }
}
