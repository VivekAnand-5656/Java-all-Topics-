package ExceptionHandling.Throws;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void readFile() throws IOException{
        FileReader fr = new FileReader("input.txt");
        fr.close();
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e){
            System.out.println("Error occured");
        }
    }
}
