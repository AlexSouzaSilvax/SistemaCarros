package OrientacaoObjetos.OrientacaoObjeto_aula26;

public class testes {

}

class testesCarro {

    public static void main(String[] args) {

        Carro polo = new Carro();
        polo.marca = "Volkswagen";
        polo.modelo = "Passeio";
        polo.numPassageiros = 5;
        polo.capCombustivel = 100;
        polo.consumoCombustivel = 0.2;

        System.out.println(polo.marca);
        System.out.println(polo.modelo);

        polo.exibirAutonomia();
        
        double autonomia = polo.obterAutonomia();
        
        System.out.println("A autonomia do carro é: " + autonomia);
    }
}
