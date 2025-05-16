package OOPs.Set_2;

public class Movie {
    public String title;
    public int minutes;
    public double rating;
    public void setMovie(String title,int minutes,double rating){
        this.title=title;
        this.minutes=minutes;
        this.rating=rating;
    }
    public String getTitle(){
        return title;
    }
    public int getMinutes(){

        return minutes;
    }
    public double getRating(){
        return rating;
    }
    public void display(){
        System.out.println("Title: "+getTitle()+" Duration: "+getMinutes()+" minutes Rating :"+getRating() );
    }
    public boolean isHit(){
        if(rating>=8){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Movie info = new Movie();
        info.setMovie("Salaar",150,8.5);
        info.display();
        System.out.println((info.isHit())?"Movie Hit":"Not Hit Movie");
    }
}
