package ExercJG.Java8_Livro.cap10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class Pag218Exerc03 {

    public static void main(String[] args) {

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dI = JOptionPane.showInputDialog(null, "Digite a data inicial: dia/mes/ano");
            String dF = JOptionPane.showInputDialog(null, "Digite a data final: dia/mes/ano");
            Date dataI = dateFormat.parse(dI);
            Date dataF = dateFormat.parse(dF);

            Instant instantDI = dataI.toInstant();
            ZonedDateTime zdt = instantDI.atZone(ZoneId.systemDefault());
            LocalDate dataInicial = zdt.toLocalDate();

            Instant instantDF = dataF.toInstant();
            ZonedDateTime zde = instantDF.atZone(ZoneId.systemDefault());
            LocalDate dataFinal = zde.toLocalDate();

            Period periodo = Period.between(dataInicial, dataFinal);
            int anos = periodo.getYears();
            int meses = periodo.getMonths();
            int dias = periodo.getDays();
            String s = String.format("Data Incial: " + dateFormat.format(dataI) + "\nData Final: "
                    + "%d mes(es) e %d dia(s)!", anos, meses, dias);
            JOptionPane.showMessageDialog(null, s);
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
    }
}
