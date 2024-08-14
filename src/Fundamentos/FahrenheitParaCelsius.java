package Fundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conversor de temperatura de Fahrenheit para Celsius");
        System.out.println("Digite o valor da temperatura para fahrenheit: ");
        int fahrenheit = entrada.nextInt();
        int celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("%dºF equivale a %dºC ", fahrenheit, celsius);

        entrada.close();
    }
}
