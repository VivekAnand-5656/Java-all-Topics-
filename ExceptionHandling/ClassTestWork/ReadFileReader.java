package ExceptionHandling.ClassTestWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileReader {
    public static void fileReader() throws FileNotFoundException,IOException {
        try {
            FileReader fr = new FileReader("vivek.txt");
            System.out.println("File: "+fr);
        } catch (FileNotFoundException ch){
            System.out.println("File not Found");
        } catch (IOException ch){
            System.out.println("File erro");
        }
    }

    public static void main(String[] args) {
//        fileReader();  Pending
    }
}
