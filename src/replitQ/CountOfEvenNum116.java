package replitQ;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class CountOfEvenNum116 {
    public static void main(String[] args) {
/*
Given an array nums, calculate the count of even numbers in nums and print out to console.

nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
 */
     Scanner input = new Scanner(System.in);

        int[] nums = new int[10];

        for(int i = 0 ; i<=9 ; i ++) {
            nums[i] = input.nextInt();
        }
         int count =0;
        for(int each : nums){
            if(each%2!=0){
                continue;
            }
              count++;
            }
        System.out.println(count);
            }

        }






