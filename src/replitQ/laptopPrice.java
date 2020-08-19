package replitQ;

import java.util.Scanner;

public class laptopPrice {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double price = 0;
            String storageType, screenType, cpu;
            int ram = 0 ;

            //WRITE YOUR CODE HERE
            int Memory =0;
            System.out.println("Select screen size:");
            double screen = scan.nextDouble();

            if(screen==13.3){
                price +=200;
            }else if(screen==15.0){
                price +=300;
            }else if(screen==17.3){
                price +=400;
            }
            System.out.println("Select CPU type:");
            cpu =scan.next();
            if(cpu.equals("i3")){
                price +=150;
            }else if(cpu.equals("i5")){
                price +=250;
            }else if(cpu.equals("i7")){
                price +=350;
            }
            System.out.println("Select RAM size:");
            int RAM = scan.nextInt();
            ram += (RAM/4) * 50;
            price +=ram;

            System.out.println("Select storage type:");
            storageType = scan.next();

            System.out.println("Enter memory size:");
            int memory=scan.nextInt();

            if(storageType.equals("HDD")) {
                Memory += (memory / 500) * 50;
                price += Memory;
            }else if(storageType.equals("SSD")){
                Memory +=(memory/500)*100;
                price +=Memory;

            }
            System.out.println("Enter screen resolution:");
            screenType=scan.next();
            if(screenType.equals("FULLHD")){
                price += 100;
            }else if(screenType.equals("4K")){
                price += 200;
            }
            System.out.println("Laptop price is: "+price);
        }
    }

