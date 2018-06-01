import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewDownloadButton extends JButton implements ActionListener {
    private String URL;
    private String nameOfTheFile;
    private boolean URLEntered = true;
    private boolean nameEntered = true;


    public NewDownloadButton(JPanel centerPanel){
        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\add.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("New Download");

        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        URL =  JOptionPane.showInputDialog("Enter URL");
        nameOfTheFile = JOptionPane.showInputDialog("Enter the name of the file");

        if(URL.equals("")){
            URLEntered = false;
        }
        if (nameOfTheFile.equals("")){
            nameEntered = false;
        }
        if (URLEntered==false || nameEntered==false){
            JOptionPane.showMessageDialog(null,"Please fill the blocks completely");
        }

        if (URLEntered==true && nameEntered==true){
            Download download = new Download(nameOfTheFile,URL);

            download.start();

            DownloadPanel downloadPanel = new DownloadPanel(download);

            Manager.downloads.add(download);

            Manager.printDownloadPanels();


        }
    }


}