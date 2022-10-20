package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        //------------------------ Exercício 2 -------------------------------//
        /*
            2. Faça um algoritmo que receba dois números e ao final mostre a 
        soma, subtração, multiplicação e a divisão dos dois números lidos;
         */
        //--------------------------- Código ---------------------------------//
        int x, y, soma, sub, div, mult;

        Scanner leitor = new Scanner(System.in);

        x = leitor.nextInt();
        y = leitor.nextInt();

        soma = x + y;
        sub = x - y;
        div = x / y;
        mult = x * y;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Divisão: " + div);
        System.out.println("Multiplicação: " + mult);
    }
}
