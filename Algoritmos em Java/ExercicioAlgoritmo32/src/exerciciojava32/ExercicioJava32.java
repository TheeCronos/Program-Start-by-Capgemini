package exerciciojava32;

import java.util.Scanner;

public class ExercicioJava32 {
    
    public static void main(String[] args) {
        
        //------------------------ Exercício 32 ------------------------------//
        /*
            32. Escreva um algoritmo que leia três valores inteiros e verifique 
        se eles podem ser os lados de um triângulo. Se forem, informar qual o 
        tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
        Propriedade: o comprimento de cada lado de um triângulo é menor do que 
        a soma dos comprimentos dos outros dois lados.
            a. Triângulo Equilátero: aquele que tem os comprimentos dos três 
        lados iguais;
            b. Triângulo Isóscele: aquele que tem os comprimentos de dois 
        lados iguais.
            c. Triângulo equilátero é também isóscele;
            d. Triângulo Escaleno: aquele que tem os comprimentos de seus três 
        lados diferentes;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        System.out.print("Informe o primeiuro valor: ");
        a = input.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = input.nextInt();
        System.out.print("Informe o terceiro valor: ");
        c = input.nextInt();
        
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            if (a == b && b == c && c == a) {
                System.out.println("Triângulo Equilátero e também Isócele!");
            } else {
                if (a != b && a != c && b != c) {
                    System.out.println("Triângulo Escaleno!");
                } else {
                    System.out.println("Triângulo Isóscele!");
                }
            }
        } else {
            System.out.println("Não pode ser um triângulo!");
        }
    }
}
