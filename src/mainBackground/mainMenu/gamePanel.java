package mainBackground.mainMenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import mainBackground.Panel;
import mainBackground.frame;

public class gamePanel extends JPanel {

    private frame window;

    public gamePanel(frame window) {
        this.window = window;

        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        //Keyboard Binding for Esc  Key
        this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke("ESCAPE"), "showSettingsPopup");

        this.getActionMap().put("showSettingsPopup", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Instead of switching panels, we trigger a popup dialog
                showSettingsPopup();
            }
        });

        JLabel label = new JLabel("\"Let me start from the beginning...\"");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        add(label);

        JButton back = new JButton("Back to Menu");
        back.addActionListener(e -> window.changePanel(new Panel(window)));
        add(back);
    }

    //The Popup Window
    private void showSettingsPopup() {
        // Create a modal dialog attached to the main window frame
        JDialog settingsDialog = new JDialog(window, "Settings", Dialog.ModalityType.APPLICATION_MODAL);
        settingsDialog.setSize(500, 400);
        settingsDialog.setLocationRelativeTo(window); // Centers it perfectly over your game
        settingsDialog.setLayout(new BorderLayout());

        // Added existing settingPanel inside this popup
        settingsDialog.add(new settingPanel(window), BorderLayout.CENTER);

        //Added a quick button to close the popup and return to the game
        JButton closeButton = new JButton("Resume Game");
        closeButton.addActionListener(event -> settingsDialog.dispose()); // Closes the popup
        settingsDialog.add(closeButton, BorderLayout.SOUTH);

        //Made it visible
        settingsDialog.setVisible(true);
    }
}