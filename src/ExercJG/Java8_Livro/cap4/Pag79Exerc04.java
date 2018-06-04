package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class Pag79Exerc04 {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        String semEspacos = frase.replace(" ", ""); //retira espaços
        String espelho = "";
        for (int i = semEspacos.length() - 1; i >= 0; i--) {
            espelho += semEspacos.charAt(i);
        }
        JOptionPane.showMessageDialog(null,
                "\nFrase fornecida: " + frase
                + "\nFrase de trás para frente: " + espelho);
        System.exit(0);
    }
}
