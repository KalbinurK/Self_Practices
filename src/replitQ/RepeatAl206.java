package replitQ;

import java.util.ArrayList;

public class RepeatAl206 {
    public static void main(String[] args) {

        ArrayList<Boolean> repeatAl = new ArrayList<>();
        repeatAl.add(true);
        repeatAl.add(false);
        repeatAl.add(false);

        ArrayList<Boolean> repeat= new ArrayList<>();

           repeat = repeatAl;
           repeat.addAll(repeatAl);
        System.out.println(repeat);
    }
}
