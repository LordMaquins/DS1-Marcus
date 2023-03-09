
package Exercicios3;

import java.util.Scanner;
public class Ex03 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int resultado = a + b;

        System.out.println("O resultado da soma de A e B é: " + resultado);

        
    }
}