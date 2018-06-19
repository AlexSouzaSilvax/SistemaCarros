package calculandopa;

import javax.swing.JOptionPane;

/**
 *
 * @author alex Terça-Feira, 19 de Junho de 2018, 00:22
 */
public class formulaTermoPA {

    public static void main(String[] args) {
        
        /* Progama para fazer o caculo do valor de uma PA - Progressao Aritmetica, Matematica 2º Ensino Medio. 
        
         Questao: 
        
         ENCONTRE O CENTESIMO TERMO DA P.A (3,7,11): 
        
         r = Razao -- Primeiro Termo da P.A
         a1 = Primeiro termo
         N = valor do centesimo termo
         aN = a1 + (n -1).r  -- Formula do termo geral de uma PA 
        
         */
        int r = 4; // 7 - 3 = 4

        int a1 = 3;

        int n = 100;

        int aN = a1 + (n - 1) * r;
//
//        aN = a1 + aN * r;
//
//        aN = r + aN;

        JOptionPane.showMessageDialog(
                null, "Encontre o Centesimo Termo da P.A (3, 7, 11)\n"
                + "O valor do centesimo termo e:  " + aN);

    }
}
