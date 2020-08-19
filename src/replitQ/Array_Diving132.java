package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Diving132 {
    public static void main(String[] args) {

        /*
        In the sport of diving, seven judges award a score between 0 and 10, where each score may be a
        floating-point value. The highest and lowest scores are thrown out, and the remaining scores are
         added together. The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
         */
        Scanner input =new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
       /* System.out.println("Enter score for judge 1:");
        float n1= input.nextFloat();
        System.out.println("Enter score for judge 2:");
        float n2= input.nextFloat();
        System.out.println("Enter score for judge 3:");
        float n3= input.nextFloat();
        System.out.println("Enter score for judge 4:");
        float n4= input.nextFloat();
        System.out.println("Enter score for judge 5:");
        float n5= input.nextFloat();
        System.out.println("Enter score for judge 6:");
        float n6= input.nextFloat();
        System.out.println("Enter score for judge 7:");
        float n7= input.nextFloat();

        */
        float sum = 0;
        for(int i =0; i<7; i++){  // for repeating enter scores;
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i] = input.nextFloat();
            sum +=score[i];
        }

        System.out.println("Enter difficulty:");
        float difficulty= input.nextFloat();

        Arrays.sort(score);
        sum = sum -score[0]-score[score.length-1];

            float total = ( sum*difficulty)* 0.6f;




        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);






    }
}
