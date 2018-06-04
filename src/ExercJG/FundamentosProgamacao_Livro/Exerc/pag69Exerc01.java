package ExercJG;

import java.util.Scanner;

public class pag69Exerc01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double notaTrab, avalSem, exame, media;

        System.out.println("Digite a nota do trabalho de laboratórios: ");
        notaTrab = scan.nextDouble();

        System.out.println("Digite a nota da avaliação semestral: ");
        avalSem = scan.nextDouble();

        System.out.println("Digite a nota do exame final: ");
        exame = scan.nextDouble();

        media = (notaTrab * 2 + avalSem * 3 + exame * 5) / 10;

        System.out.println("Média ponderada: " + media);

        if (media >= 8 && media <= 10) {
            System.out.println("Obteve conceito A.");
        }
        if (media >= 7 && media <= 8) {
            System.out.println("Obteve conceito B.");
        }
        if (media >= 6 && media <= 7) {
            System.out.println("Obteve conceito C.");
        }
        if (media >= 5 && media <= 6) {
            System.out.println("Obteve conceito D.");
        }
        if (media >= 0 && media <= 5) {
            System.out.println("Obteve conceito E.");
        }
    }
}
