import java.util.Scanner;

public class AulaFaculEsturasDeCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salario: ");
        double salario = scanner.nextDouble();
        double inflacao = 3.8 / 100;


        if (salario == 280) {
            salario = salario * 20 / 100;
            System.out.println("O aumento salarial será: R$" + salario);
        }

        if (salario >= 280 && salario <= 780) {
            salario = salario * 15 / 100;
            System.out.println("O aumento salarial será: R$" + salario);

        }

        if (salario >= 780 && salario <= 1500) {
            salario = salario * 10 / 100;
            System.out.println("O aumento salarial será: R$" + salario);
        } else if (salario > 1500) {
            salario = salario * 5 / 100;
            System.out.println("O aumento salarial será: R$" + salario);
        }

        salario -= salario * inflacao;
        System.out.println("Salario final será: R$" + salario);

        scanner.close();


    }
}


