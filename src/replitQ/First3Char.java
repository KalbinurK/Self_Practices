package replitQ;

import java.util.Scanner;

public class First3Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();


            String ch = arr[i].substring(0, 3);
            System.out.println(ch);


        }


    }

    }

