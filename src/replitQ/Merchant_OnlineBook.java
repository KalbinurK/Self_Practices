package replitQ;

import java.util.Scanner;

public class Merchant_OnlineBook {
    /*
    Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books and offers 2
     free books with every purchase of 8 or more books. It offers regular customers 1 free book with every purchase
     of 7 or more books, and offers 2 free books with every purchase of 12 or more books.
     Write a program that assigns freeBooks the appropriate value based on the values of the boolean variable
     isPremiumCustomer and the int variable nbooks Purchased. Print amount of freeBooks into the console.

     */
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        int freeBook = 0;  // let is bigin to assign freebook as 0;
        if(isPremiumCustomer) {
            if (nbooksPurchased <= 5 || nbooksPurchased < 8) {
                freeBook += 1;
            } else if (nbooksPurchased >= 8) {
                freeBook += 2;
            }
              // if true statement finished here so we close with }
        }
        else if(!isPremiumCustomer){  // second statement no true bigin here

            if (nbooksPurchased >= 7 && nbooksPurchased<12) {
                freeBook += 1;
            } else if (nbooksPurchased >= 12) {
                freeBook += 2;
                }
            }
            System.out.println(freeBook);
        }

    }





