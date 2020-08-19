package replitQ;

import java.util.Scanner;

public class SumNumArray {
    /*
    Given an array num, calculate the sum of all numbers in nums and print out to console.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;

        for(int i=0; i< nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);

    }
}
