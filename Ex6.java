import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

        int maiorN = Math.max(n1, n2);
        int menorN = Math.min(n1, n2);        

        Random random = new Random();
        int numeroAle = random.nextInt(maiorN - menorN) + menorN;
        System.out.print("O número aleatório gerado é: " + numeroAle);
        if (numeroAle %2 == 0) {
            System.out.println(" O número gerado é par.");
        } 
        if (numeroAle %2 == 1) {
            System.out.print(" O número gerado é ímpar.");
        }

        scanner.close();
    }
}