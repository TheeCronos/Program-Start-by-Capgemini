package exercicio19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        //------------------------ Exercício 19 ------------------------------//
        /*
            19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e 
        informe o nome e se ela é homem ou mulher. No final informe total de 
        homens e de mulheres;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        int v = 3;
        int c = 0;
        int d = 0;
        String m = "m";
        String[] sexo = new String[v];
        String[] nome = new String[v];

        for (int i = 0; i < v; i++) {
            System.out.print("Informe o nome: ");
            nome[i] = input.nextLine();
            System.out.print("Informe o sexo (m/f): ");
            sexo[i] = input.nextLine();
            if (sexo[i].equals(m)) {
                System.out.println("Homem");
            } else {
                System.out.println("Mulher");
            }
        }

        for (int i = 0; i < v; i++) {
            if (sexo[i].equals(m)) {
                c++;
            } else {
                d++;
            }
        }

        System.out.println("------------------------");
        System.out.println("A quantidade de homens que tem é " + c);
        System.out.println("A quantidade de mulheres que tem é " + d);
    }
}
