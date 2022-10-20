package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        //------------------------ Exercício 4 -------------------------------//
        /*
            4. Escreva um algoritmo que leia o nome de um vendedor, o seu 
        salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
        Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
        efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
         */
        //--------------------------- Código ---------------------------------//
        String vendedor;
        float salarioFixo, totVendas, comissao, salarioFinal;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        vendedor = leitor.nextLine();

        System.out.print("Informe o salário fixo: ");
        salarioFixo = leitor.nextFloat();

        System.out.print("Informe o total de vendas: ");
        totVendas = leitor.nextFloat();

        comissao = (float) (totVendas * 0.15);

        salarioFinal = salarioFixo + comissao;

        System.out.println("Vendedor: " + vendedor);
        System.out.println("Salário fixo: " + salarioFixo);
        System.out.println("Salário final: " + salarioFinal);
    }
}
