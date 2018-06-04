package ExercJG.cap4;
// guanabara pa 
import javax.swing.JOptionPane;

public class UsoDoRandom {

    public static void main(String[] args) {

        String senha = "";
        for (int i = 1; i <= 10; i++) {
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);

        for (int cartao = 1; cartao <= 10; cartao++) { // número de cartões
            String numerosCartao = "";
            for (int numCartao = 1; numCartao <= 6; numCartao++) { // qtde de números por cartão

                int num = (int) (Math.random() * 100);
                numerosCartao += num + "  ";
            }
            JOptionPane.showMessageDialog(null, "Números do cartão: " + cartao
                    + "\n" + numerosCartao);
        }
        System.exit(0);
    }
}
