package ExercJG.Java8_Livro.cap5;

import javax.swing.JOptionPane;

public class Pag87Exerc02 {

    public static void main(String[] args) {

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                          "Junho", "Julho", "Agosto", "Setembro",
                          "Outubro", "Novembro", "Dezembro"};
        int numMes = (int) (Math.random() * 12);
        JOptionPane.showMessageDialog(null, "Mês sorteado : " + meses[numMes]);
    }
}
