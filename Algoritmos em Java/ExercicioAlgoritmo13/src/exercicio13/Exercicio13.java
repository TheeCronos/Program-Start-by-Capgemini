package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        //------------------------ Exercício 13 ------------------------------//
        /*
            13. Faça um algoritmo que receba um número e mostre uma mensagem 
        caso este número seja maior que 10;
        */
        //--------------------------- Código ---------------------------------//
        int x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        x = input.nextInt();
        
        if (x > 10) {
            System.out.println("O numero " + x + " é maior que 10");
        }else{
            System.out.println("O numero " + x + " é menor que 10");
        }
    }
}
