package Strings.SCP;

public class ScpExample {

    public static void main(String[] args) {
//        String str1 = "Java";
//        String str2 = "Java";
//        String str3 = new String("Java");
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
        StringBuffer str = new StringBuffer("Java");
        str.append(" Programming");
//        str.insert(str.length()," Boss");
//        System.out.println(str);
//        str.replace(0,5,"Vivek ");
        System.out.println(str);
//        str.delete(0,5);
//        str.deleteCharAt(0);
//        System.out.println(str.indexOf("Programming"));
        str.reverse();
        System.out.println(str);

    }
}
