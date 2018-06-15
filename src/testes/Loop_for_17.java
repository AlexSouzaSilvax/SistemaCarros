package testes;

/**
 *
 * @author Maquina 01
 */
//Agenda
//Controle while
//Controle do-while
public class Loop_for_17 {

    public static void main(String[] args) {
        //todos os ex tem o mesmo resultado
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("i  tem valor " + i);
        }


        int impar = 1;
        for (; impar < 100;) {
            System.out.println("Números ímpar: " + impar);
            impar += 2;
        }
        int par = 0;
        for (; par < 100;) {
            System.out.println("Números par: " + par);
            par += 2;
        }

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("valor de cont: " + cont);
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("O valor da soma é: " + soma);

        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }
    }
}
