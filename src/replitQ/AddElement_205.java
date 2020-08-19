package replitQ;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElement_205 {
    public static void main(String[] args) {

        int [] ints1 ={10, 40, 50, 3, 1};
        int [] ints2= {11, 0, 500, 44, 1101};

        int [] result = new int[ints1.length];

        for(int i = 0 ; i<= ints1.length-1; i++){
            result [i] = ints1[i]+ints2[i];
        }

        System.out.println(Arrays.toString(result));//21,40,550,47,1102;
        System.out.println("==========================");


        int [] i ={1,2,3,4};

        int n = i[0];

        i[0]=i[i.length-1];

        i[i.length-1]=n;

        System.out.println(Arrays.toString(i));//4,2,3,1
        System.out.println("========================");

        int [] r = {3};

        int num = r[0];

        int [] result1 = new int[num];
        int count =1;
        for(int j = 0; j<=result1.length-1; j++) {

            result1[j] = count;
            count++;
        }
            System.out.println(Arrays.toString(result1));







    }
}
