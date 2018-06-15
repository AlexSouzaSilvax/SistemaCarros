/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author Maquina 01
 */
class VariaveisInteiras {

    public static void main(String[] args) {

        byte idade01 = 20;

        short idade02 = 22;

        int idade03 = 23;

        long idade04 = 24;

        System.out.println("Valor váriavel idade01 = " + idade01);
        System.out.println("Valor váriave2 idade02 = " + idade02);
        System.out.println("Valor váriave3 idade03 = " + idade03);
        System.out.println("Valor váriave4 idade04 = " + idade04);
    }
}

class VariaveisPontoFlutuante {

    public static void main(String[] args) {

        double valorPassagem = 2.90;

        float valorTomate = 3.95f;

        System.out.println("Valor da passagem = " + valorPassagem);

        System.out.println("Valor da tomate = " + valorTomate);

    }
}

class teste {

    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, calc_media;
        nota1 = 5;
        nota2 = 5;
        nota3 = 5;
        nota4 = 5;
        calc_media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media e = " + calc_media);
    }
}

class test {

    public static void main(String[] args) {

        int vo1, pai2, mae3, tia4, soma;

        vo1 = 50;
        pai2 = 30;
        mae3 = 20;
        tia4 = 40;
        soma = (vo1 + pai2 + mae3 + tia4);
        System.out.println("Você tem = " + soma);
    }
}

class casa {

    public static void main(String[] args) {
    }
}

class CurisosidadeInt {

    public static void main(String[] args) {

        int var1 = 2147483647;

        int var2 = 100;

        System.out.println(var1 / var2);


    }
}

class aula11 {

    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int soma;
        soma = (a + b) / 2;

        System.out.println("O resultado é = " + soma);

    }
}

class aula12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);

    }
}

