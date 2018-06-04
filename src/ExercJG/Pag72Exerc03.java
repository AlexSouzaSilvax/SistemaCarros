package ExercJG;

import java.util.Scanner;

public class Pag72Exerc03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double num1, num2;
        
        System.out.println("Entre com o número 1: ");
        num1 = scan.nextDouble();
        System.out.println("Entre com o número 2: ");
        num2 = scan.nextDouble();
        
        if(num1 > num2){
            System.out.println("O número 1 é maior que o 2. " + num1);
        }
        if(num1 < num2){
            System.out.println("O número 2 é maior que o 1. " + num2);
        }
        if(num1 == num2){
            System.out.println("Os numeros são iguais.");
        }
    }
}
