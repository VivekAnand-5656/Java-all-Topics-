package Strings.String_Set_1;

public class NonRepeating {
    public static void main(String[] args) {
        String str ="vivek";
        for(int i=0;i<str.length();i++){
            boolean found = false;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Non Repeat: "+str.charAt(i));
                return;
            }
        }
    }
}
