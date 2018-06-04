package ExercJG.Java8_Livro.cap8;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pag192Exerc01 extends JPanel {

    private JButton button[][];
    // private JLabel label[][];
    private ImageIcon ic;
   // private String file = "\\\\Jgserver\\jgserver\\Alunos\\Turmas\\Turma 1 - Programação\\Alex GUANABARA\\cursoJava\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\branco.jpg";
    private String file = "C:\\Users\\Local de Estudo\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\branco.jpg";

    public Pag192Exerc01() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(8, 8, 0, 0));
        button = new JButton[8][8];
        //button.setBackground(Color.BLACK);
        //label = new JLabel[8][8];
        ic = new ImageIcon(file);
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                button[linha][coluna] = new JButton(ic);
                add(button[linha][coluna] = new JButton(ic));
                if (coluna != 7) {
                    trocar();
                }
            }
        }
    }

    private void trocar() {
       // if (file.equals("\\\\Jgserver\\jgserver\\Alunos\\Turmas\\Turma 1 - Programação\\Alex GUANABARA\\cursoJava\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\branco.jpg")) {
        if (file.equals("C:\\Users\\Local de Estudo\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\branco.jpg")) {
            //file = "\\\\Jgserver\\jgserver\\Alunos\\Turmas\\Turma 1 - Programação\\Alex GUANABARA\\cursoJava\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\preto.jpg";
            file = "C:\\Users\\Local de Estudo\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\preto.jpg";
        } else {
           // file = "\\\\Jgserver\\jgserver\\Alunos\\Turmas\\Turma 1 - Programação\\Alex GUANABARA\\cursoJava\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\branco.jpg";
            file = "C:\\Users\\Local de Estudo\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Imagens\\branco.jpg";
        }
        ic = new ImageIcon(file);
    }
}
