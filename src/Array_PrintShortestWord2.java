import java.lang.reflect.AccessibleObject;
import java.util.Arrays;
import java.util.Scanner;

public class Array_PrintShortestWord2 {
    public static void main(String[] args) {

        /*
        Write a program that will find out shortest words in the given string str.
        If there are few words that are evenly short, print them all. Use split method in order to split str
        string variable and create an array of strings.  Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");
         */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] arr= str.split(",");
        Arrays.sort(arr);

        String shortest = arr[0];
        String result = "";

        for(int i =0; i <= arr.length-1; i++) {
            String word = arr[i];

            if (word.length() <= shortest.length()) {
                shortest = word;

                result += word;
            }




        }

        String result1[] = {result};
        System.out.println(Arrays.toString(result1));










    }
}
