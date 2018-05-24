import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PauseButton extends JButton {
    public PauseButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\pause.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Pause");

        this.addActionListener(new pauseButtonHandler());
    }

    private class pauseButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int check = 0;
            String name;

            name = JOptionPane.showInputDialog("Enter the name of the file\n" +
                    "you want to pause progress");

            for (Download download: Manager.downloads){
                if (download.getName().equals(name)){
                    check = 1;
                    if (download.getStatus() != 2){
                        download.setStatus(2);
                        System.out.println(download.getStatus());
                        System.out.println(download.getStatus());
                    }
                }
            }

            if (check == 1){
                JOptionPane.showMessageDialog(null,"Task is done!","Paused!",1);
            } else {
                JOptionPane.showMessageDialog(null,"The file is not found!","Warning",0);
            }

            Manager.printDownloadPanels();
        }

    }
}
