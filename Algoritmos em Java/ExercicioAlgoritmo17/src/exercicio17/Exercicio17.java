package exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        //------------------------ Exercício 17 ------------------------------//
        /*
            17. Leia 80 números e ao final informar quantos números estão no 
        intervalo entre 10 (inclusive) e 150 (inclusive);
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        int n = 80;
        int[] nro = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Insira um número: ");
            nro[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (nro[i] >= 10 && nro[i] <= 150) {
                System.out.println(nro[i]);
            }
        }
    }
}
