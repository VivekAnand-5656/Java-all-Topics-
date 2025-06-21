package ExceptionHandling.ClassTestWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeatNotAvailableException extends Exception{
    public SeatNotAvailableException(String msg){
        super(msg);
    }
}
class FlightBooking{
    public int seats;
    public void setSeats(int seats){
        this.seats = seats;
    }
    public void seatBooking() throws SeatNotAvailableException{
        Scanner inp = new Scanner(System.in);
        String escape = "Exit";
        String comand ="";
        while(!comand.equals(escape)){
            System.out.println("Enter Passanger Name:");
            String name = inp.nextLine();
            System.out.println("Enter Number of Booking Seats: ");
            int seatNum = inp.nextInt();
            if(seatNum > seats){
                throw new SeatNotAvailableException("Seats Not Available");
            }
            seats-=seatNum;
            inp.nextLine();
            System.out.println("Enter Exixting Point");
            comand = inp.nextLine();
        }
        System.out.println("Available Seats: "+seats);
    }

    public static void main(String[] args) throws SeatNotAvailableException, InputMismatchException {
        FlightBooking flt = new FlightBooking();
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter number of seats: ");
            int seat = inp.nextInt();
            flt.setSeats(seat);
            flt.seatBooking();
        } catch (InputMismatchException ch){
            System.out.println("Error: Input Invalid");
        } catch (SeatNotAvailableException ch){
            System.out.println("Error: "+ch.getMessage());
        }

    }
}
