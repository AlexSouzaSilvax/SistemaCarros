package ExercJG.Java8_Livro.cap7;

public class Pag135Exerc01 { // class bombaAgua;

    boolean status;

    @SuppressWarnings("empty-statement")
    public void status(boolean status) {
        System.out.println("Bomba Ligada!");
        status = true;
        System.out.println("Desligando bomba...\nEm 5 segundos.");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        desligar();
        System.out.println("Bomba desligada!");
        // System.out.println("Funcionou pourrraaa");
    }

    public void ligada() {
        status = true;
    }

    public void desligar() {
        status = false;
    }
}
