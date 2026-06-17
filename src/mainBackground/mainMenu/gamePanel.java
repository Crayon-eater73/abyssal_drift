package mainBackground.mainMenu;

import gameCore.engine.gameEngine;
import gameCore.story.choice;
import gameCore.story.sceneData;
import java.awt.*;
import javax.swing.*;
import mainBackground.Panel;
import mainBackground.frame;

public class gamePanel extends JPanel {

    private frame window;
    private gameEngine engine;

    public gamePanel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        // Title label
        JLabel label = new JLabel("\"Let me start from the beginning...\"");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        add(label);

        // Start Game button
        JButton start = new JButton("Start Game");
        start.addActionListener(e -> startGame());
        add(start);

        // Back to Menu button
        JButton back = new JButton("Back to Menu");
        back.addActionListener(e -> window.changePanel(new Panel(window)));
        add(back);
    }

    // Start the game and load the first scene
    private void startGame() {
        engine = new gameEngine();
        sceneData firstScene = engine.startGame();
        displayScene(firstScene);
    }

    // Display scene text and choices
    private void displayScene(sceneData scene) {
        removeAll();
        setLayout(new BorderLayout());

        JTextArea text = new JTextArea(scene.getText());
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setBackground(Color.BLACK);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Serif", Font.PLAIN, 20));
        add(text, BorderLayout.CENTER);

        JPanel choicesPanel = new JPanel();
        choicesPanel.setLayout(new GridLayout(0, 1));

        for (choice c : scene.getChoices()) {
            JButton btn = new JButton(c.getText());
            btn.addActionListener(e -> loadNextScene(c.getNextScenePath()));
            choicesPanel.add(btn);
        }

        add(choicesPanel, BorderLayout.SOUTH);

        revalidate();
        repaint();
    }

    // Load next scene file
    private void loadNextScene(String fileName) {
        sceneData next = engine.loadScene("src/gameCore/resources/" + fileName);
        displayScene(next);
    }
}
