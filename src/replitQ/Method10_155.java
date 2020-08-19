package replitQ;

import java.util.Scanner;

public class Method10_155 {
    /*
    Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number");
        int num = input.nextInt();

        String n =next3(num);
        System.out.println(n);

    }
    public static String next3(int num){


        return((num+1)+" "+(num+2)+" "+(num+3));
    }


}