package JavaHollic;

public class ValidPhoneNum {

    public static void main(String[] args) {


        String num = "(412)7a68067";
        num = num.replace("(", "");
        num = num.replace(")", "");
        Phonenumber(num);
        if (Phonenumber(num).length()==10) {

            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }


    }

    public static String Phonenumber(String num) {


        String result = "";
            for (int i = 0; i <= num.length() - 1; i++) {
                char n = num.charAt(i);
                if (n >= 47 && n <= 57) {
                    result += n;

                }
            }
            return result;

        }
    }