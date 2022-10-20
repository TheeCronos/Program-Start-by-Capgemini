package exerciciojava31;

import java.util.Scanner;

public class ExercicioJava31 {
    
    public static void main(String[] args) {
        
        //------------------------ Exercício 31 ------------------------------//
        /*
            31. Dados três valores A, B e C, em que A e B são números reais e C 
        é um caractere, pede-se para imprimir o resultado da operação de A por B
        se C for um símbolo de operador aritmético; caso contrário deve ser 
        impressa uma mensagem de operador não definido. Tratar erro de divisão 
        por zero;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int r = 0;
        char c;
        
        System.out.print("Digite o valor A: ");
        a = input.nextInt();
        System.out.print("Digite o valor B: ");
        b = input.nextInt();
        System.out.print("Informe o operador aritmético (+) (-) (*) (/): ");
        c = input.next().charAt(0);
        
        if (c == '+') {
            r = a + b;
            System.out.println("A soma de A e B é: " + r);
        } else {
            if (c == '-') {
                r = a - b;
                System.out.println("A subtração de A e B é: " + r);
            } else {
                if (c == '*') {
                    r = a * b;
                    System.out.println("A multiplicação de A e B é: " + r);
                } else {
                    try {
                       if (c == '/') {
                            r = a / b;
                            System.out.println("A divisão de A e B é: " + r);
                        } else {
                            System.out.println("Operador não definido");
                        }   
                    }
                    catch (ArithmeticException e) {
                        System.out.println("Valor não pode ser dividido por 0");
                    }
                }
            }
        }
    }
}
