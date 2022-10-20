package exerciciojava33;

import java.util.Scanner;

public class ExercicioJava33 {
    
    public static void main(String[] args) {
        
        //------------------------ Exercício 31 ------------------------------//
        /*
            33. A escola “APRENDER” faz o pagamento de seus professores por 
        hora/aula. Faça um algoritmo que calcule e exiba o salário de um professor. 
        Sabe-se que o valor da hora/aula segue a tabela abaixo:
            a. Professor Nível 1 R$12,00 por hora/aula;
            b. Professor Nível 2 R$17,00 por hora/aula;
            c. Professor Nível 3 R$25,00 por hora/aula.
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        
        float salario = 0;
        System.out.print("Informe as horas trabalhadas: ");
        int horas = input.nextInt();
        
        System.out.println("Informe o nível do professor");
        System.out.print("Nível 1, 2 ou 3: ");
        int nivel = input.nextInt();
        
        switch (nivel) {
        case 1:
            salario = horas * 12.00f;
            break;
        case 2:
            salario = horas * 17.00f;
            break;
        case 3:
            salario = horas * 25.00f;
            break;
        default:
            System.out.println("Nível inválido");
            break;
        }
        System.out.println("O salário do professor é: R$ " + salario);
    }
}
