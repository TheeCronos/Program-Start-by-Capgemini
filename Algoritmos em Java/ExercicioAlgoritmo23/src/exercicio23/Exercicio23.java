package exercicio23;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        //------------------------ Exercício 23 ------------------------------//
        /*
            23. Faça um algoritmo que receba um número e mostre uma mensagem 
        caso este número seja maior que 80, menor que 25 ou igual a 40;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num > 80) {
            System.out.println("O número informado é maior que 80");
        } else {
            if (num == 40) {
                System.out.println("O número informado é igual a 40");
            } else {
                if (num < 25) {
                    System.out.println("O número informado é menor que 25");
                } else {
                    System.out.println("Nenhuma das opções");
                }
            }
        }
    }
}
