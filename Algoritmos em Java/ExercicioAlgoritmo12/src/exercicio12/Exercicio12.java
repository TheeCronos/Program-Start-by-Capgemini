package exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        //------------------------ Exercício 12 ------------------------------//
        /*
            12. O custo de um carro novo ao consumidor é a soma do custo de 
        fábrica mais o percentual do distribuidor e dos impostos aplicados 
        (primeiro os impostos são aplicados sobre o custo de fábrica, e depois 
        o percentual do distribuidor sobre o resultado). Supondo que o percentual
        do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que 
        leia o custo de fábrica de um carro e informe o custo ao consumidor do
        mesmo;
        */
        
        //--------------------------- Código ---------------------------------//
        float custoFabrica = 0.0f;
        float imposto = 0.45f;
        float percentDist = 0.28f;
        float valorFinal = 0.0f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor do carro: ");
        custoFabrica = input.nextFloat();
        
        custoFabrica = custoFabrica + (custoFabrica * imposto); 
        valorFinal = custoFabrica + (custoFabrica * percentDist); 
        
        System.out.println("O valor do carro é R$ " + valorFinal);
        
    }
}
