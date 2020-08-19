package replitQ;

import java.util.Scanner;

public class ShoppingList {
    /*
    In this assignment, you will write a program that will generate a shopping list. It's more advanced version of
    assignment #22 (Shopping list I).
Your program should ask use to enter items followed by its price. After adding item,
ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping
list report and total price as show in examples. Your program should accept up to 10 items.
Hint: use do while loop.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


         do {

            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            totalPrice += price;

            if (count > 10) {
                break;
            }
            count++;
        }

        while (countinue.equalsIgnoreCase("yes"));

            System.out.println(shoppingListReport);
            System.out.println(shoppingListReport.substring(0, shoppingListReport.length() - 2));  // there is no , in print statement
            System.out.println("Total price: " + totalPrice);

        }


    }

