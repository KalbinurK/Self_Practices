package day7;

public class reverseNum {
    public static void main(String[] args) {

        int num = 123;


        while(num>0) {
            int lastdigit = num % 10;

            num /= 10;
            System.out.print(lastdigit + "");

        }

    }
}
