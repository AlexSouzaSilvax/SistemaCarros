package ExercJG.Java8_Livro.cap10;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Pag218Exerc05 {

    public static void main(String[] args) {
        String vCompra = JOptionPane.showInputDialog(null, "Digite o valor da compra");
        DecimalFormat df = new DecimalFormat("###,###.00");
        Object[] op = {"3", "6", "12"};
        String parcelas = (String) JOptionPane.showInputDialog(null, "Selecione a quantidade de parcelas:\n", "Parcelas",
                JOptionPane.PLAIN_MESSAGE,
                null, op, "3");
        double valorCompra = Double.parseDouble(vCompra);
        int qtdParcelas = Integer.parseInt(parcelas);
        double valorParcela = 0;

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

//        if (qtdParcelas == 3) {
//            valorParcela = valorCompra / 3; 
//            JOptionPane.showMessageDialog(null,
//                    "\n1º parcela: " + data.format(dft) + "- R$ " + df.format(valorParcela)
//                    + "\n2º parcela: " + data.plusDays(30).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n3º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela));
//        }
//        if (qtdParcelas == 6) {
//            valorParcela = valorCompra / 6;
//            JOptionPane.showMessageDialog(null,
//                    "\n1º parcela: " + data.format(dft) + "- R$ " + df.format(valorParcela)
//                    + "\n2º parcela: " + data.plusDays(30).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n3º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n4º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n5º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n6º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela));
//        }
//        if (qtdParcelas == 12) {
//            valorParcela = valorCompra / 12;
//            JOptionPane.showMessageDialog(null,
//                    "\n1º parcela: " + data.format(dft) + "- R$ " + df.format(valorParcela)
//                    + "\n2º parcela: " + data.plusDays(30).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n3º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n4º parcela: " + data.plusDays(90).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n5º parcela: " + data.plusDays(120).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n6º parcela: " + data.plusDays(150).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n7º parcela: " + data.plusDays(180).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n8º parcela: " + data.plusDays(210).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n9º parcela: " + data.plusDays(240).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n10º parcela: " + data.plusDays(270).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n11º parcela: " + data.plusDays(300).format(dft) + " - R$ " + df.format(valorParcela)
//                    + "\n12º parcela: " + data.plusDays(330).format(dft) + " - R$ " + df.format(valorParcela));
//        }
        switch (qtdParcelas) {
            case 3:
                valorParcela = valorCompra / 3;
                JOptionPane.showMessageDialog(null,
                        "\n1º parcela: " + data.format(dft) + "- R$ " + df.format(valorParcela)
                        + "\n2º parcela: " + data.plusDays(30).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n3º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela));
                break;
            case 6:
                valorParcela = valorCompra / 6;
                JOptionPane.showMessageDialog(null,
                        "\n1º parcela: " + data.format(dft) + "- R$ " + df.format(valorParcela)
                        + "\n2º parcela: " + data.plusDays(30).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n3º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n4º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n5º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n6º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela));
                break;
            case 12:
                valorParcela = valorCompra / 12;
                JOptionPane.showMessageDialog(null,
                        "\n1º parcela: " + data.format(dft) + "- R$ " + df.format(valorParcela)
                        + "\n2º parcela: " + data.plusDays(30).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n3º parcela: " + data.plusDays(60).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n4º parcela: " + data.plusDays(90).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n5º parcela: " + data.plusDays(120).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n6º parcela: " + data.plusDays(150).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n7º parcela: " + data.plusDays(180).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n8º parcela: " + data.plusDays(210).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n9º parcela: " + data.plusDays(240).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n10º parcela: " + data.plusDays(270).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n11º parcela: " + data.plusDays(300).format(dft) + " - R$ " + df.format(valorParcela)
                        + "\n12º parcela: " + data.plusDays(330).format(dft) + " - R$ " + df.format(valorParcela));
                break;
        }
    }
}
