package ExercJG.Java8_Livro.cap10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;

public class Pag218Exerc04 {

    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date entrada = df.parse("02/01/2015 08:35:00");
        Date saida = df.parse("02/01/2015 08:55:00");

        Instant instantI = entrada.toInstant();
        Instant instantF = saida.toInstant();
        Duration duracao = Duration.between(instantI, instantF);
        long tempoEspera = duracao.toMinutes();

        JOptionPane.showMessageDialog(null, "Chegada: " + df.format(entrada) + "\nSaida: "
                + df.format(saida) + "\nTempo de espera = " + tempoEspera + " min");
    }
}
