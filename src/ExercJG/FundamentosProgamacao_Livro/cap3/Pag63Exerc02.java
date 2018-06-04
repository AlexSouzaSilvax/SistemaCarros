// 01/12/2017

package ExercJG.FundamentosProgamacao_Livro.cap3;

import javax.swing.JOptionPane;

public class Pag63Exerc02 {

    public static void main(String[] args) {

        int re1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Resistência 1 :"));
        int re2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Resistência 2 :"));
        int re3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Resistência 3 :"));

        JOptionPane.showMessageDialog(null, "Resistências fornecidas: " + re1 + ", " + re2 + ", " + re3);

        if (re1 > re2 && re1 > re3) {
            JOptionPane.showMessageDialog(null, "A maior Resistência é : " + re1);
        }
        if (re2 > re1 && re2 > re3) {
            JOptionPane.showMessageDialog(null, "A maior Resistência é : " + re2);
        }
        if (re3 > re1 && re3 > re2) {
            JOptionPane.showMessageDialog(null, "A maior Resistência é : " + re3);
        }
        if (re1 < re2 && re1 < re3) {
            JOptionPane.showMessageDialog(null, "A menor Resistência é : " + re1);
        }
        if (re2 < re1 && re2 < re3) {
            JOptionPane.showMessageDialog(null, "A menor Resistência é : " + re2);
        }
        if (re3 < re1 && re3 < re2) {
            JOptionPane.showMessageDialog(null, "A menor Resistência é : " + re3);
        }
    }
}
