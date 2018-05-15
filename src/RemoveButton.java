import javax.swing.*;

public class RemoveButton extends JButton {
    public RemoveButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\taskcleaner.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Remove");
    }
}
