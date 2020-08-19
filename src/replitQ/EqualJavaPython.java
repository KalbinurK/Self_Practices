package replitQ;

import java.util.Scanner;

public class EqualJavaPython {
    public static void main(String[] args) {
        /*
        Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to
         the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true
         */

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i <= sentence.length() - 4; i++) {
            String s1 = sentence.substring(i, i + 4);
            if (s1.equals("java")) {
                count1 += 1;
            }

        }
        System.out.println(count1);

            for (int j = 0; j <= sentence.length() - 6; j++) {
                String s2 = sentence.substring(j, j + 6);
                if (s2.equals("python")) {
                    count2 += 1;
                }

            }
        System.out.println(count2);
            if (count1 == count2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }


