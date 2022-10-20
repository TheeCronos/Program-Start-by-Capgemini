package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        //------------------------ Exercício 3 -------------------------------//
        /*
            3. Escreva um algoritmo para determinar o consumo médio de um automóvel 
        sendo fornecida a distância total percorrida pelo automóvel e o total de 
        combustível gasto;
         */
        //--------------------------- Código ---------------------------------//
        Scanner leitor = new Scanner(System.in);

        int x, y;
        float media;

        System.out.print("Informe a distância total percorrida: ");
        x = leitor.nextInt();
        System.out.print("Informe o total de combustível gasto: ");
        y = leitor.nextInt();

        media = x / y;
        System.out.println("A média de consumo é: " + media + " km/l");
    }
}
