import javax.swing.*;
import java.awt.*;

public class NewDownloadButton extends JButton {
    public NewDownloadButton(){
        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\add.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("New Download");
    }
}
