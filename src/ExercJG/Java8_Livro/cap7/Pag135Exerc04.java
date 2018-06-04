package ExercJG.Java8_Livro.cap7;

public class Pag135Exerc04 { // Class Brinquedo

    private String nome;
    private String faixaEtaria;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {

        int faixaEtariaa = Integer.parseInt(faixaEtaria);

        /*if (faixaEtariaa >= 0 && faixaEtariaa <= 2) {
            // System.out.println("Permitido somente a entrada de crianças de:\n 0 à 2 anos de idade!");
            System.out.println("Entrada permitida, SOMENTE acompanhado(a) por um adulto!\nDivirta-se!");
        } else if (faixaEtariaa == 3 && faixaEtariaa <= 5) {
            //System.out.println("Permitido somente a entrada de crianças de:\n 3 à 5 anos de idade!");
            System.out.println("Entrada permitida, SOMENTE acompanhado(a) por um adulto!\nDivirta-se!");
        } else if (faixaEtariaa == 6 && faixaEtariaa <= 10) {
            //System.out.println("Permitido somente a entrada de crianças de:\n 6 à 10 anos de idade!");
            System.out.println("Entrada permitida!\nDivirta-se!");
        } else if (faixaEtariaa > 10) {
            //System.out.println("Permitido somente a entrada de crianças acima de:\n 10 anos de idade!");
            System.out.println("Entrada permitida!\nDivirta-se!");
        } else if (faixaEtariaa < 0) {
            System.err.println("Idade informada inválida!");
        }*/
        if (faixaEtariaa >= 0) {
            System.out.println("Entrada permitida!");
            this.faixaEtaria = faixaEtaria;
        } else {
            System.out.println("Entrada não permitida!");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void brinquedo() {

    }

    public void brinquedo(String nome) {
        System.out.println("Nome do brinquedo: " + nome);
        this.nome = nome;
    }

    public void brinquedo(String nome, float preco) {
        System.out.println(nome);
        System.out.println(preco + "\n");
        this.nome = nome;
        this.preco = preco;
    }

    //public void mostrar() {
     public void mostrar(String FaixaEtariaa, String nomeBrinquedo, float precoBrinquedo) {
        
        System.out.println("\nIdade informada, " + FaixaEtariaa + " anos.");
         setFaixaEtaria(FaixaEtariaa);
        //brinquedo(nomeBrinquedo);
        System.out.println("\nNome e preço do brinquedo informado: ");
        brinquedo(nomeBrinquedo, precoBrinquedo);
    }
}
