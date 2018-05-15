import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton {
    public ExitButton(){
        ImageIcon ExitButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\exit.png");
        this.setIcon(ExitButtonImageIcon);

        this.setToolTipText("Exit");

        this.addActionListener(new ExitButtonHandler());
    }

    private class ExitButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
