package ExercJG.Java8_Livro.cap6;

import javax.swing.JOptionPane;

public class testeExerc03 {

    public static void main(String[] args) {
        
        String aux = JOptionPane.showInputDialog("Entre com uma data:");
        int dia = Pag102Exerc03.getDia(aux);
        int mes = Pag102Exerc03.getMes(aux);
        int ano = Pag102Exerc03.getAno(aux);
        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
    }
}
