package ExercJG.FundamentosProgamacao_Livro.cap2;

import java.util.*;

public class UsoScanner {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int idade;
		float peso;
		
		System.out.println("Digite a sua idade:");
		idade = scan.nextInt();
		System.out.println("Digite o seu peso:");
		peso = scan.nextFloat();
		
		System.out.println("Sua idade �: " + idade);
		System.out.println("Seu peso �: " + peso);
		
		
	}
}
