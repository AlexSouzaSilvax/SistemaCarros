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
class aueee {

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

class breakEContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
    }
}

class breakRotulos {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo1;
                        }
                        if (i == 3) {
                            break rotulo1;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println("valor de i: " + i);
        }
        System.out.println("Saiu do loop.");

    }
}
