package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class Pag78Exerc02 {

    public static void main(String[] args) {
        /*
         int precoProduto = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do Produto:"));

         int precoAcrecimo = (precoProduto * 12 / 100);
         int novoPrecoProduto = precoProduto + precoAcrecimo;
         JOptionPane.showMessageDialog(null, "Valor Do Produto: " + precoProduto
         + "\nValor Do Produto com Acrecimo: " + novoPrecoProduto
         + "\nValor Arredondado: " + Math.round(precoProduto));
         */
        double valorProduto;
        while (true) {
            String aux = JOptionPane.showInputDialog("Forneça o valor do produto:");
            if (aux == null) {
                break;
            }
            try {
                valorProduto = Float.parseFloat(aux);
                float valorComAcrescimo = (float) (valorProduto * 1.12);
                JOptionPane.showMessageDialog(null, "O valor com acréscimo é R$: " + valorComAcrescimo
                        + "\nValor arredondado R$: " + Math.round(valorComAcrescimo));
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Falha, forneça apenas valores numéricos");
            }
            System.exit(0);
        }
    }
}
