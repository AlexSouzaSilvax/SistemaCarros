package ExercJG;

import java.util.Scanner;

public class Pag77Exerc08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, soma, raiz;
        int op;
        System.out.println(" MENU");
        System.out.println("1- Somar dois números");
        System.out.println("2- Raiz quadrada de um número");
        System.out.println("Digite a sua opção: ");
        op = scan.nextInt();

        switch (op) {

            case 1:
                System.out.println("Digite um valor para o primeiro número: ");
                num1 = scan.nextDouble();
                System.out.println("Digite um valor para o segundo número: ");
                num2 = scan.nextDouble();
                soma = (num1 + num2);
                System.out.println("A soma de " + num1 + " + " + num2 + " é " + soma);
                break;

            case 2:
                System.out.println("Digite um valor: ");
                num1 = scan.nextDouble();
                raiz = (num1 / 3);
                System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
                break;

            default:
                System.err.println("Você digitou uma opção inválida!");

        }
    }
}
