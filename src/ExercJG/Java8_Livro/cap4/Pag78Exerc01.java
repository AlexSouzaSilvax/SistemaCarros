package ExercJG.Java8_Livro.cap4;

import javax.swing.JOptionPane;

/*
 Pág 78 - Livro Java 8 Ensino Didático
 GUANABARA
 08/12/2017
 10h:06m && 12h:37m

 11/12/2017 11:10
 */
public class Pag78Exerc01 {
    
    public static void main(String[] args) {

        /* MEU CÓDIGO  11/12 Pâ^^a^^a^~AÃ~~Ãã^~AÃÃÃÃÃAAAAAÃÃÃaaAÃ~^a^^aâa^^aa^^aâ^^a~~aã
        
         int jogada = 0;
         int total = 0;
         for (int i = 1; i <= 3; i++) {
         int num = (int) (Math.random() * 10);
         jogada += num;
         total = jogada * 2;
            
         }
         JOptionPane.showMessageDialog(null, "Números Sorteados:\n"
         + jogada + "Total: " + total); 
       
         */
        int numero, total = 0;
        String numeros = "Números Sorteados:";
        for (int i = 1; i <= 3; i++) {
            numero = 1 + (int) (Math.random() * 10);
            total += numero;
            numeros += "\n" + numero;
        }
        JOptionPane.showMessageDialog(null, numeros + "\nTotal = " + total);
        System.exit(0);
    }
}
