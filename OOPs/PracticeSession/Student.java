package OOPs.PracticeSession;

public class Student {
    public String name;
    public int rollNo;
    public double marks;
    public boolean isPass;
    private void setName(String name,int rollNo,double marks,boolean isPass){
        this.name=name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.isPass = isPass;
    }
    private String getName(){
        return name;
    }
    private int getRollNo(){
        return rollNo;
    }
    private double getMarks(){
        return marks;
    }
    private boolean getIsPass(){
        return isPass;
    }
    private void display(){
        System.out.println("----------Student---------");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
        if(isPass){
            System.out.println("is Pass: Pass");
        }
        else {
            System.out.println("is Pass: Fail");
        }

    }
    public static void main(String[] args) {
     Student obj = new Student();
     obj.setName("Vivek Anand",102,356,false);
     obj.display();
    }
}

