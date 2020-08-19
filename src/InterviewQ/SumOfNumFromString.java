package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumFromString {
    public static void main(String[] args) {

        String str = "java36es3jd4";


        for (char each : str.toCharArray()) {   // ,,,,36,,3,,4 replease letter to ','  toCharArray is change string to char
            if (!Character.isDigit(each)) {  // isDigit is wrapper class method only use for Character
                str = str.replace(each,',');
            }
        }
        System.out.println(str);

        String [] digit = str.split(",");  // then we create new Array for str it becomes [, , , , 36, , 3, , 4]
                                                  // ',' will replace by empty spot

        System.out.println(Arrays.toString(digit));
        int sum =0;
        for(String each : digit){    // we get each of the ele from array
            if( !each.equals("")){ // if ele is equal to empty
                sum += Integer.parseInt(each);  // meaning to get integer value of non empty ele add to sum.
                                                // parseInt is wrapper class method use for convert string to primitive value

            }
        }
        System.out.println(sum);

    }

}
