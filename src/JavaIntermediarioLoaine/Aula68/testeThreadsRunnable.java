package JavaIntermediarioLoaine.Aula68;

public class testeThreadsRunnable {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
    }

}
