package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        //------------------------ Exercício 8 -------------------------------//
        /*
            8. Elabore um algoritmo que efetue a apresentação do valor da 
        conversão em real (R$) de um valor lido em dólar (US$). O algoritmo 
        deverá solicitar o valor da cotação do dólar e também a quantidade de 
        dólares disponíveis com o usuário;
         */
        //--------------------------- Código ---------------------------------//
        float r, d, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor em dolares: ");
        d = input.nextFloat();

        System.out.print("Informe a cotação atual do dolar: ");
        c = input.nextFloat();

        r = d * c;

        System.out.println(r);
    }
}
