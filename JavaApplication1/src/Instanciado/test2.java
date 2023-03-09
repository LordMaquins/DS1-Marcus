package Instanciado;

import javax.swing.JOptionPane;

public class test2 {

    public void main(String[] args) {

        FunCal chamar = new FunCal();
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador"));

        if (op == 1) {
            chamar.soma();

        } else if  {
            (op == 2)
            {
                chamar.sub();

            }else if  {
                        (op == 3)
                        {
                            chamar.multi();

                        }else if  {
                            (op == 4)
                            {
                                chamar.div();
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null, "Valor inválido");
                                }
                                
                        }
                       
