import java.util.Scanner;

public class SomaDe5Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 5 números inteiros: ");

        for(int i = 1; i <= 5; i++){
            System.out.println("Numero " + i + ":");
            int numero = scanner.nextInt();
            soma += numero;
        }
        System.out.println("A soma de todos os numeros é: " + soma);

        scanner.close();
    }
}
