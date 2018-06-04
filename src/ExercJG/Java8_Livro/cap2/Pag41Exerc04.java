package ExercJG.Java8_Livro.cap2;

import javax.swing.JOptionPane;


public class Pag41Exerc04 {

    public static void main(String[] args) {

        String aux;
        double NotaProva1, NotaProva2, NotaTrabalho, media;
        try {

            aux = JOptionPane.showInputDialog("Entre com a nota da prova 1 : ");
            NotaProva1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a nota da prova 2 : ");
            NotaProva2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a nota do trabalho : ");
            NotaTrabalho = Float.parseFloat(aux);

            media = (NotaProva1 + NotaProva2 + NotaTrabalho) / 3;

            JOptionPane.showMessageDialog(null, "A sua média é : " + media);
            JOptionPane.showMessageDialog(null, "A média é 6,0");
            JOptionPane.showMessageDialog(null, "O total foi : " + NotaProva1 + NotaProva2 + NotaTrabalho);

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "Parabéns, Você foi aprovado.");
            }
            if (media < 6) {
                JOptionPane.showMessageDialog(null, "Você foi REPROVADO, Estude mais!!!");
            }

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos." + erro.toString());
        }
        System.exit(0);
    }

}
