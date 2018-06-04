package JavaIntermediarioLoaine.Aula86;

import java.util.Date;

public class Aula86Date {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milisegundos desde 1 de Jan 1970: " + hoje.getTime());

        System.out.println(hoje.getDate()); // Pega o dia do mês

        System.out.println(hoje.getYear()); //  
    }
}
