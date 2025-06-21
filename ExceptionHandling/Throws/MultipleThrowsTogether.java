package ExceptionHandling.Throws;

public class MultipleThrowsTogether {
    public static void checking(int num,int age) throws ArithmeticException,Exception{
        if(num == 0){
            throw new ArithmeticException("Can not divide by 0");
        } else {
            System.out.println("Divide");
        }
        if(age<18){
            throw new Exception("Age must be 18 or older");
        }
    }

    public static void main(String[] args) {
        try {
            checking(10,17);
        } catch (ArithmeticException ch){
            System.out.println(ch.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
