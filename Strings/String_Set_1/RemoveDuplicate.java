package Strings.String_Set_1;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Programming";
        String copy = "";
        for(int i=0;i<str.length();i++){
            boolean found = false;
            for(int j=0;j<copy.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                copy+=str.charAt(i);
            }
        }
        System.out.println("After Removing Duplicate: "+copy);
    }
}
