package ExercJG.Java8_Livro.cap2;

import java.util.Scanner;

public class pag40Exerc02 {

    public static void main(String[] args) {

        int PontosLiderCampeonato, PontosTimeLanterna, Vitorias;
        Scanner sc;
        try {
            System.out.println("Quantidade de pontos do líder do campeonato brasileiro de futebol: ");
            sc = new Scanner(System.in);
            PontosLiderCampeonato = sc.nextInt();

            System.out.println("Quantidade de pontos do time lanterna: ");
            sc = new Scanner(System.in);
            PontosTimeLanterna = sc.nextInt();

            Vitorias = (PontosLiderCampeonato - PontosTimeLanterna) / 3;

            System.out.println("Pontos Do Líder Do Campeonato: " + PontosLiderCampeonato);
            System.out.println("Pontos do time lanterna: " + PontosTimeLanterna);
            System.out.println("Quantidade de vitórias para o time lanterna alcançar o Líder: " + Vitorias);

        } catch (NumberFormatException erro) {
            System.err.println("Houve erro na conversão, digite apenas caracteres numéricos " + erro.toString());
        }
    }
}
