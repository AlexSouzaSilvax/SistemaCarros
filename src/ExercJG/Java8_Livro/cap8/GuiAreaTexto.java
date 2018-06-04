package ExercJG.Java8_Livro.cap8;

import java.awt.event.*;
import javax.swing.*;

public class GuiAreaTexto extends JPanel {

    private JTextField tfCampo;
    private JTextArea taTexto;
    private JScrollPane scrollPane;
    private JButton btLimpar;
    private final static String novaLinha = "\n";

    public GuiAreaTexto() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        tfCampo = new JTextField();
        taTexto = new JTextArea(5, 20); // Desnecessário por causa de setBounds
        taTexto.setEditable(false);
        //btLimpar = new JButton(new ImageIcon("C:\\Users\\Alex\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\borracha.jpg"));
        //btLimpar = new JButton(new ImageIcon("C:\\\\Users\\\\Alex\\\\Google Drive\\\\cursoJava\\\\src\\\\ExercJG\\\\Java8_Livro\\\\cap8\\\\Imagens\\Foto1.jpg"));
        //btLimpar = new JButton(new ImageIcon("C:\\Users\\Alex\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\\\Imagens\\Foto1.gif"));
        //btLimpar = new JButton(new ImageIcon("C:\\Users\\Local de Estudo\\Google Drive\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Foto1.gif"));
        btLimpar = new JButton(new ImageIcon("\\\\Jgserver\\jgserver\\Alunos\\Turmas\\Turma 1 - Programação\\Alex GUANABARA\\cursoJava\\cursoJava\\src\\ExercJG\\Java8_Livro\\cap8\\Foto1.gif"));
        scrollPane = new JScrollPane(taTexto);
        tfCampo.setBounds(25, 15, 150, 25);
        scrollPane.setBounds(25, 45, 300, 120);
        //btLimpar.setBounds(25, 170, 395, 283);
        btLimpar.setBounds(25, 170, 300, 300);
        add(tfCampo);
        add(scrollPane);
        add(btLimpar);
    }

    private void definirEventos() {
        tfCampo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfCampo.selectAll();
                taTexto.append(tfCampo.getText() + novaLinha);
                taTexto.setCaretPosition(taTexto.getDocument().getLength());
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfCampo.setText("");
                taTexto.setText("");
            }
        });
    }
}
