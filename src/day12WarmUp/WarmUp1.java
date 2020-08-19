package day12WarmUp;

public class WarmUp1 {

    /* 1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT

     */
    public static void main(String[] args) {

        int n1 = -2;
        int n2 = 2;
        int n3 = 1;
        boolean r1= n1>n2 && n1>n3;
        boolean r2= n2>n1 && n2>n3;
        String result = " ";
        if (r1==true){
            result= " n1 is bigger";
        } else if (r2== true){
            result=" n2 is bigger";
        } else {
            result = "n3 is bigger";
        }
        System.out.println(result);
        System.out.println("==========================");
        // onather way to do this question;
        boolean n1bigger= n1>n2 && n1>n3;
        boolean n2bigger= n1bigger==false && n2>n3;
        if(n1bigger){
            result = "n1 bigger";
        } else if(n2bigger){
            result = "n2 is bigger";
        } else{
            result = "n3 is bigger";
        }
         String result1= (n1bigger)? "n1 is bigger":(n2bigger)?"n2 is bigger":"n3 is bigger";
        System.out.println(result1);
    }
}
