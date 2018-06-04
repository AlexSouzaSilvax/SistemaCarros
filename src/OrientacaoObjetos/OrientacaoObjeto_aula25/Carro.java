package OrientacaoObjetos.OrientacaoObjeto_aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        double autonomia = capCombustivel * consumoCombustivel;
        System.out.println("A autonomia do carro é: " + autonomia + " km");
    }

}
