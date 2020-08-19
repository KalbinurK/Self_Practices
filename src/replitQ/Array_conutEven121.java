package replitQ;

import java.util.Scanner;

public class Array_conutEven121 {
    public static void main(String[] args) {
        /*
        Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
         */

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count = 0;

        for(int i = 0; i<=nums.length-1; i++){

            int num = nums[i];
            if(num%2==0){
                count +=1;
            }



        }
        System.out.println(count);


    }
}
