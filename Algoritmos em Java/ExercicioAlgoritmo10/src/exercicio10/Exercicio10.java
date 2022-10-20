package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        //------------------------ Exercício 10 ------------------------------//
        /*
            10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)
        prestações sem juros. Faça um algoritmo que receba um valor de uma 
        compra e mostre o valor das prestações;
         */
        //--------------------------- Código ---------------------------------//
        float compra, parcela;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        compra = input.nextFloat();

        parcela = compra / 5;

        System.out.println("Parcelado em 5x " + parcela);
    }
}
