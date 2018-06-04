package ExercJG;

import java.util.Scanner;

public class Pag73Exerc05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, num3, num4;

        System.out.println("Digite três números em ordem crescente: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        System.out.println("Digite  um número (fora de ordem): ");
        num4 = scan.nextDouble();

        if (num4 > num3) {
            System.out.println("A ordem decrescente é: " + num4 + " " + num3 + " " + num2 + " " + num1);
        }
        if (num4 > num2 && num4 < num3) {
            System.out.println("A ordem decrescente é: " + num3 + " " + num4 + " " + num2 + " " + num1);
        }
        if (num4 > num1 && num4 < num2) {
            System.out.println("A ordem decrescente é: " + num3 + " " + num2 + " " + num4 + " " + num1);
        }
        if (num4 < num1) {
            System.out.println("A ordem decrescente é: " + " " + num3 + " " + num2 + " " + num1 + " " + num4);
        }
    }
}
