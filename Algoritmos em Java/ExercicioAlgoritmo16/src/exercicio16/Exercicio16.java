package exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        //------------------------ Exercício 16 ------------------------------//
        /*
            16. Escreva um algoritmo que leia o nome e as três notas obtidas 
        por um aluno durante o semestre. Calcular a sua média (aritmética), 
        informar o nome e sua menção aprovado (media >= 7), 
        Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Informe a primeira nota: ");
        float n1 = input.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float n2 = input.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float n3 = input.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("O aluno " + nome + " está aprovado com a média de " + media);
        } else if (media <= 5) {
            System.out.println("O aluno " + nome + " está reprovado com a média de " + media);
        } else {
            System.out.println("O aluno " + nome + " está de recuperação com a média de " + media);
        }
    }
}
