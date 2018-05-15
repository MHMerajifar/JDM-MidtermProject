import javax.swing.*;
import java.awt.*;

public class StartingFrameToolBar extends JToolBar {
    private NewDownloadButton newDownloadButton;
    private ResumeButton resumeButton;
    private PauseButton pauseButton;
    private CancelButton cancelButton;
    private RemoveButton removeButton;
    private SettingButton settingButton;

    public StartingFrameToolBar(){
        this.newDownloadButton = new NewDownloadButton();
        this.resumeButton = new ResumeButton();
        this.pauseButton = new PauseButton();
        this.cancelButton = new CancelButton();
        this.removeButton = new RemoveButton();
        this.settingButton = new SettingButton();

        Dimension dimension = new Dimension(60,50);
        this.setPreferredSize(dimension);

        JPanel blankPanel1 = new JPanel();
        JPanel blankPanel2 = new JPanel();
        blankPanel1.setBackground(Color.pink);
        blankPanel2.setBackground(Color.pink);

        this.add(blankPanel1);
        this.add(blankPanel2);
        this.add(newDownloadButton);
        this.add(resumeButton);
        this.add(pauseButton);
        this.add(cancelButton);
        this.add(removeButton);
        this.add(settingButton);

        this.setLayout(new GridLayout(1,0,10,10));

        this.setBackground(Color.pink);
        this.setOpaque(true);
    }
}
