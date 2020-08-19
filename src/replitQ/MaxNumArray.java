package replitQ;

import java.util.Scanner;

public class MaxNumArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and find the max number.

        //TODO: Write your code below .

        int max = 0;

        for (int i = 0; i <= nums.length - 1;i++){

            int num1= nums[i];

            if(num1 > max){

                max = num1;

            }

        }

        System.out.println(max);

    }
}