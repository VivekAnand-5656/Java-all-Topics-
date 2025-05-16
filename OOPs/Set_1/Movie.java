package OOPs.Set_1;

import java.util.Scanner;

public class Movie {
    String title;
    String genre;
    int duration;
    double rating;
    void updateRating(double newRating){
        rating=newRating;
        System.out.println("New Rating: "+rating);
    }
    void watchMovie(){
        System.out.println("We are watching the movie.");
    }
    void displaymovieDetails(){
        System.out.println("Movie Title: "+title+" Movie Genre: "+genre+" Duration: "+duration+" Rating: "+rating);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Movie det = new Movie();
        System.out.printf("Enter movie title: ");
        det.title = inp.nextLine();
        System.out.printf("Enter Movie Genre: ");
        det.genre = inp.nextLine();
        System.out.println("Enter Duration: ");
        det.duration = inp.nextInt();
        System.out.println("Rating: ");
        det.rating = inp.nextDouble();
        System.out.println("Update Rating: ");
        double newRatin = inp.nextDouble();
        det.updateRating(newRatin);
        det.watchMovie();
        det.displaymovieDetails();

    }
}
