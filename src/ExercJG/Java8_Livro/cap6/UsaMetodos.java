package ExercJG.Java8_Livro.cap6;

public class UsaMetodos {

    public static void main(String[] args) {

        MetodosSemRetorno.imprimirTexto("Usando métodos de outra classe");
        MetodosSemRetorno.somar(20, 30);
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(5));
        System.out.println(MetodosComRetorno.contarLetrasA("Macacada"));
    }
}
