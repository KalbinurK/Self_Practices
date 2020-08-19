package day12WarmUp;

public class WarmUp2 {
    /*
     2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
     */
    public static void main(String[] args) {
        int age= 151;
        String result = "";
        if (age>0 && age <150){
            if (age <21){
                result= "Teenager";
            }else if(age>=21 && age<55){
                result = "Adult";
            }else if(age>55){
                result = "Senior";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}

