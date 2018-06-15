package testes;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class calcMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Digite seu nome completo:");
        //String nomeCompleto = scan.nextLine();
        //System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println("Digite a nota do 1° Bimestre:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota do 2° Bimestre:");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota do 3° Bimestre:");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a nota do 4° Bimestre:");
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média foi: " + media);

        System.out.println("A média é 5.0");

        if (media >= 5) {
            System.out.println("Parabéns, Você foi aprovado.");
        }

        if (media < 5) {
            System.err.println("Você foi REPROVADO, Estude mais!!!");
        }
    }
}
