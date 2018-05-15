import javax.swing.*;
import java.awt.*;

public class StartingFrameToolBar extends JToolBar {
    public StartingFrameToolBar(){
        Dimension dimension = new Dimension(50,50);
        this.setPreferredSize(dimension);

        this.setBackground(Color.pink);
        this.setOpaque(true);
    }
}
