package Strings.String_Set_1;

public class AnagramSBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("listen");
        int strCount = 0;
        StringBuffer str2 = new StringBuffer("silent");

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str.charAt(i) == str2.charAt(j)){
                    strCount = 1;
                } else {
                    strCount = 0;
                }
            }
        }
        if(strCount == 1){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        
    }

    public static class RemoveDuplicate {
    }
}
