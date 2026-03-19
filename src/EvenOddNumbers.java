// Comando para importar a classe Scanner da biblioteca
import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        // Criação de objeto scanner para ser possível a leitura de entradas no console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Even and Odd Numbers: ");
        System.out.println("Digit a number: ");
        // Comando para salvar entrada digitada pelo usuário no console como tipo Integer
        int number = scanner.nextInt();
        // Comando para fechar o objeto scanner, assim, liberando recursos de memória
        scanner.close();

        // Comando de condição if simples para verificar se um número é par ou ímpar
        if (number % 2 == 0) {
            System.out.printf("The number %d is an even number!\n", number);
        } else if (number % 2 == 1) {
            System.out.printf("The number %d is an odd number!\n", number);
        }

    }
}
