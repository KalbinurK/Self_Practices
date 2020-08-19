package replitQ;

import java.util.Scanner;

public class Zombie {
    /*
    A variable inhabitants represents a city and its respective populations. City might have a population of 0 due
    to a pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its
     population.write a program to loop the city population and make it lose half of its population until no humans
      left. Print the each day like below for each day:
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int inhabitants = scan.nextInt();

        int day=0;   // first we assign integer day =0;

        for (int i = inhabitants; i> 0; i/=2 ){ // for loop use  i == inhabitants number, decrease i/2 everyday;


            System.out.println("Day "+day++ +" ["+i+"]");
            inhabitants /=2;



        }
        System.out.println("---- EXTINCT ----");
    }
}
