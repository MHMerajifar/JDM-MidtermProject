import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartingFrameMenuBar extends JMenuBar {
    private NewDownloadButton newDownloadButton;
    private ResumeButton resumeButton;
    private PauseButton pauseButton;
    private CancelButton cancelButton;
    private RemoveButton removeButton;
    private SettingButton settingButton;
    private ExitButton exitButton;

    public StartingFrameMenuBar(){
        JMenu downloadMenu = new JMenu("Download");
        JMenu helpMenu = new JMenu("Help");

        JButton aboutUsButton = new JButton("Info    About   Us");
        JButton aboutSoftWareButton = new JButton("About Soft ware");
        this.newDownloadButton = new NewDownloadButton();
        this.resumeButton = new ResumeButton();
        this.pauseButton = new PauseButton();
        this.cancelButton = new CancelButton();
        this.removeButton = new RemoveButton();
        this.settingButton = new SettingButton();
        this.exitButton = new ExitButton();

        Dimension dimension2 = new Dimension(aboutSoftWareButton.getWidth(),20);
        aboutUsButton.setPreferredSize(dimension2);

        downloadMenu.add(newDownloadButton);
        downloadMenu.add(resumeButton);
        downloadMenu.add(pauseButton);
        downloadMenu.add(cancelButton);
        downloadMenu.add(removeButton);
        downloadMenu.add(settingButton);
        downloadMenu.add(exitButton);

        aboutUsButton.addActionListener(new AboutUsHandler());
        aboutSoftWareButton.addActionListener(new AboutSoftWareHandler());

        helpMenu.add(aboutSoftWareButton);
        helpMenu.add(aboutUsButton);

        this.add(downloadMenu);
        this.add(helpMenu);

        this.setBorder(BorderFactory.createTitledBorder("Menu"));

        Dimension dimension = new Dimension(50,50);
        this.setPreferredSize(dimension);
    }

    private class AboutUsHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JFrame(), "Author: MHMeraji\nThis is a school project.");
        }
    }

    private class AboutSoftWareHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JFrame(), "This is a download manager" +
                    "written in java.\nTo get started just click new download button:-)");
        }
    }
}
