package JavaIntermediarioLoaine.Aula87;

import java.util.Calendar;

public class Aula87Calendar {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance(); // singleton

        // System.out.println(hoje);
        int ano = (hoje.get(Calendar.YEAR));
        System.out.println("Ano: " + ano);

        int mess = (hoje.get(Calendar.MONTH));
        int mes = mess + 1;
        System.out.println("Mês: " + mes);

        int dia = (hoje.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia: " + dia);

        int diaSemana = (hoje.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do Semana: " + diaSemana);

        int hora = (hoje.get(Calendar.HOUR_OF_DAY));
        System.out.println("Hora: " + hora);

        int minutos = (hoje.get(Calendar.MINUTE));
        System.out.println("Minutos: " + minutos);

        int segundos = (hoje.get(Calendar.SECOND));
        System.out.println("Segundos: " + segundos);
        
        System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d",
                dia, mes, ano, hora, minutos, segundos); 
        
    }
}
