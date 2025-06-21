package ExceptionHandling.CodingAgePractice;

import java.io.FileReader;

public class FileMissingException extends Exception{
    public FileMissingException(String msg){
        super(msg);
    }
    public static void readFile(String file){

    }
}
