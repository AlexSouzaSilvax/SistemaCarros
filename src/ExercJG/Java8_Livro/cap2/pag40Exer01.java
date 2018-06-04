package ExercJG.Java8_Livro.cap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.*;

public class pag40Exer01 {

    /*
      public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float precoProduto, pcDesc, novoPrecoProduto, valorDescontado;

        System.out.println("Entre com o valor do produto:");
        precoProduto = scan.nextInt();

        System.out.println("Entre com o a porcentagem do desconto:");
        pcDesc = scan.nextInt();

        valorDescontado = precoProduto * (pcDesc / 100);
        novoPrecoProduto = precoProduto - valorDescontado;

        System.out.println("O pre�o �: " + precoProduto);
        System.out.println("O desconto ser� de: " + pcDesc);
        System.out.println("O valor descontado �: " + valorDescontado);
        System.out.println("O novo pre�o do produto �: " + novoPrecoProduto);

     */
    public static void main(String[] args) {

        String s;
        float ValorProduto, ValorDesconto, PercentualDesconto = 0;
        BufferedReader dado;
        try {
            System.out.println("Entre com o valor do produto:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            ValorProduto = Float.parseFloat(s);

            System.out.println("Entre com a porcentagem de desconto:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            ValorDesconto = Float.parseFloat(s);

            PercentualDesconto = ValorProduto - (ValorProduto * ValorDesconto) / 100;
            System.out.println("Valor do Produto: " + ValorProduto);
            System.out.println("Valor do Produto com desconto: " + PercentualDesconto);

        } catch (IOException erro) {
            System.err.println("Houve erro na entrada de dados " + erro.toString());
        } catch (NumberFormatException erro) {
            System.err.println("Houve erro na conversão, digite apenas caracteres numéricos " + erro.toString());
        }
    }
}
