package exerciciojava35;

import java.util.Scanner;

public class ExercicioJava35 {
    
    public static void main(String[] args) {
        
        //------------------------ Exercício 35 ------------------------------//
        /*
            35. Faça um algoritmo que calcule o valor da conta de luz de uma 
        pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
        Tipo de Cliente Valor do KW/h
            a. (Residência) 0,60;
            b. (Comércio) 0,48;
            c. (Indústria) 1,29.
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        
        float consumo = 0.0f;
        float conta = 0.0f;
        
        System.out.print("Informe o consumo em KW/h: ");
        consumo = input.nextFloat();
        
        System.out.print("Informe o tipo. 1 - Residêncial. 2 - Comércio. 3 - Indústrial.: ");
        int tipo = input.nextInt();
        
        if (tipo == 1) {
            conta = consumo * 0.60f;
        } else {
            if (tipo == 2) {
                conta = consumo * 0.48f;
            } else {
                if (tipo == 3) {
                    conta = consumo * 1.29f;
                } else {
                    System.out.println("Tipo inválido!");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Valor da conta de luz: R$ " + conta);
    }
}
