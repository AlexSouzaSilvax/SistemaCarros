package ExercJG.FundamentosProgamacao_Livro.cap3;

import javax.swing.JOptionPane;

public class Pag00Exerc00 {

    public static void main(String[] args) {

        String aux = JOptionPane.showInputDialog(null, "Entre com um numero do mês:");

        if (aux != null) {
            try {

                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null, "Número do mês válido!\n " + mes);
                } else {
                    JOptionPane.showMessageDialog(null, "Número do mês inválido!\n");
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros." + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!!!");
        }
        System.exit(0);
    }
}
