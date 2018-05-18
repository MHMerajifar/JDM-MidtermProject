import java.util.Random;

/**
 * This class represent any download
 * that is happening and have all its status
 * and name and also URL
 */
public class Download {
    private String name;
    private String URL;
    private int size;
    /*
    for status we have
    0 : canceled
    1 : resumed
    2 : paused
     */
    private int status;

    public Download(String name, String URL) {
        this.name = name;
        this.URL = URL;
        this.status = 1;
        this.size = sizeMaker();
    }

    public static int sizeMaker(){
        Random random = new Random();
        int size = random.nextInt(3500);
        return size+=500;
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
}
