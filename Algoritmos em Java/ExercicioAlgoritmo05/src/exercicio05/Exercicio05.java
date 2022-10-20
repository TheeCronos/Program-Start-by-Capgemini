package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        //------------------------ Exercício 5 -------------------------------//
        /*
            5. Escreva um algoritmo que leia o nome de um aluno e as notas das 
        três provas que ele obteve no semestre. No finalinformar o nome do 
        aluno e a sua média (aritmética);
         */
        //--------------------------- Código ---------------------------------//
        String nome;
        int x, y, z, media;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        nome = input.nextLine();

        System.out.print("Informe a nota da primeira prova: ");
        x = input.nextInt();

        System.out.print("Informe a nota da segunda prova: ");
        y = input.nextInt();

        System.out.print("Informe a nota da terceira prova: ");
        z = input.nextInt();

        media = (x + y + z) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }
}
