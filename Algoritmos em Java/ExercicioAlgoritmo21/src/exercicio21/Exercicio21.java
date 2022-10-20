package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        //------------------------ Exercício 21 ------------------------------//
        /*
            21. Escreva um algoritmo que leia os dados de “N” pessoas 
        (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir 
        o serviço militar obrigatório. Informe os totais;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        String nome;
        char sexo;
        int idade;
        char saude;
        char resp;

        do {
            System.out.print("Informe o nome: ");
            nome = input.nextLine();

            System.out.print("informe o sexo (M / F): ");
            sexo = input.next().charAt(0);

            System.out.print("Informe a idade: ");
            idade = input.nextInt();

            System.out.print("Está saudável? (S / N): ");
            saude = input.next().charAt(0);

            if ((sexo == 'M' || sexo == 'm') && (idade >= 18)) {
                if (saude == 's' || saude == 'S') {
                    System.out.println("Está apto para cumprir o serviço militar obrigatório");
                } else {
                    System.out.println("Está na lista de espera");
                }
            } else {
                System.out.println("Não está apto para cumprir o serviço militar obrigatório");
            }

            System.out.println("---------------------------------------------------------");
            System.out.print("Deseja informar mais uma pessoa? (S / N): ");
            resp = input.next().charAt(0);
            input.nextLine();
            System.out.println("---------------------------------------------------------");
        } while (resp == 's' || resp == 'S');
    }
}
