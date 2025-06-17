package OOPs.PracticeSession;

public class Person2 extends Person{
    void child(){
        System.out.println("Coders");
    }
    protected int run;
    protected void cool(){
        System.out.println("Increase Cool");
    }

}
class Child extends Person2{
    public static void main(String[] args) {
        Sub obj = new Sub();
        Child ob = new Child();
        ob.run = 10;
        ob.cool();
        ob.run=89;
//        obj.boss;
        Person2 nn = new Person2();
//        nn.boss;
    }
}