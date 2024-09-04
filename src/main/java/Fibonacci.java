import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = scanner.nextInt();
        scanner.close();

        int a = 0;
        int b = 1;
        while (a <= numero) {
            if (a == numero) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                return;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
    }
}