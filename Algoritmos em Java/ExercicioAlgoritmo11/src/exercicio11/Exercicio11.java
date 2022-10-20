package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        //------------------------ Exercício 11 ------------------------------//
        /*
            11. Faça um algoritmo que receba o preço de custo de um produto e 
        mostre o valor de venda. Sabe-se que o preço de custo receberá um 
        acréscimo de acordo com um percentual informado pelo usuário;
         */
        //--------------------------- Código ---------------------------------//
        float custo, percent, venda;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de custo: ");
        custo = input.nextFloat();

        System.out.print("Informe a porcentagem sobre o custo: ");
        percent = input.nextFloat();

        percent = (percent / 100) * custo;

        venda = custo + percent;

        System.out.println("Valor de venda é: " + venda);
    }
}
