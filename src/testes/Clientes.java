package testes;

import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clientes {

    String Seq_Cliente;
    String usuario_Cliente;
    String nome_Cliente;
    String email_Cliente;
    String senha_Cliente;
    Calendar c = Calendar.getInstance();
    Date data = c.getTime();

    DateFormat dataCadastro_Cliente = DateFormat.getDateInstance(DateFormat.MEDIUM);

    void verificaUsuario() {
        if ("admin".equals(usuario_Cliente)) {
            if ("alex".equals(nome_Cliente)) {
                if ("alex@cross.com".equals(email_Cliente)) {
                    if ("1234".equals(senha_Cliente)) {
                    }
                }
            }
            System.out.println("Usuário logado com sucesso!");
        } else {
            System.err.println("Informações inválidas!!\nTente novamente...");
        }
    }

    /* void mostrarInfo() {
     System.out.println("\t=== Informações Do Novo Funcionário - Cross System LTDA ===");
     System.out.println("Seq_ :" + Seq_Cliente);
     System.out.println("Usuário: " + usuario_Cliente);
     System.out.println("Nome: " + nome_Cliente);
     System.out.println("Email: " + email_Cliente);
     System.out.println("Senha: " + "******");
     System.out.println("Data do Cadastro: " + dataCadastro_Cliente.format(data));
     }
     */
}

class testeClientes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Clientes cliente1 = new Clientes();

        System.out.println("Entre com o Seq do Cliente:");
        cliente1.Seq_Cliente = scan.next();

        System.out.println("Entre com o usuário:");
        cliente1.usuario_Cliente = scan.next();
        System.out.println("Entre com o seu nome:");
        cliente1.nome_Cliente = scan.next();
        System.out.println("Entre com o seu e-mail:");
        cliente1.email_Cliente = scan.next();
        System.out.println("Entre com a sua senha:");
        cliente1.senha_Cliente = scan.next();

        //cliente1.mostrarInfo();
        
        cliente1.verificaUsuario();

    }
}

/*
 class Formatando_Saida_Datas {

 public static void main(String[] args) {
 Calendar c = Calendar.getInstance();
 Date data = c.getTime();

 DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
 System.out.println("Data brasileira: " + f.format(data));

 f = DateFormat.getDateInstance(DateFormat.LONG);
 System.out.println("Data sem o dia descrito: " + f.format(data));

 f = DateFormat.getDateInstance(DateFormat.MEDIUM);
 System.out.println("Data resumida 1: " + f.format(data));

 f = DateFormat.getDateInstance(DateFormat.SHORT);
 System.out.println("Data resumida 2: " + f.format(data));
 }
 }
 */
