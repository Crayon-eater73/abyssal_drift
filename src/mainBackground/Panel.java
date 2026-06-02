package mainBackground;

import java.awt.*;
import java.io.File;
import javax.swing.*;

public class Panel extends JPanel {

    private frame window;

    public JLabel newGame;
    public JLabel cont;
    public JLabel load;
    public JLabel settings;
    public JLabel quit;

    public Panel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        setLayout(null);

        Font glazier48;
        Font glazier32;

        try {
            Font glazier = Font.createFont(
                Font.TRUETYPE_FONT,
                new File("src/mainBackground/fonts/GingkoFraktur.ttf"));
            glazier48 = glazier.deriveFont(Font.BOLD, 48f);
            glazier32 = glazier.deriveFont(Font.PLAIN, 32f);

        } catch (Exception e) {
            glazier48 = new Font("Serif", Font.BOLD, 48);
            glazier32 = new Font("Serif", Font.PLAIN, 32);
        }

        JLabel title = new JLabel("Abyssal Drift");
        title.setFont(glazier48);
        title.setForeground(Color.RED);
        title.setBounds(50, 80, 600, 60);
        add(title);

        // NEW GAME
        newGame = new JLabel("New Game");
        newGame.setFont(glazier32);
        newGame.setForeground(Color.WHITE);
        newGame.setBounds(50, 180, 300, 40);
        add(newGame);

        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                window.changePanel(new gamePanel(window));
            }
        });

        // CONTINUE
        cont = new JLabel("Continue");
        cont.setFont(glazier32);
        cont.setForeground(Color.WHITE);
        cont.setBounds(50, 230, 300, 40);
        add(cont);

        cont.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Continue clicked");
                window.changePanel(new gamePanel(window));
            }
        });

        // LOAD GAME
        load = new JLabel("Load Game");
        load.setFont(glazier32);
        load.setForeground(Color.WHITE);
        load.setBounds(50, 280, 300, 40);
        add(load);

        load.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Load Game clicked");
                window.changePanel(new gamePanel(window));
            }
        });

        // SETTINGS
        settings = new JLabel("Settings");
        settings.setFont(glazier32);
        settings.setForeground(Color.WHITE);
        settings.setBounds(50, 330, 300, 40);
        add(settings);

        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println("Settings clicked");
                window.changePanel(new gamePanel(window));
            }
        });

        // QUIT
        quit = new JLabel("Quit");
        quit.setFont(glazier32);
        quit.setForeground(Color.WHITE);
        quit.setBounds(50, 380, 300, 40);
        add(quit);

        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
