import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingUtilities.updateComponentTreeUI;

public class SettingButton extends JButton {
    private static int numberOfSimultaneousDownloads = 100;
    private static String savingLocation = "Desktop";

    public SettingButton(JFrame mainFrame){

        ImageIcon newDownloadButtonImageIcon = new ImageIcon("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\EagleGetIcons\\settings.png");
        this.setIcon(newDownloadButtonImageIcon);

        this.setToolTipText("Setting");

        this.addActionListener(new SettingButtonHandler(mainFrame));
    }

    private class SettingButtonHandler implements ActionListener{
        private JFrame mainFrame;

        public SettingButtonHandler(JFrame mainFrame){
            this.mainFrame = mainFrame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame settingFrame = new JFrame("Setting");

            JPanel locationPanel = new JPanel();
            JLabel locationLabel = new JLabel("Enter the location for the files to save:");
            JTextField locationField = new JTextField("Desktop");
            locationField.addActionListener(new LocationTextHandler(locationField));
            locationPanel.add(locationLabel);
            locationPanel.add(locationField);
            locationPanel.setLayout(new GridLayout(1,0));

            JPanel numberPanel = new JPanel();
            JLabel numberLable = new JLabel("Enter the number of Simultaneous downloads");
            JTextField numberField = new JTextField("Infinite");
            numberField.addActionListener(new NumberTextHandler(numberField));
            numberPanel.add(numberLable);
            numberPanel.add(numberField);
            numberPanel.setLayout(new GridLayout(1,0));

            JButton lookButton = new JButton("Change the look and feel");
            lookButton.addActionListener(new LookHandler(mainFrame));

            settingFrame.add(locationPanel);
            settingFrame.add(numberPanel);
            settingFrame.add(lookButton);

            settingFrame.setLayout(new GridLayout(3,0));

            settingFrame.setSize(500,150);
            settingFrame.setLocationRelativeTo(null);
            settingFrame.setVisible(true);
        }

        private class LocationTextHandler implements ActionListener{
            private JTextField field;

            public LocationTextHandler(JTextField textField){
                this.field = textField;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                savingLocation = this.field.getText();
            }
        }

        private class NumberTextHandler implements ActionListener{
            private JTextField field;

            public NumberTextHandler(JTextField textField){
                this.field = textField;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfSimultaneousDownloads = Integer.parseInt(this.field.getText());
            }
        }

        private class LookHandler implements ActionListener{
            private JFrame mainFrame;

            public LookHandler(JFrame mainFrame){
                this.mainFrame = mainFrame;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] options ={"Windows","Nimbus","Metal","Windows10"};

                int choice = JOptionPane.showOptionDialog(null,"Choose your look and feel!","Look and Feel",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);

                if (choice == 0){
                    try {
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (InstantiationException e1) {
                        e1.printStackTrace();
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    } catch (UnsupportedLookAndFeelException e1) {
                        e1.printStackTrace();
                    }

                    updateComponentTreeUI(mainFrame);

                    updateComponentTreeUI(mainFrame);
                } else if (choice == 1){
                    try {
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                    } catch (InstantiationException e3) {
                        e3.printStackTrace();
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (UnsupportedLookAndFeelException e3) {
                        e3.printStackTrace();
                    }

                    updateComponentTreeUI(mainFrame);

                    updateComponentTreeUI(mainFrame);
                } else if (choice == 2){

                    try {
                        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (InstantiationException e1) {
                        e1.printStackTrace();
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    } catch (UnsupportedLookAndFeelException e1) {
                        e1.printStackTrace();
                    }

                    updateComponentTreeUI(mainFrame);

                    updateComponentTreeUI(mainFrame);
                }else if (choice == 2){
                    try {
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    } catch (ClassNotFoundException e2) {
                        e2.printStackTrace();
                    } catch (InstantiationException e2) {
                        e2.printStackTrace();
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (UnsupportedLookAndFeelException e2) {
                        e2.printStackTrace();
                    }

                    SwingUtilities.updateComponentTreeUI(mainFrame);

                    SwingUtilities.updateComponentTreeUI(mainFrame);
                }
            }
        }
    }
}
