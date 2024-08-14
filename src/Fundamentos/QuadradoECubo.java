package Fundamentos;

import java.util.Scanner;

public class QuadradoECubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema que ler um valor e apresenta seus valores ao quadrado e ao cubo");
        System.out.println("Digite o valor");

        double valor = scanner.nextDouble();
        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println(valor + " ao quadrado é igual a " + quadrado + " e ao cubo é igual a " + cubo);
        scanner.close();
    }
}
