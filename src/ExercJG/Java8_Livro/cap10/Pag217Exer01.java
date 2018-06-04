package ExercJG.Java8_Livro.cap10;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class Pag217Exer01 {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        String diasSemana = "";
        switch (diaSemana) {
            case 1:
                diasSemana = "Domingo";
                break;
            case 2:
                diasSemana = "Segunda";
                break;
            case 3:
                diasSemana = "Terça";
                break;
            case 4:
                diasSemana = "Quarta";
                break;
            case 5:
                diasSemana = "Quinta";
                break;
            case 6:
                diasSemana = "Sexta";
                break;
            case 7:
                diasSemana = "Sábado";
                break;
        }
        if (hora >= 8 && hora < 17 && diaSemana > 1 && diaSemana < 7) {
            JOptionPane.showMessageDialog(null, "Estamos atendendo..");
        } else {
            JOptionPane.showMessageDialog(null, "Estamos fechados!");
        }
    }
}
