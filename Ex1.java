import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double nu1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double nu2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double nu3 = scanner.nextDouble();

        System.out.println("Você digitou os números: " + nu1 + ", " + nu2 + ", " + nu3);
        
        double maiorNu = Math.max(nu1, Math.max(nu2, nu3));
        System.out.println("O maior número é: " + maiorNu);
        
        double menorNu = Math.min(nu1, Math.min(nu2, nu3));
        System.out.println("O menor número é: " + menorNu);
        
        double media = (nu1 + nu2 + nu3) / 3;
        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}