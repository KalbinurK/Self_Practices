package replitQ;

import java.util.Arrays;

public class MergeString178 {
    public static void main(String[] args) {

        String s1 = "12345";
        String s2 = "abcde";

        String [] arr1 = s1.split(" ");
        String [] arr2= s2.split(" ");

        String [] arr3 = new String[arr1.length+arr2.length];
        System.out.println(Arrays.toString(arr1));
        for(int i = 0 ; i<=arr1.length-1;i++){
              String n1= arr1[i];



            System.out.println(n1);
        }
        for(int j=0 ; j<=arr2.length-1; j++){
              String n2= arr2[j];
        }


    }


}
