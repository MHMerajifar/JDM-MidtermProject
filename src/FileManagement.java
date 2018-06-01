import java.io.*;
import java.util.Scanner;

public class FileManagement {
    private File downloadsFile = new File("C:\\Users\\sina\\IdeaProjects\\JDM-MidtermProject\\JDMFiles\\list.jdm");
    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;

    public void openFileForReading(){

        try {
            this.inputStream = new ObjectInputStream(new FileInputStream(downloadsFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openFileForWriting(){

        try {
            this.outputStream = new ObjectOutputStream(new FileOutputStream(downloadsFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(){
        for (Download download: Manager.downloads){
            try {
                outputStream.writeObject(download);
                System.out.println(download.getDownloadName());
                System.out.println("done");

            } catch (IOException e) {
                System.out.println("Error 1");
            }
        }
    }

    public void getBack(){
        Download download;

        try{
            while (true){
                download =(Download) inputStream.readObject();
                if (download.getStatus() != 3){
                    Manager.downloads.add(download);
                }
            }

        }catch (EOFException e){
            System.out.println("eof");
            Manager.printDownloadPanels();
            return;
        }catch (ClassNotFoundException e){
            System.out.println("not found!");
        }catch (IOException e){
            System.out.println("not found 2");
        }
    }

    public void closeFileForReading(){
        try {
            this.outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileForWriting(){
        try {
            this.inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
