import javax.swing.*;
import java.io.*;
import java.util.Random;

/**
 * This class represent any download
 * that is happening and have all its status
 * and name and also URL
 */
public class Download implements Serializable, Runnable{
    private String name;
    private String URL;
    private int size;
    /*
    for status we have
    0 : canceled
    1 : resumed
    2 : paused
    3 : removed
     */
    private int status;
    private File file;

    public Download(String name, String URL) {
        for (Download download: Manager.downloads){
            if (download.getName().equals(name)){
                JOptionPane.showMessageDialog(null,"This file already exits","Duplicate Error",1);
            } else {
                this.name = name;
            }
        }
        this.name = name;
        this.URL = URL;
        this.status = 1;
        this.size = sizeMaker();
        this.file = new File("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\DownloadFile\\"+this.name+".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error in creating a new file");
        }
    }

    public static int sizeMaker(){
        Random random = new Random();
        int size = random.nextInt(3500);
        return size+=500;
    }

    public boolean isFinished(){
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public File getFile() {
        return file;
    }

    @Override
    public void run() {

    }
}
