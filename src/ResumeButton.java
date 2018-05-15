import javax.swing.*;

public class ResumeButton extends JButton {
    public ResumeButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\play.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Resume");
    }
}
