package ExercJG.Java8_Livro.cap5;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Pag87Exerc01 {

    public static void main(String[] args) {

        float[] notas = new float[5];
        float soma = 0, media;
        for (int i = 0; i < 5; i++) {
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a nota: " + (i + 1)));
            soma = soma + notas[i];
        }
        media = soma / 5;
        Arrays.sort(notas);
        System.out.println("Média: " + media);
        System.out.println("Notas:");
        for (int i = notas.length - 1; i >= 0; i--) {
            System.out.println(notas[i] + ", ");
        }
        System.exit(0);
    }
}
