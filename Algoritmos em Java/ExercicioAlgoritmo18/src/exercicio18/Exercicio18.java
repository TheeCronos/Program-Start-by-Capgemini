package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        //------------------------ Exercício 18 ------------------------------//
        /*
            18. Faça um algoritmo que receba a idade de 75 pessoas e mostre 
        mensagem informando “maior de idade” e “menor de idade” para cada pessoa. 
        Considere a idade a partir de 18 anos como maior de idade;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        int idade;

        for (int i = 0; i < 75; i++) {
            System.out.print("Insira a idade: ");
            idade = input.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
    }
}
