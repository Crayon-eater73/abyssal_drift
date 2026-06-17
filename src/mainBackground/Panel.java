package mainBackground;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import mainBackground.mainMenu.ContinuePanel;
import mainBackground.mainMenu.gamePanel;
import mainBackground.mainMenu.loadPanel;
import mainBackground.mainMenu.settingPanel;

public class Panel extends JPanel {

    private frame window;

    public Panel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        setLayout(null);

        // Load custom fonts (fallback to Serif if missing)
        Font titleFont;
        Font menuFont;

        try {
            Font glazier = Font.createFont(
                Font.TRUETYPE_FONT,
                new File("src/mainBackground/fonts/GingkoFraktur.ttf")
            );
            titleFont = glazier.deriveFont(Font.BOLD, 48f);
            menuFont = glazier.deriveFont(Font.PLAIN, 32f);
        } catch (Exception e) {
            titleFont = new Font("Serif", Font.BOLD, 48);
            menuFont = new Font("Serif", Font.PLAIN, 32);
        }

        // Title
        JLabel title = new JLabel("Abyssal Drift");
        title.setFont(titleFont);
        title.setForeground(Color.RED);
        title.setBounds(50, 80, 600, 60);
        add(title);

        // New Game
        JLabel newGame = createMenuLabel("New Game", menuFont, 180);
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                window.changePanel(new gamePanel(window));
            }
        });

        // Continue
        JLabel cont = createMenuLabel("Continue", menuFont, 230);
        cont.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                window.changePanel(new ContinuePanel(window));
            }
        });

        // Load Game
        JLabel load = createMenuLabel("Load Game", menuFont, 280);
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                window.changePanel(new loadPanel(window));
            }
        });

        // Settings
        JLabel settings = createMenuLabel("Settings", menuFont, 330);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                window.changePanel(new settingPanel(window));
            }
        });

        // Quit
        JLabel quit = createMenuLabel("Quit", menuFont, 380);
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.exit(0);
            }
        });
    }

    // Helper method to reduce repeated code
    private JLabel createMenuLabel(String text, Font font, int y) {
        JLabel label = new JLabel(text);
        label.setFont(font);
        label.setForeground(Color.WHITE);
        label.setBounds(50, y, 300, 40);
        add(label);
        return label;
    }
}
