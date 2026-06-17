package mainBackground.mainMenu;

import java.awt.*;
import javax.swing.*;
import mainBackground.Panel;
import mainBackground.frame;

public class ContinuePanel extends JPanel {

    private frame window;

    //whoile thing is a new panel and what would happem if you clicked them
    public ContinuePanel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        JLabel label = new JLabel("As I was saying...");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        add(label);

        JButton back = new JButton("Back to Menu");
        back.addActionListener(e -> window.changePanel(new Panel(window)));
        add(back);
    }
}
