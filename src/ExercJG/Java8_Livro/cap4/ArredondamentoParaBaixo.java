package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class ArredondamentoParaBaixo {

    public static void main(String[] args) {

        float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota da prova?"));
        JOptionPane.showMessageDialog(null, "Nota original: " + nota
                + "\nArredondada para baixo: " + Math.floor(nota));
        
        System.exit(0);
    }
}
