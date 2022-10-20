package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        //------------------------ Exercício 9 -------------------------------//
        /*
            9. Faça um algoritmo que receba um valor que foi depositado e exiba 
        o valor com rendimento após um mês. Considere fixo o juros da poupança 
        em 0,07% a. m;
         */
        //--------------------------- Código ---------------------------------//
        float valor, juros, saldo;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor depositado: ");
        valor = input.nextFloat();

        juros = (float) (valor * 0.07);

        saldo = valor + juros;

        System.out.println("Rendimento de 0,07% a.m");
        System.out.println("Saldo após 1 mÊs: " + saldo);
    }
}
