package replitQ;

public class overloadingMethod188 {
    public static void main(String[] args) {

        // Extract num from str

        String s ="aa2aa3";
        String number = s.replaceAll("[^0-9]","");

        System.out.println(number);

        System.out.println("====================");

        String line = "far bar";
        String word = "error";
        if(line.substring(0,5).equals(word) ){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println("=======================");
        // merge 2 string

        String s1 ="12345";
        String s2 ="abcde";

        String s1s2= "";

        for(int i = 0; i<=s1.length()-1 || i<=s2.length()-1; i++) {  // for every index of strings
            if (i <= s1.length() - 1) {
                s1s2 += s1.charAt(i);
            }
            if (i <= s2.length() - 1) {
                s1s2 += s2.charAt(i);
            }

        }
        System.out.println(s1s2);

        System.out.println("=========================");
        // coverMe
        String main = "Certified Wooden Spoon";
        String coverME= "o";
        String result = "";

        if(main.contains(coverME)){
            result += main.replace(coverME,"["+coverME+"]");
        }  else {
            result += "["+main+"]";
        }


        System.out.println(result); //Certified W[o][o]den Sp[o][o]n







    }
}
