package replitQ;

import java.util.Scanner;

public class realEstate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your property type:");
       String houseType =scan.nextLine();
        int propertyPrice = 0;

        if(houseType.equals("Condo")){
           propertyPrice += 50000;

        }
        else if(houseType.equals("Townhouse")){
            propertyPrice += 75000;
        }
        else if(houseType.equals("Single Family Home")){
            propertyPrice += 95000;
        }
        System.out.println("How many bedrooms do you have?");
        int numberOfBedrooms= scan.nextInt();
        propertyPrice += numberOfBedrooms * 30000;

        System.out.println("Do you have a backyard?") ;
        boolean backyard = scan.nextBoolean();
        if(backyard && !houseType.equals("Condo")){
            propertyPrice += 5000;
        } else {
            System.out.println("Backyard is not available for condo!");
        }
        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();

        System.out.println("How many spots?");
        int garageSpots = scan.nextInt();

        if(garage && garageSpots <10){
            propertyPrice += garageSpots*20000;
        } else{
            System.out.println("Pardon,  it's not a public parking!");
        }

        System.out.println("How close is metro station?");
        float metroAccessibility=scan.nextFloat();

        if(metroAccessibility<=1){
            propertyPrice += 10000;
        } else if(metroAccessibility>1 && metroAccessibility<3){
            propertyPrice += 5000;
        }
        System.out.println("How close is highway?");
        float highwayAccessibility = scan.nextFloat();

        if(highwayAccessibility<=1){
            propertyPrice +=15000;
        }else if(highwayAccessibility>1 && highwayAccessibility<5){
            propertyPrice += 8000;
        }else if(highwayAccessibility>5 && highwayAccessibility<=20){
            propertyPrice += 4000;
        }

        System.out.println("What's the rating of nearest school?");
        float schoolScore = scan.nextFloat();
        if(schoolScore<=10 && schoolScore>=8){
            propertyPrice += 45000;
        }else if(schoolScore<8 && schoolScore>=4){
            propertyPrice += 20000;
        }else{
            propertyPrice += 5000;
        }
        System.out.println("Does any of your family members smoking?");
        boolean smoking = scan.nextBoolean();

        if(smoking){
            propertyPrice -= 5000;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");
    }
}




