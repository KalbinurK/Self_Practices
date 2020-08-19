package replitQ;

import java.util.Arrays;

public class MethodwithString4_181 {
    public static void main(String[] args) {

        String words= "far cole too";

        String [] arr = words.split(" ");

        int count =0;
        for( int i =0; i <= arr.length-1; i++){

             count++;

        }

        System.out.println(count);
        // reverse
        String input = "foo";
        String reverse = "";
        for(int i = input.length()-1; i>=0; i--){
                   reverse+= input.charAt(i);
        }
        System.out.println(reverse);

        // skip
        System.out.println("===================");

        String text = "one two three";
        String bedword= "two";

        text = text.replace(bedword,"");
        System.out.println(text);

        System.out.println("=================");

        String text1 = "abcd";
        int maxLength = 2;

        String new1 = text1.substring(0,maxLength);


        System.out.println(new1);

        System.out.println("=================");

        // add str to spacific index in the str.
        String target = "longword";
        String word = "foo";

        int index= 2;
        String new2= "";
        for(int i =0 ; i<= target.length()-1;i++) {
            new2 += target.charAt(i);
            if (i == index) {

                new2 += word;


            }


        }
        System.out.println(new2);

        System.out.println("=========================");
          // find bigger str
        String a = "apple";
        String b = "orange";

        int al= a.length();
        int bl= b.length();

        if(al>bl){
            System.out.println(a);
        } else{
            System.out.println(b);
        }

        System.out.println("==========================");
        // remove first cha;
        String target1 = "aaa";

        target1 = target1.substring(1);

        System.out.println(target1);


    }

}
