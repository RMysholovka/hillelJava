package IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by RMysholovka on 19.11.2015.
 */
public class IOMain {
    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("d:/myFile.txt")) {


            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void uglyRead() {
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("d:/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println((char) value);

            }


        } catch (IOException e) {
            System.out.println(e);

        } finally {

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

        }
    }

    private static void pathesAndFileCreation() throws IOException {
        System.out.println("yes\\no");
        System.out.println("c:\\program files\\myProgram");
        String win = "c:\\HaxLogs.txt";
        String unix = "c:/HaxLogs.txt";
        File winFile = new File(win);
        System.out.println("win file exists: " + winFile.exists());
        File unixFile = new File(win);
        System.out.println("win file exists: " + unixFile.exists());

        Path path = Paths.get("myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("d:/myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());


        if (!Files.exists(absolutePath)) {
            Files.createFile(absolutePath);
            System.out.println("file created");
        } else {
            System.out.println("file already exists");
        }
    }

}
