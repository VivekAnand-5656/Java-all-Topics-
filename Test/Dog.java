package Test;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public void setDetail(String name,String breed,int age){
        System.out.println("Name: "+name+" Breed: "+" Age: "+age);
    }
    public void bark(){
        System.out.println("Dog is barking!");
    }
    public void display(){
        System.out.println("Name: "+name+" Breed: "+" Age: "+age);
    }
    public static void main(String[] args) {
        Dog det = new Dog();
        det.name = "Jenny";
        det.breed = "ChauCHau";
        det.age = 6;
        det.setDetail(det.name, det.breed,det.age);
        det.bark();
        det.display();
    }
}
