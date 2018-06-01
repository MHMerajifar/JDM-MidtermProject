import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * This class represent any download
 * that is happening and have all its status
 * and name and also URL
 */
public class Download extends Thread implements Serializable{
    private String name;
    private String URLString;
    private int size;
    public volatile boolean exit = false;
    /*
    for status we have
    0 : canceled
    1 : resumed
    2 : paused
    3 : removed
     */
    private int status;
    private File file;
    private URL url;
    private HttpURLConnection connection;

    public Download(String name, String URL) {
        this.name = name;
        this.URLString = URL;
        this.status = 1;
        this.file = new File("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\DownloadFiles\\"+this.name+".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error in creating a new file");
        }

        try {
            this.url = new URL(this.URLString);
        } catch (MalformedURLException e) {
            System.out.println("The URL is malformed");
        }

        try {
            connection = (HttpURLConnection) this.url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.size = sizeMaker();
    }

    public URL getUrl() {
        return url;
    }

    public HttpURLConnection getConnection() {
        return connection;
    }

    public static int sizeMaker(){
        Random random = new Random();
        int size = random.nextInt(3500);
        return size+=500;
    }

    public boolean isFinished(){
        return false;
    }

    public String getDownloadName() {
        return name;
    }

    public String getURLString() {
        return URLString;
    }

    public void setURL(String URLString) {
        this.URLString = URLString;
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

    public void stopThread(){
        exit = true;
    }

    @Override
    public void run() {
       while(!this.exit){
           if (this.getStatus() == 1){
               for (int i = 0; i < 10000;i++){
                   for (int j = 0; j < 1000000; j++){
                       for (int k = 0 ; k < 100000;k++){
                           try {
                               this.sleep(1000);
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                           System.out.println(this.getDownloadName() + " " + k);
                       }
                   }
               }
           }

       }
    }
}
