package ExercJG.Java8_Livro.cap11;

import java.io.File;
import javax.swing.JOptionPane;

public class listaDiretorio {

    public static void main(String[] args) {

        String path = JOptionPane.showInputDialog("Forneça o caminho "
                + "do diretório (utilize / entre os diretórios)");

        File dir = new File(path);
        if (dir.isDirectory()) {
            JOptionPane.showMessageDialog(null, "Conteúdo do diretório " + path);
            String s[] = dir.list();
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
                //JOptionPane.showMessageDialog(null, s[i]);
            }
        } else {
            JOptionPane.showMessageDialog(null, path + " não é um diretório válido!");
        }
    }
}
