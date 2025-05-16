package OOPs.MemoryManagement.Set;
import java.util.*;
//  Override toString() in a class:
public class FirstQuestion {
    String brand;
    int year;
    FirstQuestion(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public String toString(){
        return "Car:{ Brand: "+brand+", Year: "+year+" }";
    }
    // Override toString() to print: Car{brand='Tesla', year=2021}
    public static void main(String[] args) {
        FirstQuestion det = new FirstQuestion("Tesla",2024);
        FirstQuestion det2 = new FirstQuestion("Thar Roxx",2024);

        System.out.println(det);
        System.out.println(det2);
    }
}
