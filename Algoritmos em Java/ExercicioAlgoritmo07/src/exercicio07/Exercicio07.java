package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        //------------------------ Exercício 7 -------------------------------//
        /*
            7. Leia uma temperatura em graus Celsius e apresentá-la convertida 
        em graus Fahrenheit. A fórmula de conversão é:F =(9*C+160) / 5, 
        sendo F a temperatura em Fahrenheit e C a temperatura emCelsius; 
         */
        //--------------------------- Código ---------------------------------//
        int f, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        c = input.nextInt();

        f = (9 * c + 160) / 5;

        System.out.println("A temperatura convertida para Fahrenheit é: " + f);
    }
}
