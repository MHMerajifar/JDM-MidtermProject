import javax.swing.*;
import java.awt.*;

public class StartingFrameLeftPanel extends JPanel {
    private FinishedButton finishedButton;
    private ProcessingButton processingButton;

    public StartingFrameLeftPanel(){
        Dimension dimension = new Dimension(190,700);
        this.setPreferredSize(dimension);

        finishedButton = new FinishedButton();
        processingButton = new ProcessingButton();

        this.add(processingButton);
        this.add(finishedButton);
        for (int i = 0; i < 6; i++){
            this.add(new JPanel());
        }

        this.setLayout(new GridLayout(0,1,20,20));
    }
}
