package ExercJG;

import java.util.Scanner;

public class Pag97Exerc24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double imposto = 0.00, preco = 0.00, precoCusto = 0.00;
        String tipo, ref;

        System.out.println("Insira o preço do Produto\n");
        preco = scan.nextDouble();

        System.out.println("Insira o tipo do Produto\n" + "Digite uma das opções abaixo:\n" + "A para Alimentação\n" + "L para Limpeza\n" + "V para Vestuário\n");
        tipo = scan.next();

        System.out.println("Produto Refrigerado?\n" + "Digite: S | N \n");
        ref = scan.next();

        if (ref == "N") {
            if (tipo == "A") {
                if (preco < 15.00) {
                    preco = preco + 2.00;
                    System.out.println("Valor Adicional: 2,00 \n");
                    System.out.println("Novo preço: " + preco + "\n");
                }
                if (preco >= 15.00) {
                    preco = preco + 5.00;
                    System.out.println("Valor Adicional: 5,00 \n");
                    System.out.println("Novo preço: " + preco + "\n");
                }
            }
        }
        if (tipo == "L") {
            //O "Se" abaixo verifica se o preço é menor que 10,00 (UTILIZE 10.00)
            if (preco < 10.00) {
                preco = preco + 1.50;
                System.out.println("Valor Adicional: 1,50 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
            //O "Se" abaixo verifica se o preço é maior ou igual que 10,00 (UTILIZE 10.00)
            if (preco >= 10.00) {
                preco = preco + 2.50;
                System.out.println("Valor Adicional: 2,50 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
        }
        //O "Se" abaixo verifica se o produto é do tipo V
        if (tipo == "V") {
            //O "Se" abaixo verifica se o preço é menor que 30,00 (UTILIZE 30.00)
            if (preco < 30.00) {
                preco = preco + 3.00;
                System.out.println("Valor Adicional: 3,00 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
            //O "Se" abaixo verifica se o preço é maior ou igual que 30,00 (UTILIZE 30.00)
            if (preco >= 30.00) {
                preco = preco + 2.50;
                System.out.println("Valor Adicional: 2,50 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
        }

        if (ref == "S") {
            if (tipo == "A") {
                //Apenas realizar a soma de R$8,00 ao preço e mostra na tela
                preco = (preco + 8.00);
                System.out.println("Valor Adicional: 8,00 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
            //O "Se" abaixo verifica se o produto é do tipo L
            if (tipo == "L") {
                preco = preco + 0.00;
                System.out.println("Valor Adicional: 0,00 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
            //O "Se" abaixo verifica se o produto é do tipo V
            if (tipo == "V") {
                //Apenas realizar a soma de R$8,00 ao preço e mostra na tela
                preco = preco + 0.00;
                System.out.println("Valor Adicional: 0,00 \n");
                System.out.println("Novo preço: " + preco + "\n");
            }
        }// Aqui se encerra o bloco de Instruções do segundo SE - se (ref == 'S'){

        if (preco < 25) {
            imposto = (0.05 * preco);
            System.out.println("Imposto: \t" + imposto + "\n");
        }

        if (preco >= 25) {
            imposto = (0.08 * preco);
            System.out.println("Imposto: \t" + imposto + "\n");
        }

        precoCusto = (preco + imposto);

        System.out.println("O preço de Custo do produto é: \t" + precoCusto + "\n");

        if (tipo != "A" && ref != "S") {
            precoCusto = precoCusto - (precoCusto * 0.03);
        }

        if (precoCusto <= 50) {
            System.out.println("Barato \n");
        } else if (precoCusto >= 50 && precoCusto < 100) {
            System.out.println("Normal \n");
        } else {
            System.out.println("Caro \n");
        }
    }

}
