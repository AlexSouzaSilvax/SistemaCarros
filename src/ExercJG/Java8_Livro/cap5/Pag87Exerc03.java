package ExercJG.Java8_Livro.cap5;

public class Pag87Exerc03 {

    public static void main(String[] args) {

        int n = 1;
        int[][] matrizImagem = new int[40][40];
        for (int linha = 0; linha < matrizImagem.length; linha++) {
            for (int coluna = 0; coluna < matrizImagem[linha].length; coluna++) {
                matrizImagem[linha][coluna] = (int) (Math.random() * 255);
                System.out.println(n + "- [" + linha + "," + coluna + "] = " + matrizImagem[linha][coluna]);
                n++;
            }
        }
    }
}
