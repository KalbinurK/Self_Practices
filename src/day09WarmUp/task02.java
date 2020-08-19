package day09WarmUp;

public class task02 {
    public static void main(String[] args) {
        /*Task02:
        write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
        output:
        Good
        HINT: you will need && logic

         */

       int grade1 = 95;
       if(grade1>90){
           System.out.println("Excellent");}

       int grade2= 75;
       if(70<grade2 && 90>grade2){
           System.out.println("Good");}

       int grade3= 65;
       if(grade3>60 && grade3<70){
           System.out.println("Pass");}
       int grade4= 50;
       if(grade4<60){
           System.out.println("fail");}














    }
}
