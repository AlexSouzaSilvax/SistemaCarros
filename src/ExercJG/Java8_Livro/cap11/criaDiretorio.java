package ExercJG.Java8_Livro.cap11; // Pag 220

import java.io.File;
import javax.swing.JOptionPane;

public class criaDiretorio {

    public static void main(String[] args) {

        File dir = new File("c:/loja");

        if (!dir.exists()) {
            dir.mkdir();
        }
        dir = new File("c:/loja/site");
        if (!dir.exists()) {
            dir.mkdir();
        }
        dir = new File("C:\\Users\\Crossystem\\Google Drive\\imagensS");
        if (!dir.exists()) {
            dir.mkdir();
            JOptionPane.showMessageDialog(null, "Sucesso, Seu diretório foi criado!");
        } else {
            JOptionPane.showMessageDialog(null, "Já exite um diretório com esse nome!");
        }

    }
}
