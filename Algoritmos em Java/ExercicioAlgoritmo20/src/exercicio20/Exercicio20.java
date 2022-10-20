package exercicio20;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        //------------------------ Exercício 20 ------------------------------//
        /*
            20. A concessionária de veículos “CARANGO VELHO” está vendendo os 
        seus veículos com desconto. Faça um algoritmo que calcule e exiba o 
        valor do desconto e o valor a ser pago pelo cliente de vários carros. 
        O desconto deverá ser calculado de acordo com o ano do veículo.
        Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se 
        deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
        Informar total de carros com ano até 2000 e total geral;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        int ano = 0;
        float valor = 0.0f;
        float valorFinal = 0.0f;
        float pow = 0.0f;
        int totalCarros = 0;
        int totalCarrosSemi = 0;
        char repetir = 's';

        while (repetir == 's' || repetir == 'S') {

            System.out.print("Digite o ano de fabricação do veículo: ");
            ano = input.nextInt();

            System.out.print("Digite o valor do veículo: ");
            valor = input.nextFloat();
            if (ano <= 2000) {
                pow = valor * 0.12f;
                valorFinal = valor - pow;
            } else {
                pow = valor * 0.07f;
                valorFinal = valor - pow;
                totalCarrosSemi++;
            }
            totalCarros++;

            System.out.println("O valor total do desconto foi de R$ " + pow);
            System.out.println("O valor que deve ser pago é R$ " + valorFinal);

            System.out.print("Deseja fazer mais cadastros? S - Sim / N - Não: ");
            repetir = input.next().charAt(0);
        }

        System.out.println("Total de carros seminovos: " + totalCarrosSemi);
        System.out.println("Total de carros: " + totalCarros);
    }
}
