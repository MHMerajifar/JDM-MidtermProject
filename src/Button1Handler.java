import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1Handler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Author: MHMeraji\n" +
                "This is download manager.\n" +
                "To get started press new download button.");
    }
}
