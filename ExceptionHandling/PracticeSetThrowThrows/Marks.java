package ExceptionHandling.PracticeSetThrowThrows;

public class Marks {
    public void checkMarks(double marks) throws ArithmeticException,Exception{
        if(marks < 0){
            throw new Exception("Please Recheck Because Negative Marks is not Available");
        }
        if(marks < 40){
            throw new ArithmeticException("You're Failed!");
        } else {
            System.out.println("Passed");
        }
    }
    public void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by 0 is not allowed");
        }
    }

    public static void main(String[] args) {
        Marks obj = new Marks();
        try {
            obj.checkMarks(-110);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception check){
            System.out.println(check.getMessage());
        }

        try {
            int a = 10,b=2;
            obj.divide(a,b);
            int result = a/b;
            System.out.println("Result: "+result);
        } catch (ArithmeticException c){
            System.out.println(c.getMessage());
        }
    }
}
