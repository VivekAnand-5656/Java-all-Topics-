package ExceptionHandling;

import java.io.FileReader;

public class ExcExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("download.txt");
        } catch (Exception check) {
            System.out.println("File not exixt.Please create filie!");
        }
    }
}
