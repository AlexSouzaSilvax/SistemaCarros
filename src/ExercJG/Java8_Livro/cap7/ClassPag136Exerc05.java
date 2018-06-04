package ExercJG.Java8_Livro.cap7;

public class ClassPag136Exerc05 implements Pag136Exerc05 {

     // @Override - Usado somente quando sobreescreve um método.
    public void ligarRobo() {
        System.out.println("Robô Ligado!");
    }
    public void desligarRobo() {
        System.out.println("Robô Desligado!");
    }
    public void andar() {
        System.out.println("Ativado o método Andar.\nAndando...");
    }

    public int virar() {
        System.out.println("Ativado o método Virar.\nVirando...");
        return 0;
    }

    public String falar() {
         System.out.println("Ativado o método Falar.\nFalando...");
        return null;
     }

  
}
