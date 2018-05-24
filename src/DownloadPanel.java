import javax.swing.*;
import java.awt.*;

public class DownloadPanel extends JPanel {
    private JProgressBar progressBar;
    private JLabel label1;
    private int min;
    private int max;
    private JLabel label2;
    private JLabel status;

    public DownloadPanel(Download download){
        this.min = 0;
        this.max = min + download.getSize();

        this.progressBar = new JProgressBar();
        this.progressBar.setBounds(80,60,400,20);
        this.progressBar.setMinimum(this.min);
        this.progressBar.setMaximum(this.max);
        this.progressBar.setForeground(Color.BLUE);
        this.progressBar.setValue(0);
        this.progressBar.setStringPainted(true);
        this.progressBar.setVisible(true);

        this.label1 = new JLabel("Name: "+download.getName());
        this.label1.setBounds(80,20,200,20);

        this.label2 = new JLabel("URL: "+download.getURL());
        this.label2.setBounds(280,20,200,20);

        if (download.getStatus() == 0){
            this.status = new JLabel("   Canceled!");
        }
        if (download.getStatus() == 1){
            this.status = new JLabel("   In Progress!");
        }
        if (download.getStatus() == 2){
            this.status = new JLabel("   Paused!");
        } if (download.getStatus() == 3){
            this.status = new JLabel("   removed");
        }

        this.status.setBounds(480,10,80,20);
        this.status.setBorder(BorderFactory.createBevelBorder(1));
        this.status.setBackground(Color.WHITE);
        this.status.setOpaque(true);
        this.status.setForeground(Color.RED);

        this.add(this.status);
        this.add(this.label2);
        this.add(this.label1);
        this.add(this.progressBar);

        this.setLayout(null);

        this.setPreferredSize(new Dimension(600,100));
        this.setBackground(Color.orange);
        this.setOpaque(true);
    }
}
