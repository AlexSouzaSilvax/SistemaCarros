package OrientacaoObjetos.OrientacaoObjeto_Exercicios;

public class exerc01 {
}

class Lampada {

    String modelo;
    String tensao;
    int garantiaMeses;
    int potencia;
    String cor;
    String tipoLuz;
    boolean tipoAbajur;
    String[] tipos;

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}

class testesLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
