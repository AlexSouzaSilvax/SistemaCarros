package ExercJG.Java8_Livro.cap3;
// PÃA~~AA~~AAÃÃÃÃAAAÃAÃÃÃÃÃÃ
// Consegui uhullllll hshsuhsushushsuhs 02/12/2017 17:00hrs By: GUANABARA! 

import javax.swing.JOptionPane;

public class Pag63Exerc03 {

    public static void main(String[] args) {

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

    }
}

/*


class testeUser {
// Feito pelo Prof Gabriel

    public static void main(String[] args) {
        String login, senha;
        int cont = 3;

        do {
            login = JOptionPane.showInputDialog("Insira seu login:");
            senha = JOptionPane.showInputDialog("Entra com sua senha:");

            if (login != null && senha != null) {
                if ("java8".equals(login) && senha == "123") {
                    JOptionPane.showMessageDialog(null, "Login e Senha aceitos.");
                    cont = 0;
                } else {
                    cont = cont - 1;
                    JOptionPane.showMessageDialog(null, "Falha, verfique login e senha\n" + "Voce tem mais: " + cont + " tentativas");

                }
            }
        } while (cont > 0);
    }
}

 */
