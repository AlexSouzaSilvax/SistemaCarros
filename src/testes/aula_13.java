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
class aula13 {

    public static void main(String[] args) {


        int n1 = 10;
        int n2 = 20;
        int resultado = (n1 + n2) - 1;
        System.out.println("O resultado é = " + resultado);
    }
}

class aula131 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int resultado = (n1 + n2) * 2;
        System.out.println("O resultado é = " + resultado);
    }
}

class aula1302 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int resultado = (n1 + n2) / 2;
        System.out.println("O resultado é = " + resultado);
    }
}

class aula1303 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int resultado = (n1 + n2) + 8;
        System.out.println("O resultado é = " + resultado);
    }
}

class aula1304 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int resultado = (n1 + n2) % 7;
        System.out.println("O resultado é = " + resultado);
    }
}

class aula1305 {

    public static void main(String[] args) {

        String primeiraString = "Esta é";
        String segundaString = " uma String contatenada.";
        String terceiraString = primeiraString + segundaString;
        System.out.println(terceiraString);
    }
}

class OperadoresAritmeticos1306 {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        //5
        System.out.println(resultado++);
        System.out.println(++resultado);
        //mesma coisa que 
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado += 1;

        System.out.println(++resultado);
        //mesma coisa que
        //resultado += 1;
        //System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);


    }
}

class OperadoresRelacionais1307 {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        System.out.println("valor1 == valor2: " + (valor1 == valor2));
        System.out.println("valor1 != valor2: " + (valor1 != valor2));
        System.out.println("valor1 > valor2: " + (valor1 > valor2));
        System.out.println("valor1 >- valor2: " + (valor1 > -valor2));
        System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
    }
}

class OperadoresLogicos1308 {

    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
    }
}

class CurtoCircuito1309 {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}

class Exer1310 {

    public static void main(String[] args) {

        System.out.println("Olá Mundo");
    }
}

class Exer1311 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
    }
}

class Exer1312 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("A soma dos dois números é: " + resultado);
    }
}

class Exer1313 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Entre com a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Entre com a quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);
    }
}

class Exer1314 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros");
        double metros = scan.nextDouble();

        //1m = 100cm
        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cm");
    }
}

class Exer1315 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do círculo:");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }
}

class Exer1316 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do lado do quadrado");
        double lado = scan.nextDouble();

        //area = lado * lado
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é : " + area);
        System.out.println("O dobro da área do quadrado é : " + (area * 2));
    }
}

class Exer1317 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Ente com a quantidade de horas trabalhadas no mês:");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.println("O salário é de: " + salario);
    }
}

class Exer1318 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Farenheit:");
        double f = scan.nextDouble();

        double c = (5 * (f - 32) / 9);

        System.out.println("A temperatura " + f + " F é igual a " + c + " C");
    }
}

class Exer1319 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f = c * 1.8 + 32;

        System.out.println("A temperatura " + c + " C é igual a " + f + " F");
    }
}

class Exer1320 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        int num1 = scan.nextInt();

        System.out.println("Entre com um outro número inteiro");
        int num2 = scan.nextInt();

        System.out.println("Entre com um número real");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * num2) * (num2 / 2);
        double resultado2 = (num1 * num3) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    }
}

class Exer1321 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}

class Exer1322 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Ente com a quantidade de horas trabalhadas no mês:");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salário bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salários líquido: " + salarioLiquido);
    }
}

class Exer1323 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet:");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}
