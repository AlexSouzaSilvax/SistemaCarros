package ExercJG.Java8_Livro.cap6;

public class Pag106Exerc05 {

    public static int buscarNumero(int[] array1, int[] array2, int num) {

        int ret = 0;
        for (int i = 0; i < array1.length; i++) {
            if (num == array1[i]) {
                ret++;
                break;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (num == array2[i]) {
                ret++;
                break;
            }
        }
        return ret;
    }

    public static int[] gerarArray(int numero) {
        int[] inteiro = new int[numero];
        for (int i = 0; i < inteiro.length; i++) {
            inteiro[i] = (int) (Math.random() * 1000);

        }
        return inteiro;
    }
}
