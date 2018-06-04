/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercJG.FundamentosProgamacao_Livro.cap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Casa
 */
public class UsoDaClasseBufferedReader {

    public static void main(String[] args) throws IOException {

        String s;
        float largura, comprimento, area, perimetro;
        BufferedReader dado;
        try {
            System.out.println("Entre com o comprimento:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com a largura:");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo : " + area);
            System.out.println("Perímetro do retângulo : " + perimetro);

        } catch (IOException erro) {
            System.err.println("Houve erro na entrada de dados " + erro.toString());
        } catch (NumberFormatException erro) {
            System.err.println("Houve erro na conversão, digite apenas caracteres numéricos " + erro.toString());
        }
    }
}
