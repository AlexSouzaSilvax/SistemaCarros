package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class Pag79Exerc03 {

    public static void main(String[] args) {

        int numero = (int) (Math.random() * 6) + 5;
        String senha = "";
        for (int i = 1; i <= numero; i++) {
            senha += (int) (Math.random() * i);
        }
        JOptionPane.showMessageDialog(null, "Número sorteado : " + numero
                + "\nSenha Gerada: " + senha);
    }
}
