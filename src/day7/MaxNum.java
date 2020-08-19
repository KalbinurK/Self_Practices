package day7;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");


         int max=0;
        for(int i =1; i<=5; i++){
            int num1= scan.nextInt();

            if(num1>max){  // 1, 2,3,4,5
                max = num1;

            }
        }

        System.out.println("max number :"+max);


        System.out.println("==============");


        }





    }





