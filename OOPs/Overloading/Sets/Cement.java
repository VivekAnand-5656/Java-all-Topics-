package OOPs.Overloading.Sets;

public class Cement {
    void quality(){
        System.out.println("Cement is good Quality.");
    }
}
class Birla extends Cement{
    public String owner;
    public int quantity;
    void quality(String owner,int quantity){
        this.owner=owner;
        this.quantity=quantity;
        System.out.println(owner+" bought Birla Cement "+quantity+" Bags.");
    }
}
class ACC extends Cement{
    void quality(){
        System.out.println("ACC is good Quality");
    }
    public String name;
    void quality(String name){
        this.name=name;
        System.out.println(name+" bought 50 packs of ACC");
    }
    public static void main(String[] args) {
        ACC qt = new ACC();
        Birla br = new Birla();
        br.owner = "Satyam Kumar";
        br.quantity=50;
        qt.quality();
        qt.name="Vivek Anand";
        qt.quality(qt.name);
        br.quality(br.owner, br.quantity);
    }
}