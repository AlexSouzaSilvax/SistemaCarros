package ExercJG.Java8_Livro.cap5;

public class Pag88Exerc04 {

    public static void main(String[] args) {
        int[] impar = new int[10];
        int[] par = new int[10];
        int x = 0, y = 0;

        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 20) + 1;
            if (num % 2 == 0) {
                par[x] = num;
                x++;
            } else {
                impar[y] = num;
                y++;
            }
        }
        System.out.println("Array Par:");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "] = " + par[i]);
        }
        System.out.println("Array Ímpar:");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "] = " + impar[i]);

        }
    }
}
