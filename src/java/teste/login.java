package teste;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class login {

    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String abrirPagina() {
        FacesContext context = FacesContext.getCurrentInstance();

        // valida o acesso
        if (login.equals("alex") && senha.equals("123") || login.equals("admin") && senha.equals("admin")
                || login.equals("jgcursos") && senha.equals("@jg")) {
            //context.addMessage(FacesMessage.FACES_MESSAGES, new FacesMessage("Usuário Válido!", "Bem - Vindo: " + login));
            System.out.println("Usuário válido!\n" + "Login:  " + login + " | Senha: " + senha + "  Inseridos.");
            return "TelaPrincipal";
        }
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário Inválido", ""));
        System.err.println("Usuário inválido!\n" + "Login:  " + login + " | Senha: " + senha + "  Inseridos.");
        return "index";
    }

    public String sair() {
        System.out.println("Método sair chamado!");
        return "index";
    }
}
