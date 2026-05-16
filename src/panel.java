import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class panel extends JPanel {

    final int originalTileSize = 16;
    final int scale = 3;
    
    final int tileSize = originalTileSize * scale;
    final int maxScreenLong = 16;
    final int maxScreenLan = 12;

    final int screenWidth = tileSize * maxScreenLong;
    final int screenHeight = tileSize * maxScreenLan;
    

    public panel() {
        setPreferredSize(new Dimension(screenWidth, screenHeight));
        setBackground(Color.black);
        setDoubleBuffered(true);
    }
}
