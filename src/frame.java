import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {

        JFrame window = new JFrame("Abyssal Drift");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);

        panel panel = new panel();
        window.add(panel);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
