package ExercJG.Java8_Livro.cap7;

import javax.swing.JOptionPane;

public class testesPag135Exerc03 { // Class UsaGPS

    public static void main(String[] args) {

        //   JOptionPane.showMessageDialog(null, "::::::::::::   Configure seu GPS   ::::::::::::\n"); 
        Pag135Exerc03 gps1 = new Pag135Exerc03();

        JOptionPane.showMessageDialog(null, "::::::::::::   Configure seu GPS   ::::::::::::\n");

        gps1.ligarGPS();
        /*
         System.out.println("- Insira seu idioma\n");
         gps1.definirIdioma(gps1.getIdioma());
         gps1.definirIdioma("");
         System.out.println("- Defina sua rota\n");
         gps1.definirRota(gps1.getRota());
         gps1.definirRota("");
         System.out.println("- Configurações do GPS\n");
         JOptionPane.showMessageDialog(null, "Suas configurações são:\n" + gps1.mostrar());
         */
        gps1.mostrar();
        gps1.desligarGPS();
    }
}
