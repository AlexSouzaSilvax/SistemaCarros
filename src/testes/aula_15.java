/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author Maquina 01
 */
class SwitchCase_Aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um dia da semana (1-7):");

        int diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia da semana válido");
        }

        switch (diaSemana) {

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
                System.out.println("Dia útil");
                break;

            case 1:

            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        }
    }
}

class Corr_Exer1_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O num1 é maior: " + num1);
        } else {
            System.out.println("O num2 é maior: " + num2);
        }
    }
}

class Corr_Exer2_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int num = scan.nextInt();

        if (num >= 0) {
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é negativo");
        }
    }
}

class Corr_Exer3_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra (F ou M):");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}

class Corr_Exer4_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra:");
        String letra = scan.next();

        /*
         * if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
         * letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
         *
         * letra.equalsIgnoreCase("u")){ System.out.println("vogal"); } else {
         * System.out.println("consoante"); }
         */

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("vogal");
                    break;
                default:
                    System.out.println("consoante");
                    break;
            }
        }
    }
}

class Corr_Exer5_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

class Corr_Exer6_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero:");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro numero:");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 é maior: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 é maior: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("num3 é maior: " + num3);
        }
    }
}

class Corr_Exer7_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero:");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro numero:");
        int num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("num1 é menor: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("num2 é menor: " + num2);
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("num3 é menor: " + num3);
        }
    }
}

class Corr_Exer8_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro preço:");
        double preco1 = scan.nextDouble();

        System.out.println("Entre com o segundo preço:");
        double preco2 = scan.nextDouble();

        System.out.println("Entre com o terceiro preço:");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("Compre o produto 1");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Compre o produto 2");
        } else if (preco3 <= preco1 && preco3 <= preco2) {
            System.out.println("Compre o produto 2");
        }
    }
}

class Corr_Exer9_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número:");
        int num3 = scan.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            //num1 é menor
            //num3 é menor
            //num1 < num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num2) {
            //num1 é menor
            //num3 é maior
            //num2 < num3 < num1
            System.out.println(num3 + " - " + num1 + " - " + num2);
        }
    }
}

class Corr_Exer10_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno dque você estuda:");
        String turno = scan.next();

        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}

class Corr_Exer11_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();

        int percentual = 0;
        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 10;
        } else if (salario >= 1500) {
            percentual = 5;
        }

        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}

class Corr_Exer12_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com as horas trabalhadas no mês:");
        double qtdHoras = scan.nextDouble();

        double salarioBruto = valorHora * qtdHoras;

        int percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHoras + ")");
        System.out.println("(-) IR (" + percentualIR + "%):" + ir);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}

class Corr_Exer13_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um dia da semana (1-7):");

        int diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um dia da semana válido");
        }

        switch (diaSemana) {

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
                System.out.println("Dia útil");
                break;

            case 1:

            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        }
    }
}

class Corr_Exer14_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";
        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        } else if (media >= 0 && media < 4) {
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + aproveitamento);

        switch (aproveitamento) {
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO");
                break;
        }
    }
}

class Corr_Exer15_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o lado 1:");
        int lado1 = scan.nextInt();

        System.out.println("Entre com o lado 2:");
        int lado2 = scan.nextInt();

        System.out.println("Entre com o lado 3:");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3)
                || ((lado1 + lado3) > lado2)
                || ((lado2 + lado3) > lado1)) {

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Triângulo Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóceles");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}

class Corr_Exer16_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor de a:");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é equaçâo de segundo grau");
        } else {

            System.out.println("Entre com o valor de b:");
            int b = scan.nextInt();

            System.out.println("Entre com o valor de c:");
            int c = scan.nextInt();

            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta negativo");
            } else {

                System.out.println("delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}

class Corr_Exer17_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o ano");

        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("é bissexto");
        } else {
            System.out.println("não é bissexto");
        }
    }
}

class Corr_Exer18_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
}

class Corr_Exer19_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número");
        int num2 = scan.nextInt();

        System.out.println("Entre com a operação (+ - / *): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida");
                valida = false;
                break;
        }

        if (valida) {

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("resultado positivo");
            } else {
                System.out.println("resultado negativo");
            }

            if (resultado % 2 == 0) {
                System.out.println("resultado par");
            } else {
                System.out.println("resultado ímpar");
            }
        }
    }
}

class Corr_Exer20_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String resp1 = scan.next();

        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();

        System.out.println("Mora perto da vítima?");
        String resp3 = scan.next();

        System.out.println("Já trabalhou com a vítima?");
        String resp4 = scan.next();

        System.out.println("Devia para a vítima?");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp2.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp3.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp4.equalsIgnoreCase("S")) {
            cont++;
        }

        if (resp5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 0) {
            System.out.println("Inocente");
        }
    }
}

class Corr_Exer21_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a qtd de litros vendidos");
        double litros = scan.nextDouble();

        System.out.println("Entre com o tipo de combustível");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;


        if (tipo.equalsIgnoreCase("a")) {
            if (litros <= 20) {
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }

            total = litros * precoAlc;

        }
        if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }
            total = litros * precoGas;
        }

        totalDesc = (total / 100) * percDesconto;

        double precoAPagar = total - totalDesc;

        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}

class Corr_Exer22_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();

        System.out.println("Entre com a quantidade (kg) de maça:");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;
        if (qtdMorango <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }

        double precoKgMaca = 0;
        if (qtdMaca <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoKgMorango + precoKgMaca;
        double precoTotal = precoParcial;

        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }

        System.out.println("Preço total = " + precoTotal);
    }
}

class Corr_Exer23_aula15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - filé duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade (kg):");
        double qtd = scan.nextDouble();

        double precoKg = 0;

        if (tipo == 1) {

            System.out.println(qtd + "kg - file duplo");

            precoKg = 4.9;
        } else {
            precoKg = 5.8;
        }
        if (tipo == 2) {

            System.out.println(qtd + "kg - alcatra");

            precoKg = 5.9;
        } else {
            precoKg = 6.8;
        }
        if (tipo == 3) {

            System.out.println(qtd + "kg - picanha");

            precoKg = 6.9;
        } else {
            precoKg = 7.8;
        }

        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? Digite 1 para sim:");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}

