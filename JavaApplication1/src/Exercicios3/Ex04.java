
package Exercicios3;

import javax.swing.JOptionPane;

import java.util.Scanner;
public class Ex04 {
    public void main (String [] args){
        Scanner input= new Scanner (System.in);
        
        System.out.println ("Digite o valor do primeiro lado: ");
        double lado1= input.nextDouble();
        
        System.out.println ("Digite o valor do segundo lado: ");
        double lado2= input.nextDouble();
        
          System.out.println ("Digite o valor do terceiro lado: ");
        double lado3= input.nextDouble();
        
        if (lado1== lado2 && lado2==lado3){
            System.out.println("O  triângulo é equilátero. ");
        } else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("O triângulo é isosceles");
        } else{ 
            System.out.println("O triângulo é escaleno");
        }
    }
            
}
