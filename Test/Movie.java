package Test;

public class Movie {
    String title;
    int duration;
    double rating;
    void setDetail(String title,int duration,double rating){
        System.out.println("Title: "+title+" Duration: "+duration+" Rating: "+rating);
    }
    boolean isLongMovie(){
        return duration>120;
    }
    void display(){
        System.out.println("Title: "+title+" Duration: "+duration+" Rating: "+rating);
    }
    public static void main(String[] args) {
        Movie det = new Movie();
        det.title = "Salaar";
        det.duration = 260;
        det.rating = 5.2;
        det.setDetail(det.title,det.duration,det.rating);
        if(det.isLongMovie()){
            System.out.println("Long Movie");
        } else {
            System.out.println("No long");
        }
        det.display();
    }
}
