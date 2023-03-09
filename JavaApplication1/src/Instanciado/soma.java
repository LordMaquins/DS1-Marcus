import javax.swing.JOptionPane;


public class soma {

    void multi() {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

        int soma = a + b;

        JOptionPane.showMessageDialog(null, "o valor da subtração é: " + soma);
    }
}
