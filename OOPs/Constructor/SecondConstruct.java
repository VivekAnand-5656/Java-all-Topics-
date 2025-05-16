package OOPs.Constructor;

public class SecondConstruct {
    SecondConstruct (String name,int age){
        System.out.println("Name: "+name+" Age: "+age);
    }

    public static void main(String[] args) {
        SecondConstruct sc = new SecondConstruct("Vivek Anand",56);
    }
}
