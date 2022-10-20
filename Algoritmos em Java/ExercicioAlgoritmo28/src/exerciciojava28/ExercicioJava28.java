package exerciciojava28;

import java.util.Scanner;

public class ExercicioJava28 {

    public static void main(String[] args) {

        //------------------------ Exercício 28 ------------------------------//
        /*
            28. Escreva um algoritmo para uma empresa que decide dar um reajuste
        a seus 584 funcionários de acordo com os seguintes critérios:
            a. 50% para aqueles que ganham menos do que três salários mínimos;
            b. 20% para aqueles que ganham entre três até dez salários mínimos;
            c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
            d. 10% para os demais funcionários.
        Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
        Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
        o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua
        folha de pagamento;
         */
        //--------------------------- Código ---------------------------------//
        Scanner input = new Scanner(System.in);

        final int f = 4;
        float salario = 0;
        float reajuste[] = new float[f];
        float reajusteTotal = 0;
        float salarioNovo = 0;
        float salarioMinimo = 0;
        String nome;

        for (int i = 0; i < f; i++) {
            System.out.print("Digite o nome do funcionário: ");
            nome = input.nextLine();
            System.out.print("Informe o salário: ");
            salario = input.nextFloat();
            System.out.print("Informe o salário mínimo: ");
            salarioMinimo = input.nextFloat();

            if (salario < (salarioMinimo * 3)) {
                reajuste[i] = salario * 0.50f;
                salarioNovo = salario + reajuste[i];
            } else {
                if (salario > (salarioMinimo * 3) && salario < (salarioMinimo * 10)) {
                    reajuste[i] = salario * 0.20f;
                    salarioNovo = salario + reajuste[i];
                } else {
                    if (salario > (salarioMinimo * 10) && salario < (salarioMinimo * 20)) {
                        reajuste[i] = salario * 0.15f;
                        salarioNovo = salario + reajuste[i];
                    } else {
                        reajuste[i] = salario * 0.10f;
                        salarioNovo = salario + reajuste[i];
                    }
                }
            }
            input.nextLine();
            System.out.println(" ");
            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Valor do reajuste: R$ " + reajuste[i]);
            System.out.println("Novo salário: R$ " + salarioNovo);
            System.out.println("--------------------------------------");
        }
        
        for (int i = 0; i < f; i++) {
            reajusteTotal += reajuste[i];
        }
        System.out.println("Aumento total na folha de pagamento: R$ " + reajusteTotal);
    }
}
