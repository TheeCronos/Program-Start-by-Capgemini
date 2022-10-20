package exerciciojava27;

import java.util.Scanner;

public class ExercicioJava27 {

    public static void main(String[] args) {

        //------------------------ Exercício 27 ------------------------------//
        /*
            27. A concessionária de veículos “CARANGO” está vendendo os seus 
        veículos com desconto. Faça um algoritmo que calcule e exiba o valor do 
        desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
        calculado sobre o valor do veículo de acordo com o combustível 
        (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero 
        encerra entrada de dados. Informe total de desconto e total pago pelos
        clientes;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        int tipo = 0;
        float valorFinal = 0;
        float desconto = 0;

        while (true) {
            System.out.print("Digite o valor do veículo: ");
            float valor = input.nextFloat();

            if (valor == 0) {
                break;
            }
            do {
                System.out.println("Selecione o tipo de combustível");
                System.out.println("1 - Álcool");
                System.out.println("2 - Gasolina");
                System.out.println("3 - Diesel");
                System.out.print("->: ");
                tipo = input.nextInt();
                switch (tipo) {
                    case 1:
                        desconto = valor * 0.25f;
                        System.out.println("Desconto: R$ " + desconto);
                        valorFinal = valor - desconto;
                        System.out.println("Valor final: R$ " + valorFinal);
                        break;
                    case 2:
                        desconto = valor * 0.21f;
                        System.out.println("Desconto: R$ " + desconto);
                        valorFinal = valor - desconto;
                        System.out.println("Valor final: R$ " + valorFinal);
                        break;
                    case 3:
                        desconto = valor * 0.14f;
                        System.out.println("Desconto: R$ " + desconto);
                        valorFinal = valor - desconto;
                        System.out.println("Valor final: R$ " + valorFinal);
                        break;
                }
            } while (tipo < 1 || tipo > 3);
            System.out.println("---------------------------------------------");
        }
    }
}
