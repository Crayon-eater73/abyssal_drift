package mainBackground.mainMenu;


import java.awt.*;
import javax.swing.*;

import mainBackground.Panel;
import mainBackground.frame;

public class loadPanel extends JPanel {

    private frame window;

    public loadPanel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        JLabel label = new JLabel("Where do I need to strt from?");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        add(label);

        JButton back = new JButton("Back to Menu");
        back.addActionListener(e -> window.changePanel(new Panel(window)));
        add(back);
    }
}
