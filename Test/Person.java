package Test;

public class Person {
    String name;
    int age;
    void setDetails(String nm,int ag){
        System.out.println("Name: "+nm+" Age: "+ag);
    }
    boolean isAdult(){
        return age>=18;
    }
    void greet(){
        if(isAdult()){
            System.out.println("I am adult!");
        } else {
            System.out.println("Not adult");
        }
    }
    public static void main(String[] args) {
        Person det = new Person();
        det.name="Vivek Anand";
        det.age = 17;
        det.setDetails(det.name,det.age);
        det.greet();
    }
}
