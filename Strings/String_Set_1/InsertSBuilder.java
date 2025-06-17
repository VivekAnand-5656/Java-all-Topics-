package Strings.String_Set_1;

public class InsertSBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello Programming");
        int index = str.indexOf(" ");
        str.insert(index," Java");
        System.out.println(str);
    }
}
