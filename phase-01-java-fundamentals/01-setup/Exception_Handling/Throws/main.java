package Exception_Handling.Throws;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.logging.FileHandler;

public class main {
    public static void main(String[] args) throws IOException{
        level2();
    }

    public static void level1() throws FileNotFoundException {
        FileReader fl = new FileReader("a.txt");
        System.out.println("file not found");
    }

    public static void level2() throws FileNotFoundException {
        level1();
    }
}
