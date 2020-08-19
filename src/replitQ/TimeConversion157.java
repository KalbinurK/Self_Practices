package replitQ;

import java.time.format.DateTimeFormatter;

public class TimeConversion157 {
    public static void main(String[] args) {

        String s = "2:55:00PM";

        String am_pm = s.substring(s.length() - 2,s.length());

        Integer hour = Integer.parseInt(s.substring(0,s.indexOf(":")));

        String NewHour = "";

        if (am_pm.equals("AM")) {


            NewHour = ""+0+ hour+s.substring(s.indexOf(":"),s.length()-2);
        }
        else if(am_pm.equalsIgnoreCase("PM")) {

                hour +=12;
            NewHour = "" + hour + s.substring(s.indexOf(":"), s.length()-2);

        }

        System.out.println(NewHour);

    }
}
