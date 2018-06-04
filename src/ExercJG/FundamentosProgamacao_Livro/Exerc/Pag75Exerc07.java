package ExercJG;

import java.util.Scanner;

public class Pag75Exerc07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double i, a, b, c;
        System.out.println("Digite um valor para A: ");
        a = scan.nextDouble();
        System.out.println("Digite um valor para B: ");
        b = scan.nextDouble();
        System.out.println("Digite um valor para C: ");
        c = scan.nextDouble();
        System.out.println("Digite um valor para I (1, 2 ou 3): ");
        i = scan.nextDouble();

        //  abaixo segue o 1
        if (i == 1) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println("A ordem crescente dos números é: " + a + " - " + b + " - " + c);
                } else {
                    System.out.println("A ordem crescente dos números é: " + a + " - " + c + " - " + b);
                }
            }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.println("A ordem crescente dos números é: " + b + " - " + a + " - " + c);
            } else {
                System.out.println("A ordem crescente dos números é: " + b + " - " + c + " - " + a);
            }
        }

        if (c < a && c < a) {
            if (a < b) {
                System.out.println("A ordem crescente dos números é: " + c + " - " + a + " - " + b);
            } else {
                System.out.println("A ordem crescente dos números é: " + c + " - " + b + " - " + a);
            }
        }

        //  abaixo segue o 2
        if (i == 2) {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println("A ordem decrescente dos números é: " + a + " - " + b + " - " + c);
                } else {
                    System.out.println("A ordem decrescente dos números é: " + a + " - " + c + " - " + b);
                }
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println("A ordem decrescente dos números é: " + b + " - " + a + " - " + c);
            } else {
                System.out.println("A ordem decrescente dos números é: " + b + " - " + c + " - " + a);
            }
        }

        if (c > a && c > a) {
            if (a > b) {
                System.out.println("A ordem decrescente dos números é: " + c + " - " + a + " - " + b);
            } else {
                System.out.println("A ordem decrescente dos números é: " + c + " - " + b + " - " + a);
            }
        }
        //  abaixo segue o 3
        if (i == 3) {

            if (a > b && a > c) {
                System.out.println("A ordem desejada é: " + b + " - " + a + " - " + c);
            }
            if (b > a && b > c) {
                System.out.println("A ordem desejada é: " + a + " - " + b + " - " + c);
            }
            if (c > a && c > b) {
                System.out.println("A ordem desejada é: " + a + " - " + c + " - " + b);
            }
        }
    }
}
