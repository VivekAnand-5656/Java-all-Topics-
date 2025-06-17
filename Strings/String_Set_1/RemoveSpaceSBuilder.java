package Strings.String_Set_1;

public class RemoveSpaceSBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Java is awesome and how re");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }
}
