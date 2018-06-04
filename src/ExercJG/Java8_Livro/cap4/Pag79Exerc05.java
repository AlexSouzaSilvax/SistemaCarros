package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class Pag79Exerc05 {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        String p1 = "sexo";
        String p2 = "sexual";
        int pos = 0;
        if (frase.indexOf(p1, pos) >= 0 || frase.indexOf(p2, pos) >= 0) {
            JOptionPane.showMessageDialog(null, "Conteúdo impróprio.");
        } else {
            JOptionPane.showMessageDialog(null, "Conteúdo Liberado.");
        }
        System.exit(0);
    }
}
