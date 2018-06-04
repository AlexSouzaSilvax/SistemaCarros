package ExercJG.Java8_Livro.cap6;

public class Pag102Exerc02 {

    public static void contar() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void contar(int fim) {

        for (int i = 1; i <= fim; i++) {
            System.out.println(i);
        }
    }

    public static void contar(int inicio, int fim) {

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }

    public static void contar(int inicio, int fim, int pausa) {

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000 * pausa);
            } catch (InterruptedException erro) {
                erro.toString();
            }
        }
    }

}
