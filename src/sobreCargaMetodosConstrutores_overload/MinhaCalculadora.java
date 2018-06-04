package sobreCargaMetodosConstrutores_overload;

public class MinhaCalculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int soma(int[] vetorInteiros) {
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }

}

class testeCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        calc.soma(1, 2);
        calc.soma(1.0, 2.0);
    }
}
