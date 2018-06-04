package ExercJG.Java8_Livro.cap2;

import java.util.*;

public class UsoDaClasseScanner {

    public static void main(String[] args) {

        float largura, comprimento, area, perimetro;
        Scanner sc;
        try {
            System.out.println("Entre com o comprimento : ");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println("Entre com a largura : ");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Ã�rea do retÃ¢ngulo : " + area);
            System.out.println("Perimetro do retÃ¢ngulo : " + perimetro);
        } catch (NumberFormatException erro) {
            System.err.println("Houve erro na conversÃ£o, digite apenas caracteres numÃ©ricos " + erro.toString());
        }
    }
}
