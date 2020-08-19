package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class Slice_Number {
    public static void main(String[] args) {
        /*
In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

         */
        Scanner scan = new Scanner(System.in);
        int num, digit1, digit2, digit3, digit4, digit5;

        System.out.println("Enter your number:");
        num = scan.nextInt();

   //     String numbers = String.valueOf(num);
   //     String[] digit= numbers.split(" ");
    //    for(String each : digit){
    //        System.out.println(each);
    //    }
    //    digit1=num/10000;  //1
//        digit2=(num%10000)/1000; // 2345/1000=2
//        digit3=(num%1000)/100; //  345/100=3
//        digit4=(num%100)/10;
//        digit5=(num%10);
//        System.out.println(digit1);
//        System.out.println(digit2);
//        System.out.println(digit3);
//        System.out.println(digit4);
//        System.out.println(digit5);
// 12345

        for (int i=10000;i>=10;i/=10){
            if(i==10000){
                System.out.println(num/i);
            }
            System.out.println(num%i/(i/10));
        }

    }
}
