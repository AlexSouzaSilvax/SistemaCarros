package ExercJG;

import java.util.Scanner;

public class Pag74Exerc06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, r;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        r = (num % 2);

        if (r == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
}
