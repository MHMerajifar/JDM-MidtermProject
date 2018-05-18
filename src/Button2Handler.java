import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Handler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Author: MHMeraji\n" +
                "Student Number: 9631071\n" +
                "This is a midterm project.");
    }
}
