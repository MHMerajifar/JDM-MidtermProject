import javax.swing.*;

public class CancelButton extends JButton {
    public CancelButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\remove.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Cancel");
    }
}
