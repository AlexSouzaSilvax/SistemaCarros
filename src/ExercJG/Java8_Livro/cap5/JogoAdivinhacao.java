package ExercJG.Java8_Livro.cap5;
// peguei no grupo do face ! nao sei nem pq
import java.util.*;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];
        int cont = 10;

        for (int c = 0; c < 10; c++) {

            System.out.println("digite um valor acima de 10 e menor que 20 ");
            vetor[c] = sc.nextInt();

            double ale = Math.random();
            int n1 = (int) (10 + ale * (20 - 10));
            System.out.println(n1);

            if (vetor[c] == n1) {

                System.out.println("voce acertou aaaa mizerave ");
                int cont2 = 0;
                for (int j = 1; j < 2; j++) {
                    System.out.println((cont2 += 1) + "acerto");
                }

            } else if (vetor[c] < n1) {
                System.out.println("voce errou, foi menor do que o numero");
                System.out.println("voce so tem mais" + " " + (cont -= 1) + " " + "chanse");

            } else if (vetor[c] > n1) {

                System.out.println("voce errou, foi maior do que o numero");
                System.out.println("voce so tem mais" + " " + (cont -= 1) + " " + "chanse");

            }

        }
    }

}
