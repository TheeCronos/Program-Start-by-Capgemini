package exercicio25;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        //------------------------ Exercício 25 ------------------------------//
        /*
            25. Faça um algoritmo que leia dois números e identifique se são 
        iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo
        que eles são iguais. Caso sejam diferentes, informe qual número é o
        maior, e uma mensagem que são diferentes;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Os numeros são iguais!");
        } else {
            if (num1 > num2) {
                System.out.println("Os números são diferentes e o número "
                        + num1 + " é maior que o número " + num2);
            } else {
                System.out.println("Os números são diferentes e o número "
                        + num2 + " é maior que o número " + num1);
            }
        }
    }
}
