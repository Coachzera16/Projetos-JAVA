import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operador;
        double resultado = 0;

        while (true) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /) ou 'q' para sair: ");
            operador = scanner.next().charAt(0);

            if (operador == 'q') {
                System.out.println("Saindo da calculadora.");
                break;
            }

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operador inválido.");
                    continue;
            }

            System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
        }

        scanner.close();
    }
}

