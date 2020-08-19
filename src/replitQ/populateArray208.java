package replitQ;

import java.util.Arrays;
public class populateArray208 {
    public static int[] populate(int[] r)
    {


        int count =1;
        for(int j = 0; j<=r.length-1; j++) {

            r[j] = count;
            count++;
        }
        return r;

    }

    public static void main(String[] args)
    {


        int [] i= new int[5];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}

