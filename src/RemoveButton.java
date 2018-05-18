import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveButton extends JButton {
    public RemoveButton(){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\taskcleaner.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Remove");

        this.addActionListener(new RemoveButtonHandler());
    }

    private class RemoveButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int check = 0;
            String name;

            name = JOptionPane.showInputDialog("Enter the name of the file\n" +
                    "you want to remove");

            for (Download download: Manager.downloads){
                if (download.getName().equals(name)){
                    Manager.downloads.remove(download);
                }
            }

            if (check == 1){
                JOptionPane.showMessageDialog(null,"Task is done!","Removed",1);
            } else {
                JOptionPane.showMessageDialog(null,"The file is not found!","Warning",0);
            }

            Manager.printDownloadPanels();
        }
    }
}
