package ExercJG.Java8_Livro.cap8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame {

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao, miGuiRadio, miGuiLabel, miGuiLista, miGuiListaFotos, miGuiCombo, miGuiAreaTexto, miGuiDialogoMensagem, miGuiDialogoConfirmacao;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic('E');
        miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));
        miSair.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botão");
        miCaixaOpcao = new JMenuItem("Caixa de Opção");
        miGuiRadio = new JMenuItem("Gui Radio");
        miGuiLabel = new JMenuItem("Gui Label");
        miGuiLista = new JMenuItem("Gui Lista");
        miGuiListaFotos = new JMenuItem("Gui Lista Fotos");
        miGuiCombo = new JMenuItem("Gui Combo");
        miGuiAreaTexto = new JMenuItem("Gui Área De Texto");
        miGuiDialogoMensagem = new JMenuItem("Gui Diálogo De Mensagens");
        miGuiDialogoConfirmacao = new JMenuItem("Gui Diálogo De Confirmacao");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        mnExemplos.add(miGuiRadio);
        mnExemplos.add(miGuiLabel);
        mnExemplos.add(miGuiLista);
        mnExemplos.add(miGuiListaFotos);
        mnExemplos.add(miGuiCombo);
        mnExemplos.add(miGuiAreaTexto);
        mnExemplos.add(miGuiDialogoMensagem);
        mnExemplos.add(miGuiDialogoConfirmacao);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {

        miSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        miBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiBotao botao = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(botao);
                contentPane.validate();
            }
        });

        miCaixaOpcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiCaixaOpcao guiCaixaOpcao = new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(guiCaixaOpcao);
                contentPane.validate();
            }
        });

        miGuiRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiRadio guiRadio = new GuiRadio();
                contentPane.removeAll();
                contentPane.add(guiRadio);
                contentPane.validate();
            }
        });

        miGuiLabel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiLabel guiLabel = new GuiLabel();
                contentPane.removeAll();
                contentPane.add(guiLabel);
                contentPane.validate();
            }
        });

        miGuiLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiLista guiLista = new GuiLista();
                contentPane.removeAll();
                contentPane.add(guiLista);
                contentPane.validate();
            }
        });

        miGuiListaFotos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiListaFotos guiListaFotos = new GuiListaFotos();
                contentPane.removeAll();
                contentPane.add(guiListaFotos);
                contentPane.validate();
            }
        });

        miGuiCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiCombo guiCombo = new GuiCombo();
                contentPane.removeAll();
                contentPane.add(guiCombo);
                contentPane.validate();
            }
        });

        miGuiAreaTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiAreaTexto guiAreaTexto = new GuiAreaTexto();
                contentPane.removeAll();
                contentPane.add(guiAreaTexto);
                contentPane.validate();
            }
        });

        miGuiDialogoMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiDialogoMensagem guiDialogoMensagem = new GuiDialogoMensagem();
                contentPane.removeAll();
                contentPane.add(guiDialogoMensagem);
                contentPane.validate();
            }
        });

        miGuiDialogoConfirmacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuiDialogoConfirmacao guiDialogoConfirmacao = new GuiDialogoConfirmacao();
                contentPane.removeAll();
                contentPane.add(guiDialogoConfirmacao);
                contentPane.validate();
            }
        });

    }

    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2,
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
