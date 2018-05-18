import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Manager {
    /**
     * Now we want to make the basic containers of
     * the jdm with a main frame and some sub panels.
     */
    public static JFrame mainFrame;
    public static JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel topPanel;
    private JToolBar toolBar;
    private JMenuBar menuBar;
    /**
     * This two array lists have the main
     * information about the manager.
     */
    public static ArrayList<Download> downloads;
    public static ArrayList<DownloadPanel> downloadPanels;

    public Manager(){
        this.downloads = new ArrayList<>();
        this.downloadPanels = new ArrayList<>();

        this.mainFrame = new JFrame("JDM");
        this.centerPanel = new JPanel();
        this.leftPanel = new JPanel();
        this.topPanel = new JPanel();
        this.toolBar = new JToolBar();
        this.menuBar = new JMenuBar();
        /**
         * In this part I am going to shape the
         * menu bar.
         */
        JMenu menu = new JMenu("Download");

        menu.add(new NewDownloadButton(this.centerPanel));
        menu.add(new CancelButton());
        menu.add(new ResumeButton());
        menu.add(new PauseButton());
        menu.add(new RemoveButton());
        menu.add(new SettingButton());
        menu.add(new ExitButton());

        this.menuBar.add(menu);

        JMenu menu1 = new JMenu("Help");

        JButton button1 = new JButton("About Soft Ware");
        JButton button2 = new JButton("*** About  Us ***");

        button1.addActionListener(new Button1Handler());
        button2.addActionListener(new Button2Handler());

        menu1.add(button1);
        menu1.add(button2);

        this.menuBar.setBorder(BorderFactory.createTitledBorder("MENU"));

        this.menuBar.add(menu1);
        /**
         * In this part tool bar is going to be shaped .
         */
        for (int i = 0; i < 2; i++){
            this.toolBar.add(new JPanel());
        }
        this.toolBar.add(new NewDownloadButton(this.centerPanel));
        this.toolBar.add(new ResumeButton());
        this.toolBar.add(new PauseButton());
        this.toolBar.add(new CancelButton());
        this.toolBar.add(new RemoveButton());
        this.toolBar.add(new SettingButton());

        this.toolBar.setLayout(new GridLayout(1,0));
        /**
         * This part is going to shape the top panel that
         * is made of the menu bar and the tool bar
         */
        this.topPanel.setPreferredSize(new Dimension(800,100));

        this.topPanel.add(this.menuBar);
        this.topPanel.add(this.toolBar);

        this.topPanel.setLayout(new GridLayout(0,1));
        /**
         * This part is dedicated to shaping
         * center panel.
         */
        JScrollPane scroll = new JScrollPane(centerPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        /**
         * In this part the
         * left panel is shaped and added to the
         * main frame
         */
        this.leftPanel.setPreferredSize(new Dimension(200,700));

        this.leftPanel.add(new ProcessingButton());
        this.leftPanel.add(new FinishedButton());
        for (int i = 0; i < 10; i++)
            this.leftPanel.add(new JPanel());

        this.leftPanel.setBorder(BorderFactory.createBevelBorder(1));
        this.leftPanel.setLayout(new GridLayout(0,1,10,10));
        /**
         * In this part all the components are
         * going to be added to the main frame
         */
        this.mainFrame.add(this.leftPanel,BorderLayout.WEST);
        this.mainFrame.add(this.topPanel,BorderLayout.NORTH);
        this.mainFrame.add(scroll);
        /**
         * We are going to make and shape the main frame.
         */
        this.mainFrame.setSize(800,800);
        this.mainFrame.setLocationRelativeTo(null);
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setVisible(true);
    }

    public static void printDownloadPanels(){
        Manager.centerPanel.removeAll();

        Manager.centerPanel.setLayout(new GridLayout(100,1,10,10));

        for (DownloadPanel downloadPanel:Manager.downloadPanels){
            Manager.centerPanel.add(downloadPanel);
        }

        SwingUtilities.updateComponentTreeUI(Manager.mainFrame.getContentPane());
    }

}
