import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButton extends JButton {
    public SaveButton(){
        this.setText("Save");

        this.addActionListener(new SaveButtonHandler());
    }

    private class SaveButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Manager.fileManagement.openFileForWriting();
            Manager.fileManagement.save();
            Manager.fileManagement.closeFileForReading();
        }
    }
}
