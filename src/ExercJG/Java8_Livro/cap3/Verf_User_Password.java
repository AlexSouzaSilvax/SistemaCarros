package ExercJG.Java8_Livro.cap3;
// GUANABARA É O REI  
import javax.swing.JOptionPane;

public class Verf_User_Password {

    public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog(null, "Entre com um usuário:");
        String senha = JOptionPane.showInputDialog(null, "Entre com uma senha:");

        if (usuario != null) {
            try {
                if (!"guanabara".equals(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuário inválido!\n" + usuario);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário válido!\n " + usuario);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Você não tem acesso bitch" + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!!!");
        }

        if (senha != null) {
            try {

                int password = Integer.parseInt(senha);

                if (password == 123) {
                    JOptionPane.showMessageDialog(null, "Senha Válida!\n" + "*****");
                } else {
                    JOptionPane.showMessageDialog(null, "Senha Inválida!");
                }

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Você não tem acesso, bitch!" + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }
    }
}
