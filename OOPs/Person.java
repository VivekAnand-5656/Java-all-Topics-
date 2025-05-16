package OOPs;

public class Person {
    private String name;
    private int age;
    private String add;
    private String dob;
    private void detail(){
        System.out.println("Name : " + name + ",Age : "+age+",Address : "+add+",DOB : "+dob);
    }
    public static void main(String[]args){
        Person disp = new Person();
        disp.name = "Vivek Anand";
        disp.age = 21;
        disp.add = "Deoghar";
        disp.dob = "07-06-2005";
        disp.detail();
    }
}
