package ExercJG.Java8_Livro.cap6;

import javax.swing.JOptionPane;

public class Pag103Exerc04 {

    public static int gerar() {

        String senha = "";
        for (int i = 1; i <= 8; i++) {
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);

        return 0;
    }
}
