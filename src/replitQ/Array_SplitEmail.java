package replitQ;

import java.util.Scanner;

public class Array_SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

            boolean onesign = email.contains("@");
            boolean twosign =email.indexOf("@")==email.lastIndexOf("@");

            if(!onesign && !twosign){
                System.out.println("invalid email");
            } else{
                String [] arr = email.split("@");
                String id = arr[0];
                String domain = arr[1];
                System.out.println("Print:");
                System.out.println("Email id: "+id);
                System.out.println("Email domain: "+domain);
            }

        }










    }

