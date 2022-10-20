package exerciciojava30;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioJava30 {

    public static void main(String[] args) {

        //------------------------ Exercício 30 ------------------------------//
        /*
            30. Escreva um algoritmo que leia três valores inteiros distintos e 
        os escreva em ordem crescente;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        int num[] = new int[3];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um valor: ");
            num[i] = input.nextInt();
        }

        Arrays.sort(num);

        System.out.println("Ordem crescente");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }
}

/*

Arrays.sort(VARIAVEL, Collections.reverseOrder());
        
Use Collections.reverseOrder() para ordenar do maior para o memor,
ou seja, ordem decrescente. Porém não funciona com tipos primitivos.

*/
