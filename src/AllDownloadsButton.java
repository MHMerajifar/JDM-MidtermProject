import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllDownloadsButton extends JButton {
    public AllDownloadsButton(){
        this.setText("All Downloads");

        this.addActionListener(new AllDownloadsButtonHandler());
    }

    private class AllDownloadsButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Manager.printDownloadPanels();
        }
    }
}
