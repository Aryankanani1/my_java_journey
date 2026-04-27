package Exception_Handling.Finally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("example.text"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
           if(reader != null){
               reader.close();
           }
            }catch (IOException e){
                System.out.println("error while closing");
            }
        }
    }
}
