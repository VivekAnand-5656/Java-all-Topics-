package OOPs.Overloading.Sets;

public class Transport {
    void travelMode(){
        System.out.println("Travelling.");
    }
}
class Bus extends Transport{
    void travelMode(){
        System.out.println("Travelling by Bus.");
    }
}
class Train extends Transport{
    void travelMode(){
        System.out.println("Travelling by Train.");
    }
}
class Flight extends Transport{
    void travelMode(){
        System.out.println("Travelling by Flight.");
    }

    public static void main(String[] args) {
        Transport tv = new Bus();
        Transport tt = new Train();
        Transport tf = new Flight();
        tv.travelMode();
        tt.travelMode();
        tf.travelMode();
    }
}