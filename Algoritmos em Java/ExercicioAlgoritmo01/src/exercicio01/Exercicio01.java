package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        //------------------------ Exercício 1 -------------------------------//
        /*
            1. Faça um algoritmo que receba dois números e exiba o resultado 
        da sua soma;
         */
        //--------------------------- Código ---------------------------------//
        int x, y, soma;

        Scanner leitor = new Scanner(System.in);

        x = leitor.nextInt();
        y = leitor.nextInt();

        soma = x + y;

        System.out.println(soma);
    }
}
