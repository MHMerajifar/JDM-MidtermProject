import javax.swing.*;
import java.awt.*;

public class StartingMainFrame extends JFrame {
    private StartingFrameMenuBar startingFrameMenuBar;
    private StartingFrameToolBar startingFrameToolBar;
    private StartingFrameLeftPanel startingFrameLeftPanel;
    private StartingFrameCenterPanel startingFrameCenterPanel;

    public StartingMainFrame(){
        this.startingFrameMenuBar = new StartingFrameMenuBar(this);
        this.startingFrameToolBar = new StartingFrameToolBar(this);
        this.startingFrameLeftPanel = new StartingFrameLeftPanel();
        this.startingFrameCenterPanel = new StartingFrameCenterPanel();

        JPanel blankTopPanel = new JPanel();
        blankTopPanel.setSize(70,80);
        blankTopPanel.add(this.startingFrameMenuBar);
        blankTopPanel.add(this.startingFrameToolBar);
        blankTopPanel.setLayout(new GridLayout(0,1));

        this.add(startingFrameCenterPanel, BorderLayout.CENTER);
        this.add(startingFrameLeftPanel, BorderLayout.WEST);
        this.add(blankTopPanel, BorderLayout.NORTH);

        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
