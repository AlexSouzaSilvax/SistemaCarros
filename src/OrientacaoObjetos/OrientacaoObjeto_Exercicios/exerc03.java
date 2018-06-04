package OrientacaoObjeto_Exercicios;
//eu que fiz sozinho prr


public class exerc03 {

}

class aluno {

    String nome;
    float matricula;
    String cursoMatriculado;
    String[] disciplinas;
    double[] notas;
    double resultado;
}

class testesAluno {

    public static void main(String[] args) {

        aluno aluno1 = new aluno();
        aluno1.nome = "Alex";
        aluno1.matricula = 201706253;
        aluno1.cursoMatriculado = "Técnico Informática";

        aluno1.disciplinas = new String[3];
        aluno1.disciplinas[0] = "Hardware";
        aluno1.disciplinas[1] = "Arduino";
        aluno1.disciplinas[2] = "Software";

        aluno1.notas = new double[3];
        aluno1.notas[0] = 7;
        aluno1.notas[1] = 7;
        aluno1.notas[2] = 7;

        aluno1.resultado = (aluno1.notas[0] + aluno1.notas[1] + aluno1.notas[2]) / 3;

        System.out.println("Nome do Aluno: " + aluno1.nome);
        System.out.println("Matricula do Aluno: " + aluno1.matricula);
        System.out.println("Curso Matriculado: " + aluno1.cursoMatriculado);
        System.out.println("Disciplinas do Aluno: "
                + " Disciplina 1: " + aluno1.disciplinas[0]
                + " Disciplina 2: " + aluno1.disciplinas[1]
                + " Disciplina 3: " + aluno1.disciplinas[2]);
        System.out.println("Notas do Aluno: "
                + " Hardware: " + aluno1.notas[0]
                + " Arduino: " + aluno1.notas[1]
                + " Software: " + aluno1.notas[2]);

        if (aluno1.resultado >= 7) {
            System.out.println("Parabéns você foi aprovado.");
            System.out.println("Sua nota foi : " + aluno1.resultado);
        }
        if (aluno1.resultado <= 6.9) {
            System.err.println("Você foi reprovado!! Estude mais!");
            System.out.println("Sua nota foi : " + aluno1.resultado);

        }

    }

}

/* Código da Loiane Gronner
 * 
 * package OrientacaoObjeto_Exercicios;

import java.util.Scanner;

public class exerc03Loiane {

}

class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        }

        return false;
    }

    double obterMedia(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }
}

class testeAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = scan.next();

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
            }
        }
    }
}
 */
