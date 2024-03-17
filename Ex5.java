import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o símbolo de operação (+, -,*, / ou ^): ");
        char op = scanner.next().charAt(0);
        double resultado = 0.0;
        scanner.close();
        
        switch (op) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(n1, n2);
                break;
            default:
                System.out.println("Erro: Símbolo de operação inválido.");
                return;
        }
        System.out.println("O resultado da operação é: " + resultado);

        
    }
}