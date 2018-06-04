package ExercJG;

import javax.swing.JOptionPane;


public class CaixaDialogoEntradaDados {

    public static void main(String[] args) {

        String aux;
        float largura, comprimento, area, perimetro;
        try {

            aux = JOptionPane.showInputDialog("Entre com o comprimento : ");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a largura : ");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área : " + area + ", Perimetro: " + perimetro);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos." + erro.toString());
        }
        System.exit(0);

    }

}

