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
public class teste1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o seu nome:");

        String alex = scan.next();

        if (alex == alex) {
        System.out.println("Hi Alex, Your name is verry beatiful.");
		} else {
        System.out.println("Desculpe, seu nome não esta na lista./nSorry, Your name is not on the list.");
		}


        System.out.println("Entre com o seu nome:");
        String rafael = scan.next();
        if (rafael == rafael) {
       
        System.out.println("Hi Rafael,Seu nome é bonito.");
        }


        System.out.println("Entre com o seu nome:");
        String allan = scan.next();
        if (allan == allan) {
        }
        System.out.println("Hi Allan,Seu nome é bonito.");


        System.out.println("Entre com o seu nome:");
        String cintia = scan.next();
        if (cintia == cintia) {
        }
        System.out.println("Hi Cíntia,Seu nome é bonito.");
    }
}
