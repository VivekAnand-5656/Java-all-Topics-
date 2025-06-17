package OOPs.PersonalPractice;

public class PersonChild extends Person{
    private String address;
    private String mob;
    public PersonChild(String address,String mob){
        this.address = address;
        this.mob = mob;
    }
    public String getAddress(){
        return address;
    }
    public String getMob(){
        return mob;
    }
    public void display(){
        super.display();
        System.out.println("Address: "+address);
        System.out.println("Mobile Num: "+mob);
    }

    public static void main(String[] args) {
        PersonChild data = new PersonChild("Chandan,Kusumdih","7481873859");
        data.setName("Vivek Anand",21,50000);
         data.display();

    }
}
