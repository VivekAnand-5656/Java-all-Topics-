package OOPs;

public class Book {
    String title;
    String author;
    void publish(){
        System.out.println("Book Tittle : " + title + " and Author : " + author);
    }
    public static void main(String[]args){
        Book b1 = new Book();
        b1.title = "Blossom";
        b1.author = "KabirDas";
        b1.publish();
    }
}
