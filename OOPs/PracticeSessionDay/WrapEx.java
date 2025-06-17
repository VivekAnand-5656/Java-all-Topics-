package OOPs.PracticeSessionDay;

import java.util.Scanner;

public class WrapEx {
    String cv;
    public void checkUpperLower(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter char: ");
        char chr = inp.next().charAt(0);
        Character ch = Character.valueOf(chr);
        if(ch>='a' && ch<='z'){
            System.out.println("LowerCase");
            System.out.println("String Convert: "+ (cv = Character.toString(ch)));
        } else if(ch>='A' && ch<= 'Z'){
            System.out.println("UpperCase");
        }
    }
//    Digit--
    public void checkDigitSpecial(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Value: ");
        char str = inp.next().charAt(0);
        if(str>=0){
            Character ch = Character.valueOf(str);
            String st = Character.toString(ch);
            Integer it = Integer.parseInt(st);
            System.out.println(str + " is Digit and It is convert in Digit.");

        } else if(str>='a' && str<='z' || str>='A'&& str<='Z'){
            System.out.println("Char");
        } else {
            System.out.println("Special Character");
        }
    }
//    Double Convert
    public  void doubleParse(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int num = inp.nextInt();
        Double d = Double.valueOf(num);
        System.out.println("Convert in double: "+d);
    }
    public static void main(String[] args) {
        WrapEx obj = new WrapEx();
        obj.checkUpperLower();
        obj.checkDigitSpecial();
        obj.doubleParse();

//        ----------
        int num = 555;
        Integer newNum = num;
        System.out.println("Convert: "+newNum);
        Integer no = Integer.valueOf(45);
        int ob = no;
        System.out.println("No: "+ob);
        String str = Integer.toString(ob);
        System.out.println("String : "+str);
        Integer a=96;
        Integer b=96;
        System.out.println("Compare: "+a.compareTo(b));
        System.out.println("Second Compare: "+b.compareTo(a));
        System.out.println("Equality: "+a.equals(b));

    }
}
