package ExercJG.Java8_Livro.cap6;

import javax.swing.JOptionPane;


public class testeExerc01 {
    
    public static void main(String[] args) { 
        
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número do mês:"));
        int idioma = Integer.parseInt(JOptionPane.showInputDialog("Entre com o idioma : \n1 - Português \n2 - English"));
        JOptionPane.showMessageDialog(null, Pag102Exerc01.getMesPorExtenso(mes, idioma));
    }
}
