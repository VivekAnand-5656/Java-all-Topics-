package OOPs.Set_2;

import java.util.Scanner;

public class LibraryBook {
    public String title;
    public String author;
    public boolean isAvailable;
    public void setTitle(String title,String author,boolean isAvailable){
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
    public boolean borrowBook(){
        if(isAvailable){
            isAvailable=false;
            return true;
        } else {
            return false;
        }
    }
    public boolean returnBook(){
        isAvailable=true;
        if(isAvailable){
            return true;
        } else {
            return false;
        }
    }
    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Availability: "+ ((isAvailable)?"Available":"Not Available"));
    }
    public static void main(String[] args) {
        LibraryBook det = new LibraryBook();
        System.out.println("Enter true/false: ");
        Scanner inp = new Scanner(System.in);
        det.isAvailable = inp.nextBoolean();
        det.setTitle("Blossom","Vivek Anand",det.isAvailable);
        System.out.println("Borrow:"+((det.borrowBook())?"You borrowed the book.":"Not Available") );
        System.out.println("Return: "+((det.returnBook())?"Returned the book":"Not available"));
        det.displayInfo();
    }
}
