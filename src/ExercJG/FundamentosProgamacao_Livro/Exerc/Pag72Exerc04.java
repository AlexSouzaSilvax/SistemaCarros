package ExercJG;

import java.util.Scanner;

public class Pag72Exerc04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        num3 = scan.nextDouble();

        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println("A ordem crescente é: " + num1 + " - " + num2 + " - " + num3);
            } else {
                System.out.println("A ordem crescente é: " + num1 + " - " + num3 + " - " + num2);
            }
        }
        if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println("A ordem crescente é: " + num2 + " - " + num1 + " - " + num3);
            } else {
                System.out.println("A ordem crescente é: " + num2 + " - " + num3 + " - " + num1);
            }
        }
        if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                System.out.println("A ordem crescente é: " + num3 + " - " + num1 + " - " + num2);
            } else {
                System.out.println("A ordem crescente é: " + num3 + " - " + num2 + " - " + num1);
            }
        }
    }
}
