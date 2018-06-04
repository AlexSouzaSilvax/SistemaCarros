package ExercJG.Java8_Livro.cap5;

import javax.swing.JOptionPane;

public class TestesteET {

    public static void main(String[] args) {

        int[] senhas = {1684, 5673, 0303, 6464, 203040, 1050};
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Entre com uma senha válida:"));
        String mensagem = "Senha não encontrada";
        for (int elemento : senhas) {
            if (elemento == senha) {
                mensagem = "Senha Encotrada.";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}
