package OOPs.Interface.PracticeSet;

public interface Flyable {
    void fly();
}
class Aeroplane implements Flyable{
    public void fly(){
        System.out.println("Aeroplane Fly in the sky");
    }
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Birds fly in the sky");
    }

    public static void main(String[] args) {
        Aeroplane fl = new Aeroplane();
        fl.fly();
        Bird br = new Bird();
        br.fly();
    }
}
