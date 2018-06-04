package ExercJG.Java8_Livro.cap2;
// GUANABARA É O REI 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Pag41Exerc05 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int IdadeH = 0, IH = 65, IM = 60, IdadeM;
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo:\n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino");
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Você pressionou Cancel");
        }
        if (resp == "Masculino") {

            JOptionPane.showMessageDialog(null, "Você é homem.");
            JOptionPane.showInputDialog("Informe sua idade : ");

            if (IdadeH >= IH) {
                JOptionPane.showMessageDialog(null, "Você pode se aposentar pela idade.");
            }
            if (IdadeH < IH) {
                JOptionPane.showMessageDialog(null, "Você ainda não pode se aposentar pela idade.\nInforme quantos anos você tem de contribuição : ");
            }
        }
        if (resp == "Feminino") {
            JOptionPane.showMessageDialog(null, "Você é mulher.");

            JOptionPane.showInputDialog("Informe sua idade : ");
            IdadeM = in.read();

            if (IdadeM >= IM) {
                JOptionPane.showMessageDialog(null, "Você pode se aposentar pela idade.");
            } else {
                JOptionPane.showMessageDialog(null, "Você ainda não pode se aposentar pela idade.\nInforme quantos anos você tem de contribuição : ");
            }

        }

        System.exit(0);
    }
}
