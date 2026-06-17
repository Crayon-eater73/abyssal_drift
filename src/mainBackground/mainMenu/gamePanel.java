package mainBackground.mainMenu;

import gameCore.engine.gameEngine;
import gameCore.story.choice;
import gameCore.story.sceneData;
import java.awt.*;
import java.awt.event.ActionEvent;
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

        // Keyboard Binding for ESC Key
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke("ESCAPE"), "showSettingsPopup");

        this.getActionMap().put("showSettingsPopup", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSettingsPopup();
            }
        });

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

    // Popup Window for ESC key
    private void showSettingsPopup() {
        JDialog settingsDialog = new JDialog(window, "Settings", Dialog.ModalityType.APPLICATION_MODAL);
        settingsDialog.setSize(500, 400);
        settingsDialog.setLocationRelativeTo(window);
        settingsDialog.setLayout(new BorderLayout());

        settingsDialog.add(new settingPanel(window), BorderLayout.CENTER);

        JButton closeButton = new JButton("Resume Game");
        closeButton.addActionListener(event -> settingsDialog.dispose());
        settingsDialog.add(closeButton, BorderLayout.SOUTH);

        settingsDialog.setVisible(true);
    }

    // Start the game and load the first scene
    private void startGame() {
        engine = new gameEngine();
        sceneData firstScene = engine.startGame();
        displayScene(firstScene); 
        // show text and choices
    }

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

    private void loadNextScene(String fileName) {
        sceneData next = engine.loadScene("src/gameCore/resources/" + fileName);
        displayScene(next);
}

}
