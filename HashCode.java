public class HashCode {
    String name;
    int roll;
    HashCode(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    public static void main(String[] args) {
        HashCode hs = new HashCode("Vivek Anand",101);
        HashCode ht = new HashCode("Vivek Anand",101);
        System.out.println(hs);
        System.out.println(ht);
    }
}
