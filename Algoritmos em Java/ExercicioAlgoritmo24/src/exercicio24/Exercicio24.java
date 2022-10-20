package exercicio24;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        //------------------------ Exercício 24 ------------------------------//
        /*
            24. Faça um algoritmo que receba “N” números e mostre positivo, 
        negativo ou zero para cada número;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Digite um número: ");
            int num = input.nextInt();

            if (num > 0) {
                System.out.println("O numero é positivo!");
            } else {
                if (num == 0) {
                    System.out.println("O numero é zero!");
                } else {
                    System.out.println("O numero é negativo!");
                }
            }

            System.out.print("Deseja informar mais um número? (S / N): ");
            resp = input.next().charAt(0);
        } while (resp == 's' || resp == 'S');
    }
}
