package replitQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_FrontPiece {
    public static void main(String[] args) {
        /*
        Given an int array of any length, print a new array of its first 2 elements. If the array is smaller
         than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
         */

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();

        }

        int [] num1 = {0};
        if(size>1){
            num1 = new int[2];
        } else {
            num1 = new int[size];

        }
        for (int i =0; i<=num.length-1; i++){
            if(i<2){
                num1[i]= num[i];
            }
        }

        System.out.println(Arrays.toString(num1));





    }
}
