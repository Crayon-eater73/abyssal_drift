package mainBackground;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame extends JFrame {

    public frame() {
        super("Abyssal Drift");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        // Load the first panel (main menu)
        Panel panel = new Panel(this);
        setContentPane(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Switch to a different panel
    public void changePanel(JPanel newPanel) {
        setContentPane(newPanel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new frame();
    }
}
