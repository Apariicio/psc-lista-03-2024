import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Equação do segundo grau: ax² + bx + c = 0");
        System.out.println("Discriminante: delta = b² – 4ac");

        System.out.println("Digite o coeficiente 'a' da equação de segundo grau:");
        double a = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'b' da equação de segundo grau:");
        double b = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'c' da equação de segundo grau:");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (a == 0 && b == 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0) {
            double raiz = -c / b;
            System.out.println("Esta é uma equação de primeiro grau.");
            System.out.println("O valor da raiz real da equação é: " + raiz);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Esta equação possui duas raízes reais iguais.");
            System.out.println("O valor das raízes é: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            System.out.println("Os valores das raízes são: " + raiz1 + " e " + raiz2);
        }

        scanner.close();
    }
}