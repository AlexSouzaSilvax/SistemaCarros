package ExercJG.Java8_Livro.cap6;

import javax.swing.JOptionPane;

public class ChamaMetodos {

    public static void main(String[] args) {
        String nome = EntradaDeDadosComMetodos.lerString("Forneça seu nome: ");
        int idade = EntradaDeDadosComMetodos.lerNumeroInt(0, 120, "Forneça sua idade: ");
        float altura = EntradaDeDadosComMetodos.lerNumeroFloat(0, 2.5f, "Forneça sua altura: ");
        double peso = EntradaDeDadosComMetodos.lerNumeroDouble(0, 300, "Forneça seu peso: ");
        char op = EntradaDeDadosComMetodos.selecionarOpcao("Você gosta de Java");
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade
                + "\naltura: " + altura + "\nPeso: " + peso + "\nVocê gosta de Java: " + op);
    }
}
