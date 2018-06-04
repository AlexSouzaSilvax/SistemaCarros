package ExercJG.FundamentosProgamacao_Livro.cap3;

import java.io.IOException;
import javax.swing.JOptionPane;

public class InstrucaoThrows {

    public static void main(String[] args) throws IOException {

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça a sua idade:"));

            if (idade < 18) {
                throw new Exception("Menor de Idade, entrada não permitida! :(");
            } else {
                JOptionPane.showMessageDialog(null, "Idade Válida, entrada permitida! :)");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
