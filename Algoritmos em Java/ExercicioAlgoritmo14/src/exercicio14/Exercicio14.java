package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        //------------------------ Exercício 14 ------------------------------//
        /*
            14. Escreva um algoritmo que leia dois valores inteiro distintos 
        e informe qual é o maior;
        */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();
        
        if (a > b) {
            System.out.println("O maior número é: " + a);
        }else{
            System.out.println("O maior número é: " + b);
        }
    }
}
