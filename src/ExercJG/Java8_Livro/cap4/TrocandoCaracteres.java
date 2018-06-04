package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class TrocandoCaracteres {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase");
        JOptionPane.showMessageDialog(null, "Frase: " + frase
                + "\nRetirando os espaços: " + frase.replace(" ", "")
                + "\nSubstituindo \"a\" por \"u\": " + frase.replace("a", "u"));
        System.exit(0);
    }
}
