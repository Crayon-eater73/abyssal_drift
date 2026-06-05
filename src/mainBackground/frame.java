package mainBackground;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame extends JFrame {

    public frame() {
        super("Abyssal Drift");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        Panel panel = new Panel(this);
        setContentPane(panel);

        panel.setBounds(0, 0, 800, 600);  // REQUIRED FOR CLICKING

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void changePanel(JPanel newPanel) {
        setContentPane(newPanel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new frame();
    }
}