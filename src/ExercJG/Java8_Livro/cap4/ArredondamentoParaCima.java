package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

public class ArredondamentoParaCima {
    
    public static void main(String[] args) {
        
        final float LOTACAO_ONIBUS = 50;
        int numeroPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de Passageiros?"));
        float qtdOnibus = numeroPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numeroPassageiros
                + "\nQuantidade Calculada: " + qtdOnibus
                + "\nQuantidade de Ônibus necessários: " + (int) Math.ceil(qtdOnibus));
        System.exit(0);
    }
}
