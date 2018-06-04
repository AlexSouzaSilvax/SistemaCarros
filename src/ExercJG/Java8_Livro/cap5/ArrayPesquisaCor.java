package ExercJG.Java8_Livro.cap5;

import javax.swing.JOptionPane;

public class ArrayPesquisaCor {

    public static void main(String[] args) {

        String[] cores = {"black", "red", "green", "yellow", "white"};
        String cor = JOptionPane.showInputDialog("Entre com uma cor:");
        String mensagem = "Cor não encontrada.";
        for (String elemento : cores) {
            if (elemento.equals(cor)) {
                mensagem = "Cor Encontrada.";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}
