package day09WarmUp;

public class task01 {
    public static void main(String[] args) {
        /* Task01:
     write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:
                zero
*/
        int num1 = 1;
        int num3 = 0;
        int num2 = -6;

        int num = 0;

        if (num1 > 0) {
            num = 1;

        }

        if (num2  < 0) {

            num = -6;
        }

        if (num3 == 0) {

            num = 0;
        }
        System.out.println(num);
    }
}