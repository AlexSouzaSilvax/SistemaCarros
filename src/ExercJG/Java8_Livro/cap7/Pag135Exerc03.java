package ExercJG.Java8_Livro.cap7;

import javax.swing.JOptionPane;

public class Pag135Exerc03 { // Classe GPS 

    private String idioma;
    private String rota;
    private boolean gps;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean ligarGPS() {
        gps = true;
        JOptionPane.showMessageDialog(null, "O GPS está ligado!");
        //idioma = "pt-br";
        //rota = "Rota 1";
        return true;
    }

    public boolean desligarGPS() {
        gps = false;
        JOptionPane.showMessageDialog(null, "O GPS está desligado!");
        return false;
    }

    public String definirIdioma(String idiomaa) {

        idiomaa = idioma;
        idiomaa = JOptionPane.showInputDialog(null, "Escolha seu idioma: \nPortuguês = 1\nInglês = 2");

        switch (idiomaa) {
            case "1":
                JOptionPane.showMessageDialog(null, "Você inseriu o idioma: Português - BR.");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Você inseriu o idioma: Inglês - EN/USA.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você inseriu um idioma inválido!");
                break;
        }
        return idiomaa;
    }

    public String definirRota(String rotaa) {

        rotaa = rota;
        rotaa = JOptionPane.showInputDialog(null, "Defina sua rota: \nRota A = 1\nRota B = 2");

        switch (rotaa) {
            case "1":
                //JOptionPane.showMessageDialog(null, "Você inseriu a Rota A.");
                break;

            case "2":
                //JOptionPane.showMessageDialog(null, "Você inseriu a Rota B.");
                break;

            default:
                //JOptionPane.showMessageDialog(null, "Você inseriu uma rota inválida! Your dumb -_-");
                break;
        }

        return rotaa;
    }

    public void mostrar() {

        System.out.println("::::::::::::   Minhas Configurações   ::::::::::::\n\nMeu idioma:");
        System.out.println(definirIdioma(""));
        System.out.println("Minha rota:");
        System.out.println(definirRota(""));
        //JOptionPane.showMessageDialog(null, definirIdioma(""));
        //JOptionPane.showMessageDialog(null, definirRota(""));
    }

}