package Strings.String_Set_1;

public class Frequency {
    public static void main(String[] args) {
        String str = "vivek Anand";
        for(int i=0;i<str.length();i++){
            int count = 1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
                if(str.charAt(i)!=str.charAt(j)){
                    count=1;
                }
            }
            if(count>=1){
                System.out.println("Char: "+str.charAt(i)+" : "+count);
            }
            count=1;
        }
    }
}
