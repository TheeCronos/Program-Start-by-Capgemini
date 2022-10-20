package exercicio22;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        //------------------------ Exercício 22 ------------------------------//
        /*
            22. Faça um algoritmo que receba o preço de custo e o preço de venda
        de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate
        para cada produto. Informe o valor de custo de cada produto, o valor
        de venda de cada produto, amédia de preço de custo e do preço de venda;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        float precoCusto[] = new float[41];
        float precoVenda[] = new float[41];
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f;

        for (int i = 1; i < 41; i++) {
            System.out.print("Informe o preço de custo do produto: ");
            precoCusto[i] = input.nextFloat();

            System.out.print("Informe o preço de venda do produto: ");
            precoVenda[i] = input.nextFloat();

            if (precoVenda[i] > precoCusto[i]) {
                System.out.println("Houve lucro!");
            } else {
                if (precoVenda[i] == precoCusto[i]) {
                    System.out.println("Houve empate!");
                } else {
                    System.out.println("Houve prejuízo!");
                }
            }
        }
        System.out.println(" ");

        for (int i = 1; i < 41; i++) {
            System.out.println("Preço de custo do produto " + i + " é R$ " + precoCusto[i]);
            System.out.println("Preco de venda do produto " + i + " é R$ " + precoVenda[i]);
        }

        for (int i = 1; i < 41; i++) {
            mediaCusto = mediaCusto + precoCusto[i];
            mediaVenda = mediaVenda + precoVenda[i];
        }

        System.out.println(" ");
        System.out.println("Média de custo: R$ " + mediaCusto / 40);
        System.out.println("Média de venda: R$ " + mediaVenda / 40);
    }
}
