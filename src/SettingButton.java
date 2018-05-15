import javax.swing.*;

public class SettingButton extends JButton {
    public SettingButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\settings.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Setting");
    }
}
