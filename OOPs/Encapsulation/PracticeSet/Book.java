package OOPs.Encapsulation.PracticeSet;

public class Book {
    private String title;
    private String author;
    private double price;
    public void setTitle(String title,String author,double price){
        this.title = title;
        this.author = author;
        if(price >0){
            this.price = price;
        }
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.println("Title: "+title+" Author: "+author+" Price: "+price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Meri Kahani","Vivek Anand",599);
        book.display();
    }
}
