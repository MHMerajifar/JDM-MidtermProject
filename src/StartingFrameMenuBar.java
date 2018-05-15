import javax.swing.*;
import java.awt.*;

public class StartingFrameMenuBar extends JMenuBar {
    public StartingFrameMenuBar(){
        Dimension dimension = new Dimension(50,50);
        this.setPreferredSize(dimension);

        this.setBackground(Color.RED);
        this.setOpaque(true);
    }
}
