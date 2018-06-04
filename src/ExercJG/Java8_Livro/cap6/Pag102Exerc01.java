package ExercJG.Java8_Livro.cap6;

import javax.swing.JOptionPane;

public class Pag102Exerc01 {

    public static String getMesPorExtenso(int mes, int idioma) {
        String mesPorExtenso = "";

        if (idioma == 1) {
            switch (mes) {
                case 1:
                    mesPorExtenso = "Janeiro";
                    break;
                case 2:
                    mesPorExtenso = "Fevereiro";
                    break;
                case 3:
                    mesPorExtenso = "Março";
                    break;
                case 4:
                    mesPorExtenso = "Abril";
                    break;
                case 5:
                    mesPorExtenso = "Maio";
                    break;
                case 6:
                    mesPorExtenso = "Junho";
                    break;
                case 7:
                    mesPorExtenso = "Julho";
                    break;
                case 8:
                    mesPorExtenso = "Agosto";
                    break;
                case 9:
                    mesPorExtenso = "Setembro";
                    break;
                case 10:
                    mesPorExtenso = "Outubro";
                    break;
                case 11:
                    mesPorExtenso = "Novembro";
                    break;
                case 12:
                    mesPorExtenso = "Dezembro";
                    break;
            }
        } else if (idioma == 2) {
            switch (mes) {
                case 1:
                    mesPorExtenso = "January";
                    break;
                case 2:
                    mesPorExtenso = "February";
                    break;
                case 3:
                    mesPorExtenso = "March";
                    break;
                case 4:
                    mesPorExtenso = "April";
                    break;
                case 5:
                    mesPorExtenso = "May";
                    break;
                case 6:
                    mesPorExtenso = "June";
                    break;
                case 7:
                    mesPorExtenso = "July";
                    break;
                case 8:
                    mesPorExtenso = "August";
                    break;
                case 9:
                    mesPorExtenso = "September";
                    break;
                case 10:
                    mesPorExtenso = "October";
                    break;
                case 11:
                    mesPorExtenso = "November";
                    break;
                case 12:
                    mesPorExtenso = "December";
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Idioma iválido!");
        }
        return mesPorExtenso;
    }

}
