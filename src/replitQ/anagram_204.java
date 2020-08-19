package replitQ;

import java.util.Arrays;

public class anagram_204 {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "Silent";

       word1= word1.toLowerCase();
       word2= word2.toLowerCase();

        char [] ch1 = word1.toCharArray();
        char [] ch2= word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        System.out.println(Arrays.equals(ch1,ch2));






    }
    }


