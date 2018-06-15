package testes;

import java.util.Scanner;

public class Corre_aula_17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma nota");

        double nota = scan.nextDouble();

        if (nota >= 0 && nota <= 10) {
            System.out.println();
        }

    }
}
