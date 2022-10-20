package exercicio06;

public class Exercicio06 {

    public static void main(String[] args) {

        //------------------------ Exercício 6 -------------------------------//
        /*
            6. Leia dois valores para as variáveis A e B, e efetuar as trocas 
        dos valores de forma que a variável A passe a possuir o valor da 
        variável B e a variável B passe a possuir o valor da variável A.
        Apresentar os valores trocados;
         */
        //--------------------------- Código ---------------------------------//
        int a = 2;
        int b = 3;
        int x;

        x = a;
        a = b;
        b = x;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
