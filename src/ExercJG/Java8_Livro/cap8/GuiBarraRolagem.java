package ExercJG.Java8_Livro.cap8;

import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;

public class GuiBarraRolagem extends JPanel {

    private JScrollBar scrollBar1;
    private JLabel lbCentimetros, lbPolegadas;

    public GuiBarraRolagem() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        scrollBar1 = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 105);
        lbPolegadas = new JLabel("O Polegadas", JLabel.CENTER);
        lbCentimetros = new JLabel("0.00 Centímetros", JLabel.CENTER);
        scrollBar1.setBounds(25, 20, 180, 25);
        lbPolegadas.setBounds(35, 50, 150, 25);
        lbCentimetros.setBounds(35, 80, 150, 25);
        add(scrollBar1);
        add(lbCentimetros);
        add(lbPolegadas);
    }

    private void definirEventos() {
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                lbPolegadas.setText(scrollBar1.getValue() + " Polegadas");
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(2);
                nf.setMaximumFractionDigits(2);
                double cm = scrollBar1.getValue() * 2.54;
                lbCentimetros.setText(nf.format(cm) + " Centímetros");
            }
        });
    }
}
