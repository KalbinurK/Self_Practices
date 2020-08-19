package replitQ;

import java.util.Scanner;

public class Array_FindNonDup122 {
    public static void main(String[] args) {
        /*
        Given an array nums with 7 integers every element is repeated twice - except one.
        Find that element and print it to console.
         */
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int j = 0; j <= nums.length - 1; j++) {
            int num1 = nums[j];
            int count = 0;
            for (int i = 0; i <= nums.length - 1; i++) {
                int each = nums[i];
                if (each == num1) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(num1);
            }

        }


    }

}





