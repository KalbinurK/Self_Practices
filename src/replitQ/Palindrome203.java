package replitQ;

import java.util.Arrays;

public class Palindrome203 {
    public static void main(String[] args) {
        /*
        isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true

         */
        String str= "noon";
        boolean isPalindrome = true;
        String str1 = str.replace(" ","");
        String reverse = "";
        for(int i = str1.length()-1; i>=0; i--){
              reverse += str1.charAt(i);
        }
        if (str1.equalsIgnoreCase(reverse)) {
            System.out.println(isPalindrome);
        } else {
            System.out.println(!isPalindrome);
        }
    }
}
