package Fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema para calcular a área de um triângulo");
        System.out.println("Qual o valor da base? ");
        int base = scanner.nextInt();
        System.out.println("Qual o valor da altura? ");
        int altura = scanner.nextInt();
        double areaTriangulo = (base*altura)/2;

        System.out.println("A área do triângulo é igual a " + areaTriangulo + "cm");

    }
}
