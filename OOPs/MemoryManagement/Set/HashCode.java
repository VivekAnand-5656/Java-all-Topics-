package OOPs.MemoryManagement.Set;
import java.util.Objects;
public class HashCode {
    public String name;
    public int id;
    HashCode(String name,int id){
        this.name=name;
        this.id=id;
    }
    public int hashCode(){
        return Objects.hash(name,id);
    }

    public static void main(String[] args) {
        HashCode hs = new HashCode("Vivek Anand",56);
        HashCode hs2 = new HashCode("Anand",56);
        System.out.println(hs);
        System.out.println(hs2);
    }
}
