import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort extends JMenuItem{

    public Sort (){
        this.setText("Sort");

        this.addActionListener(new SortHandler());
    }

    private class SortHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int order;
            int type;
            String[] typeOptions = {"Size","Name"};
            String[] orderOptions = {"Ascending","Descending"};
            ArrayList<Download> sortedList = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> sizes = new ArrayList<>();

            type = JOptionPane.showOptionDialog(null,"How do you want to sort your list?","Type",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null,typeOptions,typeOptions[0]);

            order = JOptionPane.showOptionDialog(null,"Specify your order","Order",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null,orderOptions,orderOptions[0]);

            if (type == 0 && order == 0){
                for(Download download: Manager.downloads){
                    sizes.add(download.getSize());
                }

                Collections.sort(sizes);

                for (Integer size: sizes){
                    sortedList.add(findWithSize(size));
                }
            } else if (type == 1 && order == 0){
                for(Download download: Manager.downloads){
                    names.add(download.getDownloadName());
                }

                Collections.sort(names);

                for (String name: names){
                    sortedList.add(findWithName(name));
                }
            } else if (type == 0 && order == 1){
                for(Download download: Manager.downloads){
                    sizes.add(download.getSize());
                }

                Collections.sort(sizes);
                Collections.reverse(sizes);

                for (Integer size: sizes){
                    sortedList.add(findWithSize(size));
                }
            }  else if (type == 1 && order == 0){
                for(Download download: Manager.downloads){
                    names.add(download.getDownloadName());
                }

                Collections.sort(names);
                Collections.reverse(names);

                for (String name: names){
                    sortedList.add(findWithName(name));
                }
            }

            Manager.centerPanel.removeAll();

            for (Download download: sortedList){
                DownloadPanel downloadPanel = new DownloadPanel(download);

                Manager.centerPanel.add(downloadPanel);

                SwingUtilities.updateComponentTreeUI(Manager.mainFrame.getContentPane());
            }
        }

        public Download findWithSize(int size){
            int check = 0;

            for (Download download: Manager.downloads){
                if (download.getSize() == size){
                    check = 1;
                    return download;
                }
            }

            if (check == 0){
                return null;
            }else {
                return new Download("template","impossible");
            }
        }

        public Download findWithName(String name){
            int check = 0;

            for (Download download: Manager.downloads){
                if (download.getDownloadName() == name){
                    check = 1;
                    return download;
                }
            }

            if (check == 0){
                return null;
            }else {
                return new Download("template","impossible");
            }
        }
    }

}
