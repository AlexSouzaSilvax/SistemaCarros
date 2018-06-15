package testes;

import java.util.Scanner;

class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um dia da semana: ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Não é um dia válido a semana.");

        }
    }
}

class AjusteSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int salario, novoSalario, tempoCasa;
        String nome;

        System.out.println("Entre com o seu nome: ");
        nome = scan.next();
        System.out.println("Entre com o seu salario: ");
        salario = scan.nextInt();
        System.out.println("Entre com o seu tempo de casa: ");
        tempoCasa = scan.nextInt();

        switch (tempoCasa) {

            case 1:
                System.out.println("Você não tem direito ao aumento!"); break;

            case 2:
                novoSalario = (salario + 100);
                System.out.println("Você tem 2 anos de casa.\n"
                        + "Você terá um aumento de R$ 100 reais.\n"
                        + "Seu novo salario é " + "R$" + novoSalario + " reais."); break;
            case 3:
                novoSalario = (salario + 200);
                System.out.println("Você tem 3 anos de casa.\n"
                        + "Você terá um aumento de R$ 200 reais.\n"
                        + "Seu novo salario é " + "R$" + novoSalario + " reais."); break;

            case 4:
                novoSalario = (salario + 300);
                System.out.println("Você tem 4 ou mais anos de casa.\n"
                        + "Você terá um aumento de R$ 300 reais.\n"
                        + "Seu novo salario é " + "R$" + novoSalario + " reais."); 

        }

    }
}
