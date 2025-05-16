package OOPs.Set_1;

import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public double price;
    public int pages;
    public double newPrice;
    public void readPages(int count){
        System.out.println("Read Pages: "+count);
    }
    public void updatePrice(double updPrice){
        newPrice = updPrice;
    }
    public void displayBookInfo(){
        System.out.println("Title: "+title+" Author: "+author+" Old Price: "+price+ " NewPrice: "+newPrice);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Book det = new Book();
        System.out.println("Enter Title: ");
        det.title = inp.nextLine();
        System.out.println("Enter Author: ");
        det.author = inp.nextLine();
        System.out.println("Enter Price: ");
        det.price = inp.nextDouble();
        System.out.println("Enter Pages: ");
        det.pages = inp.nextInt();

        System.out.println("Enter Count: ");
        int count = inp.nextInt();
        det.readPages(count);

        System.out.println("Enter New Price: ");
        double newP = inp.nextDouble();
        det.updatePrice(newP);
        det.displayBookInfo();
    }
}
