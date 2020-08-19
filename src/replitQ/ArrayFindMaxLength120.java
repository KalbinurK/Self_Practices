package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindMaxLength120 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }
            String Maxlength = words[0];

            for (String each : words) {

                if (each.length()> Maxlength.length()) {
                    Maxlength= each ;

                }

            }

            System.out.println(Maxlength);
        }


    }








