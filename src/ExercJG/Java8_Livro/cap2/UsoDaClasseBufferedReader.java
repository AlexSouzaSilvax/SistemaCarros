package ExercJG.Java8_Livro.cap2;

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
            System.out.println("Ã�rea do retÃ¢ngulo : " + area);
            System.out.println("PerÃ­metro do retÃ¢ngulo : " + perimetro);

        } catch (IOException erro) {
            System.err.println("Houve erro na entrada de dados " + erro.toString());
        } catch (NumberFormatException erro) {
            System.err.println("Houve erro na conversÃ£o, digite apenas caracteres numÃ©ricos " + erro.toString());
        }
    }
}
