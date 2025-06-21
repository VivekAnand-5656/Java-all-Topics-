package ExceptionHandling.Throws;

public class PositiveCheck {
    public void positive(int num) throws Exception{
        if(num<0){
            throw new Exception("Number is negative");
        } else{
            System.out.println("Number is positive");
        }
    }
    public static void main(String[] args) {
        PositiveCheck ps = new PositiveCheck();
        try {
            ps.positive(10);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
