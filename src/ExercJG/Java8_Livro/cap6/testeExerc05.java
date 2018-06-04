package ExercJG.Java8_Livro.cap6;

public class testeExerc05 {

    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {60, 70, 80, 10, 90};
        System.out.println("Quantidade encontrada: " + Pag106Exerc05.buscarNumero(array1, array2, 10));
        int[] array3 = Pag106Exerc05.gerarArray(12);
        System.out.println("-----------------");
        System.out.println("Valores gerados no Array:");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }

}
