package OOPs.Interface.PracticeSet;

public interface Playable {
    void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Students play Football");
    }
}
class Guitar implements Playable{
    public void play(){
        System.out.println("He Play with guitar");
    }

    public static void main(String[] args) {
        Football pl = new Football();
        pl.play();
        Guitar gt = new Guitar();
        gt.play();
    }
}
