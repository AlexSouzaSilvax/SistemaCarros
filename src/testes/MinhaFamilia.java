package testes;

import java.util.Scanner;

public class MinhaFamilia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a idade de Alex?");
        String alex = scan.next();

        System.out.println("Qual a idade de Rafael?");
        String rafael = scan.next();

        System.out.println("Qual a idade de Allan?");
        String allan = scan.next();

        System.out.println("Qual a idade de Cintia?");
        String cintia = scan.next();

        System.out.println("A idade de Alex é: " + alex);
        System.out.println("A idade de Rafael é: " + rafael);
        System.out.println("A idade de Allan é: " + allan);
        System.out.println("A idade de Cíntia é: " + cintia);
    }
}

class familiaA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a idade de Alex: ");
        int aalex = scan.nextInt();

        System.out.println("Qual a idade de Rafael: ");
        int rrafael = scan.nextInt();;

        System.out.println("Qual a idade de Allan: ");
        int aallan = scan.nextInt();;

        System.out.println("Qual a idade de Cíntia: ");
        int ccintia = scan.nextInt();;

        String crianca = "Criança";
        String adolescente = "Adolescente";
        String adulto = "Adulto";

        if (aalex <= 18 && aalex > 14) {
            System.out.println("Alex é: " + adolescente);
        }

        if (rrafael <= 13) {
            System.out.println("Rafael é: " + crianca);
        }

        if (aallan >= 18) {
            System.out.println("Allan é: " + adulto);
        }

        if (ccintia >= 18) {
            System.out.println("Cíntia é: " + adulto);
        }
    }
}
