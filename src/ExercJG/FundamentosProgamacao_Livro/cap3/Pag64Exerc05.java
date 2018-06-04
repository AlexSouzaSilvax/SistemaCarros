package ExercJG.FundamentosProgamacao_Livro.cap3;
// guana 04/12/2017 10h:21m
import javax.swing.JOptionPane;

public class Pag64Exerc05 {

    public static void main(String[] args) {

        int opcMenu = Integer.parseInt((JOptionPane.showInputDialog("Digite uma opção:\n"
                + "1- Exercicío 1\n"
                + "2- Exercicío 2\n"
                + "3- Exercicío 3\n"
                + "4- Exercicío 4\n")));

        switch (opcMenu) {

            case 1:

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
                break;

            case 2:

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
                break;

            case 3:

                int cont = 3;

                do {
                    String login = JOptionPane.showInputDialog(null, "Forneça um login:");
                    int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça uma senha:"));

                    if (login != null && senha != 000) {
                        if ("guanabara".equals(login) && senha == 123) {
                            JOptionPane.showMessageDialog(null, "Login e Senha Válidos!\n ");
                            cont = 0;
                        } else {
                            cont = cont - 1;
                            JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos!\n" + "Voce tem mais: " + cont + " tentativas");
                            if (cont == 0) {
                                JOptionPane.showMessageDialog(null, "Favor tente novamente com login e senha válidas!!!");
                            }
                        }
                    }
                } while (cont > 0);
                break;

            case 4:

                int numeroTabu = Integer.parseInt(JOptionPane.showInputDialog("     Tabuada do Guanabara   \nForneça um número:\nEntre 1 e 10"));

                switch (numeroTabu) {

                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 1 \n"
                                + "1 x 1 = 1\n"
                                + "1 x 2 = 2\n"
                                + "1 x 3 = 3\n"
                                + "1 x 4 = 4\n"
                                + "1 x 5 = 5\n"
                                + "1 x 6 = 6\n"
                                + "1 x 7 = 7\n"
                                + "1 x 8 = 8\n"
                                + "1 x 9 = 9\n"
                                + "1 x 10 = 10");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 2 \n"
                                + "2 x 1 = 2\n"
                                + "2 x 2 = 4\n"
                                + "2 x 3 = 6\n"
                                + "2 x 4 = 8\n"
                                + "2 x 5 = 10\n"
                                + "2 x 6 = 12\n"
                                + "2 x 7 = 14\n"
                                + "2 x 8 = 16\n"
                                + "2 x 9 = 18\n"
                                + "2 x 10 = 20");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 3 \n"
                                + "3 x 1 = 3\n"
                                + "3 x 2 = 6\n"
                                + "3 x 3 = 9\n"
                                + "3 x 4 = 12\n"
                                + "3 x 5 = 15\n"
                                + "3 x 6 = 18\n"
                                + "3 x 7 = 21\n"
                                + "3 x 8 = 24\n"
                                + "3 x 9 = 27\n"
                                + "3 x 10 = 30");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 4 \n"
                                + "4 x 1 = 4\n"
                                + "4 x 2 = 8\n"
                                + "4 x 3 = 12\n"
                                + "4 x 4 = 16\n"
                                + "4 x 5 = 20\n"
                                + "4 x 6 = 24\n"
                                + "4 x 7 = 28\n"
                                + "4 x 8 = 32\n"
                                + "4 x 9 = 36\n"
                                + "4 x 10 = 40");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 5 \n"
                                + "5 x 1 = 5\n"
                                + "5 x 2 = 10\n"
                                + "5 x 3 = 15\n"
                                + "5 x 4 = 20\n"
                                + "5 x 5 = 25\n"
                                + "5 x 6 = 30\n"
                                + "5 x 7 = 35\n"
                                + "5 x 8 = 40\n"
                                + "5 x 9 = 45\n"
                                + "5 x 10 = 40");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 6 \n"
                                + "6 x 1 = 6\n"
                                + "6 x 2 = 12\n"
                                + "6 x 3 = 18\n"
                                + "6 x 4 = 24\n"
                                + "6 x 5 = 30\n"
                                + "6 x 6 = 36\n"
                                + "6 x 7 = 42\n"
                                + "6 x 8 = 48\n"
                                + "6 x 9 = 54\n"
                                + "6 x 10 = 60");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 7 \n"
                                + "7 x 1 = 7\n"
                                + "7 x 2 = 14\n"
                                + "7 x 3 = 21\n"
                                + "7 x 4 = 28\n"
                                + "7 x 5 = 35\n"
                                + "7 x 6 = 42\n"
                                + "7 x 7 = 49\n"
                                + "7 x 8 = 56\n"
                                + "7 x 9 = 63\n"
                                + "7 x 10 = 70");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 8 \n"
                                + "8 x 1 = 8\n"
                                + "8 x 2 = 16\n"
                                + "8 x 3 = 24\n"
                                + "8 x 4 = 32\n"
                                + "8 x 5 = 40\n"
                                + "8 x 6 = 48\n"
                                + "8 x 7 = 56\n"
                                + "8 x 8 = 64\n"
                                + "8 x 9 = 72\n"
                                + "8 x 10 = 80");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 9 \n"
                                + "9 x 1 = 9\n"
                                + "9 x 2 = 18\n"
                                + "9 x 3 = 27\n"
                                + "9 x 4 = 36\n"
                                + "9 x 5 = 45\n"
                                + "9 x 6 = 54\n"
                                + "9 x 7 = 63\n"
                                + "9 x 8 = 72\n"
                                + "9 x 9 = 81\n"
                                + "9 x 10 = 90");
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null,
                                "Tabuada do nº 10 \n"
                                + "10 x 1 = 10\n"
                                + "10 x 2 = 20\n"
                                + "10 x 3 = 30\n"
                                + "10 x 4 = 40\n"
                                + "10 x 5 = 50\n"
                                + "10 x 6 = 60\n"
                                + "10 x 7 = 70\n"
                                + "10 x 8 = 80\n"
                                + "10 x 9 = 90\n"
                                + "10 x 10 = 100");
                        break;
                    default: {
                        JOptionPane.showMessageDialog(null, "You is dumb?");
                    }
                }
                break;
            default: {
                        JOptionPane.showMessageDialog(null, "Entre com um numero de exercicio válido BITCH !!!");
            
            }
        }

    }
}
