package exerciciojava15;

import java.util.Scanner;

public class ExercicioJava15 {

    public static void main(String[] args) {
        
        //------------------------ Exercício 15 ------------------------------//
        /*
            15. Faça um algoritmo que receba um número e diga se este número 
        está no intervalo entre 100 e 200;
        */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int a = input.nextInt();
        
        if (a >= 100 && a <= 200) {
            System.out.println("O número está entre 100 e 200");
        }else{
            System.out.println("O número não está entre 100 e 200");
        }
    }
}
