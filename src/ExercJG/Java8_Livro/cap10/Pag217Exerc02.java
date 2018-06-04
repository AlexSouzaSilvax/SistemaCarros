package ExercJG.Java8_Livro.cap10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class Pag217Exerc02 {

    public static void main(String[] args) {
        Calendar calendario = new GregorianCalendar();
        // Hora do Japão
        calendario.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        int horaTokyo = calendario.get(Calendar.HOUR_OF_DAY);
        // Hora em São Paulo
        calendario.setTimeZone(TimeZone.getTimeZone("America/Sao Paulo"));
        int horaSaoPaulo = calendario.get(Calendar.HOUR_OF_DAY);

        int dif = Math.abs(horaSaoPaulo - horaTokyo);
        JOptionPane.showMessageDialog(null, "Tóquio: " + horaTokyo + "h\n"
                + "São Paulo: " + horaSaoPaulo + "h\n"
                + "Diferença: " + dif + "h");
    }
}
