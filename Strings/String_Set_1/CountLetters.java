package Strings.String_Set_1;

public class CountLetters {
    public static void main(String[] args) {
        String word = new String("Hello@123World!");
        int vowel = 0;
        int consonant = 0;
        int digit = 0;
        int special = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A' || word.charAt(i) == 'e' || word.charAt(i) == 'E' || word.charAt(i) == 'i' || word.charAt(i) == 'I' || word.charAt(i) == 'o' || word.charAt(i) == 'O' || word.charAt(i) == 'u' || word.charAt(i) == 'U'){
                vowel++;
            } else if ((word.charAt(i) >= 'A' && word.charAt(i) <='Z' ) || (word.charAt(i)>='a' && word.charAt(i) <= 'z') && (word.charAt(i) != 'a' || word.charAt(i) != 'A' || word.charAt(i) != 'e' || word.charAt(i) != 'E' || word.charAt(i) != 'i' || word.charAt(i) != 'I' || word.charAt(i) != 'o' || word.charAt(i) != 'O' || word.charAt(i) != 'u' || word.charAt(i) != 'U')) {
                consonant++;
            } else if(Character.isDigit(word.charAt(i))){
                digit++;
            } else if(!Character.isLetterOrDigit(word.charAt(i))){
                special++;
            }
        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Constant: "+consonant);
        System.out.println("Digit: "+digit);
        System.out.println("Special Character: "+special);
    }
}
