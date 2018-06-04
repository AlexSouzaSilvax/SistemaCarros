package ExercJG.Java8_Livro.cap9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pag202Exerc01 extends JFrame { // classe TamanhoCaixa(); 

    private JTextField tfTexto;
    private JLabel lbTexto;

    public static void main(String[] args) {
        Pag202Exerc01 janela = new Pag202Exerc01();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public Pag202Exerc01() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Evento da caixa de texto");
        setBounds(200, 200, 250, 100);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        lbTexto = new JLabel("Digite algo");
        tfTexto = new JTextField(10);
        add(lbTexto);
        add(tfTexto);
    }

    public void definirEventos() {
        tfTexto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (tfTexto.getText().length() >= 10) {
                    JOptionPane.showMessageDialog(null, "Limite de caracteres esgotada!");
                    JOptionPane.showMessageDialog(null, "Tchau otário");
                    System.exit(0);
                    // arg0.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
