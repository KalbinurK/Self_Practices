package replitQ;

import java.util.Scanner;

public class PrintShortestStr {
    public static void main(String[] args) {
        /*
        Write a program that will print the shortest word in the given array str.
         */
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String minstr = str[0];
        for(int i = 0; i<=str.length-1; i++) {
            if (str[i].length()<minstr.length()) {
                minstr = str[i];

            }
        }
            System.out.println(minstr);


        }


    }

