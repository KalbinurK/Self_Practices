package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Shortestword126 {
    /*
    Write a program that will find out shortest words in the given string str.
     If there are few words that are evenly short, print them all. Use split method in order to
      split str string variable and create an array of strings.  Print array with Arrays.toString() method.
      Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str= str. replace(" ","");
        String [] arr = str.split(",");
        int shortest = arr[0].length();
        String result = "";
        for(String each: arr){
            if(each.length()<shortest){
                shortest= each.length();
            }
        } for(String each: arr){
            if(each.length()==shortest){
                result += each+",";

            }

        }
        arr = result.split(",");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
