import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumeButton extends JButton {
    public ResumeButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\play.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Resume");

        this.addActionListener(new resumeButtonHandler());
    }

    private class resumeButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int check = 0;
            String name;

            name = JOptionPane.showInputDialog("Enter the name of the file\n" +
                    "you want to put in progress");

            for (Download download: Manager.downloads){
                if (download.getName().equals(name)){
                    check = 1;
                    if (download.getStatus() != 1){
                        download.setStatus(1);
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
