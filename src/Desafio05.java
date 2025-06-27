import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos colaboradores você quer calcular o reajuste? ");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("%nInforme o salário do colaborador %d: R$ ", i);
            double salarioAtual = scanner.nextDouble();

            double percentualAumento = 0.0;

            // Estrutura condicional para definir o percentual de aumento
            if (salarioAtual <= 280.00) {
                percentualAumento = 20.0;
            } else if (salarioAtual <= 700.00) {
                percentualAumento = 15.0;
            } else if (salarioAtual <= 1500.00) {
                percentualAumento = 10.0;
            } else {
                percentualAumento = 5.0;
            }

            double valorAumento = salarioAtual * (percentualAumento / 100);
            double novoSalario = salarioAtual + valorAumento;
            double inflacao = 3.8;
            double aumentoPercentualEfetivo = ((novoSalario / salarioAtual) - 1) * 100;
            double aumentoReal = aumentoPercentualEfetivo - inflacao;

            // Exibe resultados
            System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
            System.out.printf("Percentual de aumento aplicado: %.1f%%%n", percentualAumento);
            System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
            System.out.printf("Novo salário, após o aumento: R$ %.2f%n", novoSalario);
            System.out.printf("Valor do aumento real, descontada a inflação: %.2f%%%n", aumentoReal);
        }

        scanner.close();
    }
}


