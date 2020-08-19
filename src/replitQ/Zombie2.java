package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];

        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();

            int day = 0;
            for (int j = inhabitants[i]; j > 0; j /= 2) {


                System.out.println("Day " + day++ + Arrays.toString(inhabitants));
                inhabitants[i] /=2;
            }

            System.out.println("---- EXTINCT ----");

        }
    }
}