package OOPs.Encapsulation;

public class StudentDetail {
    private String name;
    private int age;
    private double marks;
    public void data(String name,int age,double marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getMarks(){
        return marks;
    }
    public void display(){
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
    }

    public static void main(String[] args) {
        GameCharacter game = new GameCharacter();
        game.setName("Jumbie", 2,33);
        System.out.println(game.getName() + " " + game.getHealth() + " " + game.getLevel());
    }
}
