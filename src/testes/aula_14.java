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
class Aula14IfQuadrinho {

    public static void main(String[] args) {

        boolean temBatata = true;
        int ovos = 6;

        if (temBatata) {
            ovos = 9;
        }

        System.out.println("Compre " + ovos + " ovos.");
    }
}

class Aula14IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a sua idade");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
        //barato <=10
        //10 < valor <15 - pedir desconto
        //15 <= valor 17 - pesquisar mais
        //>= - muito caro

        System.out.println("Entre com o preço do item");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {// valor >=17
            System.out.println("Muito caro");
        }
    }
}