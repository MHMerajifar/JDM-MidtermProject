import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelButton extends JButton {
    public CancelButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\remove.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Cancel");

        this.addActionListener(new cancelButtonHandler());
    }

    private class cancelButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int check = 0;
            String name;

            name = JOptionPane.showInputDialog("Enter the name of the file\n" +
                    "you want to cancel");

            for (Download download: Manager.downloads){
                if (download.getName().equals(name)){
                    check = 1;
                    if (download.getStatus() != 0){
                        download.setStatus(0);
                    }
                }
            }

            if (check == 1){
                JOptionPane.showMessageDialog(null,"Task is done!","In Progress",1);
            } else {
                JOptionPane.showMessageDialog(null,"The file is not found!","Warning",0);
            }

            Manager.printDownloadPanels();
        }
    }
}
