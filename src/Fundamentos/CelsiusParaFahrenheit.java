package Fundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de temperatura de Celsius para Fahrenheit");
        System.out.println("Digite o valor da temperatura em Celsius: ");
        int celsius = scanner.nextInt();
        int fahrenheit = celsius * 9/5 + 32;

        System.out.printf("%dºC equivale a %dºF  ", celsius, fahrenheit);

        scanner.close();
    }
}
