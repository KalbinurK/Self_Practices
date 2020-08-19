package replitQ;

import java.util.Scanner;

public class CountHi098 {
    public static void main(String[] args) {
    /*
    Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2
     */
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();

        int count =0;
        for(int i =0; i <=str.length()-2; i++){
            String s= str.substring(i,i+2);
        if(s.equals("hi")){
            count +=1;
        }

        }

        System.out.println(count);



    }
}
