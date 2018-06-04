package ExercJG.Java8_Livro.cap8;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiListaFotos extends JPanel {

    private JList lsFotos;
    private DefaultListModel d1m;
    private ImageIcon imagem1;
    private JScrollPane sp;
    private JLabel lbImagem;
    //private JButton lbImagem;

    public GuiListaFotos() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        d1m = new DefaultListModel();
        for (int i = 1; i <= 10; i++) {
            d1m.addElement("Foto" + i);
        }
        lsFotos = new JList(d1m);
        sp = new JScrollPane(lsFotos);
        sp.setBounds(50, 40, 70, 150);
        imagem1 = new ImageIcon("C:\\\\Users\\\\Alex\\\\Google Drive\\\\cursoJava\\\\src\\\\ExercJG\\\\Java8_Livro\\\\cap8\\\\Imagens");
        //imagem1 = new ImageIcon("C:\\\\Users\\\\Alex\\\\Google Drive\\\\cursoJava\\\\src\\\\ExercJG\\\\Java8_Livro\\\\cap8\\\\Imagens\\");
        lbImagem = new JLabel(imagem1);
        //lbImagem = new JButton(imagem1);
        lbImagem.setBounds(150, 30, 500, 500);
        add(sp);
        add(lbImagem);
    }

    private void definirEventos() {
        lsFotos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                imagem1 = new ImageIcon("Fotos: " + lsFotos.getSelectedValue() + ".jpg");
                lbImagem.setIcon(imagem1);
                add(lbImagem);
            }
        });
    }
}