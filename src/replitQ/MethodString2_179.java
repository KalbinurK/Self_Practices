package replitQ;

public class MethodString2_179 {
    /*
   uniqueChars is a method that you will code now, should be able to accept any string in
   the world and return unique characters from the parameter.
Examples:
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
   */
    public static void main(String[] args) {

        System.out.println( uniqueChars("wooden-spoon") ) ;
    }

    public static String uniqueChars(String str) {

        String nonDup = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);
            if (!nonDup.contains(ch)) {
                nonDup += ch;
            }
        }
        return nonDup;
    }
}
