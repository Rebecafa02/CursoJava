package Fundamentos;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema para cálculo de IMC");
        System.out.println("Digite o valor do seu peso atual: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Compare com a seguinte tabela: ");
        System.out.println(" Abaixo de 17 - muito abaixo do peso \n " +
                "Entre 17 e 18,49 - abaixo do peso \n Entre 18,5 e 24,99 - peso normal \n " +
                "Entre 25 e 29,99 - acima do peso \n Entre 30 e 34,99 - obesidade I \n " +
                "Entre 35 e 39,99 - obesidade II (severa) \n Acima de 40 -  obesidade III (mórbida)");

        scanner.close();
    }
}
