package mainBackground;

import java.awt.*;
import javax.swing.*;

public class ContinuePanel extends JPanel {

    private frame window;

    public ContinuePanel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        JLabel label = new JLabel("Continue Game");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        add(label);

        JButton back = new JButton("Back to Menu");
        back.addActionListener(e -> window.changePanel(new Panel(window)));
        add(back);
    }
}
