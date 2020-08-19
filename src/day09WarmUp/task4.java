package day09WarmUp;

public class task4 {
    /*A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether a triangle
    is valid or not.

    Note: MUST use if&else statement

     */
    public static void main(String[] args) {

        int angle1= 60;
        int angle2= 90;
        int angle3= 30;
        int sum= angle1+angle2+angle3;

        if(sum == 180){
            System.out.println("it is triangle");}
        else{
            System.out.println("it is not triangle");}

        System.out.println("================================");
        /*2. write a program that can check if the two characters (chars) are same characters
        if same, print: "Same characters"
        otherwise, print: "Different characters"

         */
        char a= 'H';
        char b= 'D';
        boolean SameChar= a==b;
        if (SameChar){
            System.out.println("Same Characters");
        } else{
            System.out.println("Defferent characters");
        }

        System.out.println("========================");
        /*SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
        wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false

         */
        int model1= 1995-1998;
        int model2= 2001-2002;
        int model3= 2004-2006;
        int model4= 2015-2017;
        int Sum = model1+ model2+ model3+ model4;

        int car= 2008;
        if (car == sum ){
            System.out.println("true");}
            else{
            System.out.println("False");}






    }

}
