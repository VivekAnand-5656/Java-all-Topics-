package OOPs.Inheritance.Set_1;

public class Book {
    String title = "A Time to Kill";
    String author = "John Grisham";
    void showDetail(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class LibraryBook extends Book{
    int shelfNumber = 5;
    void showDetail(){
        super.showDetail();
        System.out.println("Shelf Number: "+shelfNumber);
    }

    public static void main(String[] args) {
        LibraryBook obj = new LibraryBook();
        obj.showDetail();
    }
}
