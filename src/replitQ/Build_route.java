package replitQ;

import java.util.Scanner;

public class Build_route {
    /*
    Write a program that will print out route instructions. Your program should take 2
    parameters: start point and endpoint. Use left, right, up and down for navigation.
    Insert ">" between commands. If start point equals to endpoint - display:
    "start/end(start or end variable!) found".
Note: you may move only clockwise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    String start=scan.next();
    String end=scan.next();
    String results="";

        if(start.equals(end)){
        System.out.println(start+" found");
    }else {
        // 15   18
        String routeMap = "A right B> down C> left D> up A> right B> down C> left";  // A->B->C->D cerculation
        //D to A
        int startingpoint = routeMap.indexOf(start);  // find the first D's index number
        int endingpoint = routeMap.indexOf(end, startingpoint);   //meaning D's index number calculating after A's index.
        // so, if A' index# =5;  then D' index starting from 5, not from 0.

        routeMap = routeMap.substring(startingpoint + 2, endingpoint);  // so route map will be updated based on user input
        /*
         Next step, clean up route Map, meaning take out those A B C D and extra space,
         */

        for (int i = 0; i < routeMap.length(); i++) {
            if (routeMap.charAt(i) == 'A' || routeMap.charAt(i) == 'B' || routeMap.charAt(i) == 'C' || routeMap.charAt(i) == 'D') {
                continue;

                // A right B down
            } else {
                results += routeMap.charAt(i);  //
            }
        }
        System.out.println(results.trim() + ": " + end + " found");

    }
}








        }
