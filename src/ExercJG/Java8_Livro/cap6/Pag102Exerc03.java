package ExercJG.Java8_Livro.cap6;

public class Pag102Exerc03 {

    public static int getDia(String data) {
        try {
            int r = Integer.parseInt(data.substring(0, 2));
            return r;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getMes(String data) {
        try {
            int r = Integer.parseInt(data.substring(3, 5));
            return r;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int getAno(String data) {
        try {
            int r = Integer.parseInt(data.substring(6, 10));
            return r;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
