package replitQ;

import java.util.ArrayList;

public class methodWithArraylist198 {
    /*
    Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
 then add all the words (in order) from wordList2.  In other words, it is combining all the elements from the two parameters.
     */
    public static void main(String[] args) {

    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1,ArrayList<String>wordList2){
        ArrayList<String> words= new ArrayList<>();

        for(String each : wordList1){
            words.add(each);

        }

        for(String each : wordList2){
            words.add(each);
        }

        return words;
    }

   public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num){

        ArrayList<Integer> Positivenums = new ArrayList<>();

        int sum =0;
        for( Integer each :num){

            if(each >0){

                Positivenums.add(each);
                sum += each;

            }
        }
        Positivenums.add(sum);
         return Positivenums;


   }
   // timestwo 202

    public  static ArrayList<Integer> timesTwo (ArrayList<Integer> nums){
        ArrayList<Integer> time2 = new ArrayList<>();

        for(int i =0; i<=nums.size()-1; i++){

            time2.set(i,nums.get(i)*2);
        }

        return time2;
    }


    }




