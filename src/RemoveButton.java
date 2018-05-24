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
                    check = 1;
                    if (download.getStatus() != 3) {
                        download.setStatus(3);
                        Manager.removedDownloads.add(download);
                        Manager.downloads.remove(Manager.downloads.indexOf(download));
                        for (Download download1 : Manager.removedDownloads){
                            System.out.println(download1.getName());
                        }
                    }
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
