package Controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import Usuario.Usuario;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroUsuariosController {

    int pTela = 0;

    public void iniciar(int pTela) {

        pTela = 0;

    }

    public String salvar(int pTela) {

        

        FacesContext context = FacesContext.getCurrentInstance();

        Usuario usuario = new Usuario();
//        usuario.getNome();
//        usuario.getLogin();
//        usuario.getSenha();

//        if () {
//            context.addMessage(FacesMessage.FACES_MESSAGES, new FacesMessage("Falha ao Salvar", "Preencha os campos OBRIGATÓRIOS!"));
//            System.err.println("Falha ao salvar, preencha os campos obrigatorios");
//        }
        //context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvo Com Sucesso", ""));
        context.addMessage(FacesMessage.FACES_MESSAGES, new FacesMessage("Salvo Com Sucesso!", "" + usuario.getLogin()));
        System.err.println("Usuário Salvo com Sucesso!");
        return "TelaCadastroUsuarios";
    }

}
