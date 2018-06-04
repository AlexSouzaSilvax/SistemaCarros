package ExercJG.Java8_Livro.cap7;

public class TelevisorExem7_7 {

    private int volume;
    private int canal;

    public TelevisorExem7_7() {
    }

    public TelevisorExem7_7(int volume) {
        this.volume = volume;
    }
    public TelevisorExem7_7(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    public void mostrar() {
        System.out.println("Volume: " + volume +  "\nCanal: " + canal);
    }
}
