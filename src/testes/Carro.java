package testes;

public class Carro {

    String nome;
    String marca;
    String modelo;
    String categoria;
    int ano;
    int valor;
    
    void mostrarInfo(){
        System.out.println("Informações do novo carro:");
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Categoria: " + categoria);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Valor: " + valor);
    }
}

class testesCarro {

    public static void main(String[] args) {

        Carro polo = new Carro();

        polo.nome = "Vw Polo 1.6";
        polo.marca = "Volkswagens";
        polo.modelo = "Passeio";
        polo.categoria = "Popular";
        polo.ano = 2018;
        polo.valor = 25000;

        polo.mostrarInfo();
    }
}
