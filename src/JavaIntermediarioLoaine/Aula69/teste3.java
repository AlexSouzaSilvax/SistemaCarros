package JavaIntermediarioLoaine.Aula69;

import JavaIntermediarioLoaine.Aula68.MinhaThreadRunnable;

public class teste3 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        try {
            t1.join(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();

        System.out.println("Programa finalizado");

    }

}
