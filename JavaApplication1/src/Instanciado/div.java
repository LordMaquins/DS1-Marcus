import javax.swing.JOptionPane;


public class div {

    void div() {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

        int div = a / b;

        JOptionPane.showMessageDialog(null, "o valor da subtração é: " + div);
    }
}
