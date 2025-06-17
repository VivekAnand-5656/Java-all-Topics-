package OOPs.Abstraction;

abstract class Vehicles {
    int noOfTyres;
    public abstract void start();
    void display(){   // concrete method
        System.out.println("All Details");
    }
}
class Cars extends Vehicles{
    int noOfTyres = 4;
    public void start(){
        System.out.println("Car starts with key. "+noOfTyres);
    }
    void display(){
        System.out.println("Car is luxirious.");
    }
}
class Bikes extends Vehicles{
    int noOfTyres = 2;
    public void start(){
        System.out.println("Bike starts with kick "+noOfTyres);
    }
    void display(){
        System.out.println("Bike is luxirious.");
    }

    public static void main(String[] args) {
        Bikes bk = new Bikes();
        bk.start();
        bk.display();
        Cars ck = new Cars();
        ck.start();
        ck.display();
    }
}
