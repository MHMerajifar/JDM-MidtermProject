import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SearchButton extends JButton {
    public SearchButton(){
        this.setText("Search!");

        this.addActionListener(new SearchButtonHandler());
    }

    private class SearchButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String search;
            ArrayList<Download> searchedDownloads = new ArrayList<>();

            search = JOptionPane.showInputDialog(null, "Search in here");

            for (Download download: Manager.downloads){
                if (download.getDownloadName().contains(search) || download.getURLString().contains(search)){
                    searchedDownloads.add(download);
                }
            }

            printSearchedDownload(searchedDownloads);
        }

        public void printSearchedDownload(ArrayList<Download> downloads){
            Manager.centerPanel.removeAll();

            for (Download download:downloads){
                Manager.centerPanel.add(new DownloadPanel(download));
            }

            SwingUtilities.updateComponentTreeUI(Manager.mainFrame.getContentPane());
        }
    }
}
