package JavaIntermediarioLoaine.Aula85;

public class Aula85Math {

    public static void main(String[] args) {

        System.out.println(Math.pow(2, 3)); // Potência 

        System.out.println(Math.round(4.7)); // Acima de 4.5 arrendonda p/cima.  

        System.out.println(Math.round(4.4)); // Abaixo de 4.5 arrendonda p/baixo.

        System.out.println(Math.ceil(4.4)); // Sempre arredonda p/ cima.

        System.out.println(Math.ceil(4.7)); // Sempre arredonda p/ cima.

        System.out.println(Math.floor(4.4)); // Sempre arredonda p/ baixo.

        System.out.println(Math.floor(4.7)); // Sempre arredonda p/ baixo.

        System.out.println(Math.round(Math.random() * 100)); // Gera um número aleatorio 
        
        System.out.println(Math.sin(Math.toRadians(30)));
    }
}
