
package tresenraya;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaForm extends JFrame implements Vista {
    private JButton[][] botones;
    private Presentador presentador;

    public VistaForm(Presentador presentador) {
        super("Tres en Raya");
        this.presentador = presentador;
        inicializarGUI();
    }

    private void inicializarGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        botones = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].setFont(botones[i][j].getFont().deriveFont(24.0f));
                final int fila = i;
                final int columna = j;
                botones[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        presentador.manejarEntrada(fila, columna);
                    }
                });
                panel.add(botones[i][j]);
            }
        }

        add(panel);
    }

    @Override
    public void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText(presentador.obtenerValorCasilla(i, j));
            }
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }


    public String obtenerValorCasilla(int fila, int columna) {
       
        return "";
    }
}
