package Usuario;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Usuario {

    private String seqCliente;
    private String nome;
    private Date dataCadastro;
    private String situacao;
    private String telefone;
    private String email;
    private String login;
    private String senha;
    private String seqUsuario;

    public String getSeqCliente() {
        return seqCliente;
    }

    public void setSeqCliente(String seqCliente) {
        this.seqCliente = seqCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSeqUsuario() {
        return seqUsuario;
    }

    public void setSeqUsuario(String seqUsuario) {
        this.seqUsuario = seqUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String relatorio() {
        System.out.println("Tela de Relátorio chamada!");
        return "TelaRelatorios";
    }

    public String principal() {
        System.out.println("Tela Principal chamada!");
        return "TelaPrincipal";
    }
}
