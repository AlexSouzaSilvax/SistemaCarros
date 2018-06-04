package ExercJG.Java8_Livro.cap10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class NovoManipulaData {

    public static void main(String[] args) { // Pág 216
        System.out.println("====  Exemplo 1  ===");
        LocalDate nascimento = LocalDate.of(1960, Month.MARCH, 21);
        LocalDate morte = LocalDate.of(1994, Month.MAY, 1);
        Period periodo = Period.between(nascimento, morte);
        System.out.println("Anos: " + periodo.getYears());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Dias: " + periodo.getDays());
        //
        System.out.println("\n====  Exemplo 2  ===");
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        String dataHora = agora.format(dft);
        System.out.println(dataHora);

        System.out.println("\n====  Exemplo 3  ===");
        LocalDateTime hoje = LocalDateTime.now();
        dft = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).
                withLocale(new Locale("pt", "br"));
        dataHora = hoje.format(dft);
        System.out.println(dataHora);

        System.out.println("\n====  Exemplo 4  ===");
        LocalDate dataAtual = LocalDate.now();
        LocalDate vencimento = dataAtual.plusDays(10);
        dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String novaData = vencimento.format(dft);
        System.out.println(novaData);

        System.out.println("\n====  Exemplo 5  ===");
        Instant inicio = Instant.now();
        for (int a = 0; a < 999999999; a++);
        Instant fim = Instant.now();
        System.out.println(inicio);
        System.out.println(fim);

        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilisegundos = duracao.toMillis();
        System.out.println(duracaoEmMilisegundos);

        System.out.println("\n====  Exemplo 6  ===");
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoNY = ZoneId.of("America/New_York");
        ZonedDateTime agoraSP = ZonedDateTime.now(fusoSP);
        ZonedDateTime agoraNY = ZonedDateTime.now(fusoNY);
        System.out.println(agoraSP);
        System.out.println(agoraNY);
    }
}
