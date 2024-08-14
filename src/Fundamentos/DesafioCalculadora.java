package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando calculadora ");
        System.out.println("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Qual o simbolo da operação você deseja executar entre esses números? (+, -, *, /) ");
        String operacao = scanner.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f ", num1, operacao, num2, resultado);
        scanner.close();
    }
}
