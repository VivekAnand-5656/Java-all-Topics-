package OOPs.WrapperClasses;
// Unboxing----
public class WrapClass {
    public static void main(String[] args) {
        Integer intObj =  Integer.valueOf(10);
        Double doObj = Double.valueOf(10.6);
        Boolean bObj = Boolean.valueOf(true);

        int intValue = intObj.intValue();
        double doubleValue = doObj.doubleValue();
        boolean bolValue = bObj.booleanValue();
        System.out.println("Integer: "+intValue);
        System.out.println("Double: "+doubleValue);
        System.out.println("Boolean: "+bolValue);
    }
}
