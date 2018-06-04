package OrientacaoObjetos.OrientacaoObjeto_aula24;

import java.util.Date;

public class Testes {

    /*
     NADANADNADNADNADNADNADNANDANDANDNADNANDANDNADNADNANNDANDNAND
     */
}

class testesCarro {

    public static void main(String[] args) {

        carro polo = new carro();
        polo.marca = "Volkswagen";
        polo.modelo = "Passeio";
        polo.numPassageiros = 5;
        polo.capCombustivel = 100;
        polo.consumoCombustivel = 0.2;

        System.out.println(polo.marca);
        System.out.println(polo.modelo);
    }
}

class testesLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Vermelho";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Refletores";

        System.out.println(lampada.modelo);        
    }
}

class testesLivro {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Guanabara em ...";
        livro.autor = "Guanara";
        livro.qtdPaginas = 10250;
        livro.anoLancamento = 2017;
        livro.isbn = "naosei";

        System.out.println("Nome do livro = " + livro.nome);
    }
}

class testesfilmeLocadora {

    public static void main(String[] args) {

        filmeLocadora filme1 = new filmeLocadora();
        filme1.nome = "Procurando Nemo";
        filme1.nomeAlugador = "Alex ";
        filme1.preco = 25.00;
        filme1.dataRetirada = new Date();
        filme1.dataEntrega = new Date();
        filme1.alugado = true;
    }
}

class testesContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "16842001";
        conta.agencia = "Pega aqui e me chupa";
        conta.especial = true;
        conta.limiteEspecial = 50500;
        conta.saldo = 10500;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}

class testesContato {

    public static void main(String[] args) {
    
        Contato contato1 = new Contato();
        contato1.nome = "Guanaa";
        contato1.endereco = "Jardim Iguaçu - Nova Iguaçu - RJ";
        contato1.email = "guanabara@gmail.com";
    
        contato1.telefones = new String[4];
        contato1.telefones[0] = "(21) 97944-1684";
        contato1.telefones[1] = "(21) 97944-1684";
        contato1.telefones[2] = "(21) 97944-1684";
        contato1.telefones[3] = "(21) 97944-1684";
        
        System.out.println(contato1.nome);
        System.out.println(contato1.endereco);
        System.out.println(contato1.email);
        System.out.println(contato1.telefones[0]);
        System.out.println(contato1.telefones[1]);
        System.out.println(contato1.telefones[2]);
        System.out.println(contato1.telefones[3]);
                
    }
}
