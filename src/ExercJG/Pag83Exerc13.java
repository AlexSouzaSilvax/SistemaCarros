package ExercJG;

import java.util.Scanner;

public class Pag83Exerc13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int opcao;
        double salario;
        double novoSalario = 0;
        double imposto;

        System.out.println("Entre com o seu nome:");
        nome = scan.next();
        System.out.println("Entre com o seu salário: ");
        salario = scan.nextDouble();

        System.out.println("Menu de opções:");
        System.out.println("1. Imposto.");
        System.out.println("2. Novo Salário.");
        System.out.println("3. Classificação.");
        System.out.println("Digite a opção desejada:");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                if (salario < 500) {
                    imposto = (salario * 5 / 100);
                    System.out.println("Imposto de : " + imposto);
                } else if (salario > 500 && salario < 850) {
                    imposto = (salario * 10 / 100);
                    System.out.println("Imposto de : " + imposto);
                } else if (salario > 850) {
                    imposto = (salario * 15 / 100);
                    System.out.println("Imposto de : " + imposto);
                }
                break;

            case 2:
                if (salario > 1.500) {
                    novoSalario = (salario + 25);
                    System.out.println("Você terá um aumento de: R$ 25,00");
                    System.out.println("Seu antigo salário: " + salario);
                    System.out.println("Seu novo salário é: " + novoSalario);
                } else if (salario > 750 && salario < 1500) {
                    novoSalario = (salario + 50);
                    System.out.println("Você terá um aumento de: R$ 50,00");
                    System.out.println("Seu antigo salário: " + salario);
                    System.out.println("Seu novo salário é: " + novoSalario);
                } else if (salario > 450 && salario < 750) {
                    novoSalario = (salario + 75);
                    System.out.println("Você terá um aumento de: R$ 75,00");
                    System.out.println("Seu antigo salário: " + salario);
                    System.out.println("Seu novo salário é: " + novoSalario);
                } else if (salario < 450) {
                    novoSalario = (salario + 100);
                    System.out.println("Você terá um aumento de: R$ 100,00");
                    System.out.println("Seu antigo salário: " + salario);
                    System.out.println("Seu novo salário é: " + novoSalario);
                }
                break;

            case 3:
                if (salario < 700) {
                    System.err.println("Mal remunerado!");
                } else {
                    System.out.println("Bem remunerado!");
                }

        }

        System.out.println("Obrigado por consultar: " + nome);
    }
}
