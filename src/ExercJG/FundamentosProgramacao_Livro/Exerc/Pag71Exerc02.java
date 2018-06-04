package ExercJG.FundamentosProgramacao_Livro.Exerc;

import java.util.Scanner;

public class Pag71Exerc02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
    double nota1, nota2, nota3, media, notaExame;
    
        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
    
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Média Aritmética: " + media);
        
        if(media >= 0 && media < 3 ){
            System.err.println("Reprovado!!!");
        }
        if(media >= 3 && media < 7 ){
            System.err.println("Exame!! (Recuperação)");
            notaExame = (12 - media);
            System.out.println("Deve tirar nota " + notaExame + " para ser aprovado.");
        }
        if (media >=7 && media <= 10){
            System.out.println("Aprovado!");
        }
    
    
    }
}
