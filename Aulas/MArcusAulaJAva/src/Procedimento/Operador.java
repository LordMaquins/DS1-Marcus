package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor: "));
      
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O vlaor da soma é: " + soma);
    }
        void subt(){
        int a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor: "));
      
        int subt = a - b;
        JOptionPane.showMessageDialog(null,"O valor da subtração é: "+ subt);
        }
        void divisao(){
            double a= Double.parseDouble(JOptionPane.showInputDialog("Digite seu número: "));
               double b= Double.parseDouble(JOptionPane.showInputDialog("Digite seu número: "));
               double div = a / b;
               JOptionPane.showMessageDialog(null, "O valor da sua divisão é: "+ div);
            
        }
               
    }
        
    


