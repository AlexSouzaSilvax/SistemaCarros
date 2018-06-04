//  01/12/2017
//  R.I.P quando eu fiz esse codigo so eu e Deus sabia, agora só Deus...
package ExercJG.Java8_Livro.cap3;

import javax.swing.JOptionPane;

public class Pag62Exer01 {

    public static void main(String[] args) {

        String nomeProduto = JOptionPane.showInputDialog("Entre com o nome do produto:");
        int precoProduto = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do produto:"));
        int precoDesc;
        int novoPrecoProduto;

        if (precoProduto >= 50 && precoProduto < 200) {

            precoDesc = (precoProduto * 5 / 100);
            novoPrecoProduto = precoProduto - precoDesc;

            JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto + "\n"
                    + "Preço Original do Produto: R$ " + precoProduto + "\n"
                    + "Preço do Produto com Desconto: R$ " + novoPrecoProduto);
        }
        if (precoProduto >= 200 && precoProduto < 500) {

            precoDesc = (precoProduto * 6 / 100);
            novoPrecoProduto = precoProduto - precoDesc;

            JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto + "\n"
                    + "Preço Original do Produto: R$ " + precoProduto + "\n"
                    + "Preço do Produto com Desconto: R$ " + novoPrecoProduto);
        }
        if (precoProduto >= 500 && precoProduto < 1000) {

            precoDesc = (precoProduto * 7 / 100);
            novoPrecoProduto = precoProduto - precoDesc;

            JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto + "\n"
                    + "Preço Original do Produto: R$ " + precoProduto + "\n"
                    + "Preço do Produto com Desconto: R$ " + novoPrecoProduto);
        }
        if (precoProduto >= 100) {

            precoDesc = (precoProduto * 8 / 100);
            novoPrecoProduto = precoProduto - precoDesc;

            JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto + "\n"
                    + "Preço Original do Produto: R$ " + precoProduto + "\n"
                    + "Preço do Produto com Desconto: R$ " + novoPrecoProduto);
        } else if (precoProduto <= 49) {
            JOptionPane.showMessageDialog(null, "Desconto somente acima de R$ 50,00.");
        }
    }
}
