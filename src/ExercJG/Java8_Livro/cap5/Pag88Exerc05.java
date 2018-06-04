package ExercJG.Java8_Livro.cap5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Pag88Exerc05 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("00");
        String[] vagasCarros = new String[10];
        int x;
        for (int i = 0; i < 10; i++) {
            vagasCarros[i] = "Livre";
        }
        while (true) {
            String op = JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1 - Entrada de Veículos"
                    + "\n2 - Saída de Veículos"
                    + "\n3 - Listar situação atual"
                    + "\n4 - Encerrar programa");
            x = 0;
            if (op == null) {
                break;
            } else if (op.equals("1")) {
                while (x == 0) {
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Forneça o número da vaga:"));
                    if (vagasCarros[num - 1].equals("Livre")) {
                        vagasCarros[num - 1] = JOptionPane.showInputDialog("Forneça a placa do veículo:");
                        x = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Vaga ocupada, escolha outra.");
                    }
                }

            } else if (op.equals("2")) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Forneça o numero da vaga a ser liberada:"));
                vagasCarros[num - 1] = "Livre";

            } else if (op.equals("3")) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Vaga " + df.format(i + 1) + ": " + vagasCarros[i]);
                }
            } else if (op.equals("4")) {
                break;
            }

        }
        System.exit(0);
    }
}
