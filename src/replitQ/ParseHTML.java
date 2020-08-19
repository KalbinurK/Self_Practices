package replitQ;

import java.util.Scanner;

public class ParseHTML {
    public static void main(String[] args) {
        /*
        Write a program, that will read html variable and output attribute value of id attribute (tag) into
         the console. Input will be provided in a single line as outlined below. If html variable doesn't contain
         <html> attribute, print out into the console message: "Invalid input!".

         */
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        String word = "id=\"";
        String s =  "\"";



        if (html.contains("<html>")) {
            System.out.println(html.substring(html.indexOf(word)+4,html.lastIndexOf(s)));
        } else {
            System.out.println("Invalid input!");
        }






    }
}
