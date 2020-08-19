package replitQ;

import com.sun.media.sound.SF2LayerRegion;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Time2_215 {
    public static void main(String[] args) {
/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,3,5,7));
        ArrayList<Integer> newnum = new ArrayList<>();

        for(int i =0; i<=numbers.size()-1; i++) {
                 newnum.add(numbers.get(i));
                 newnum.add(numbers.get(i));


            }
        System.out.println(newnum);

        }


    }

