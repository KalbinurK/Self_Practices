package replitQ;

public class Loop_divided3 {
    public static void main(String[] args) {
        /*
        Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
         */
        for(int num =1; num<=20; num++){
            while(num%3==0){
                System.out.println(num+" ");

                num++;
            }

        }

    }
}
