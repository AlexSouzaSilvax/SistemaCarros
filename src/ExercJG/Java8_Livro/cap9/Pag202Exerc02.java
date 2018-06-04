package ExercJG.Java8_Livro.cap9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pag202Exerc02 extends JFrame { // classe MudaCorBotao.java

    private JButton btTrocar;

    public static void main(String[] args) {
        JFrame janela = new Pag202Exerc02();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public Pag202Exerc02() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setTitle("Muda cor do Botão");
        setBounds(200, 200, 250, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        btTrocar = new JButton("Trocar");
        btTrocar.setBackground(Color.BLACK);
        btTrocar.setForeground(Color.WHITE);
        add(btTrocar);
    }

    public void definirEventos() {
        btTrocar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btTrocar.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btTrocar.setBackground(Color.BLACK);
            }
        });
    }
}
