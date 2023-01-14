import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

    public void scanFromFile(File f){

        try {
            Scanner s = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
