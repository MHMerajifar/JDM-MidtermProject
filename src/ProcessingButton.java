import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcessingButton extends JButton {
    public ProcessingButton(){
        this.setText("Processing Downloads");

        this.addActionListener(new ProcessingButtonHandler());
    }

    private class ProcessingButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Manager.printProcessingDownloads();
        }
    }
}


