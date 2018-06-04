package ExercJG.Java8_Livro.cap2;

import javax.swing.JOptionPane;

public class Pag41Exerc03 {
    public static void main(String[] args) {

        String aux;
        float ValorTransacao, ValorPenal, PercentualImpostos, ValorImposto;
        try {

            aux = JOptionPane.showInputDialog("Entre com o valor da transação : ");
            ValorTransacao = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com o valor penal : ");
            ValorPenal = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com o percentual de impostos : ");
            PercentualImpostos = Float.parseFloat(aux);

            ValorImposto = ValorTransacao + ValorPenal * PercentualImpostos / 100;
            JOptionPane.showMessageDialog(null, "O valor do imposto a ser pago é : " + ValorImposto);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos." + erro.toString());
        }
        System.exit(0);
    }

}