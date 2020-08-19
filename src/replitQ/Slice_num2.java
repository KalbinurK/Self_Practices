package replitQ;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Slice_num2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num, digit1, digit2, digit3, digit4, digit5;
        num = scan.nextInt();

        digit1 = num/10000;  //1
        digit2 = (num%10000)/1000; //2
        digit3= (num%1000)/100; //3
        digit4= (num%100)/10;   //4
        digit5= num%10;   //5
        int [] nums = {digit1, digit2, digit3, digit4, digit5};
        for(int i =0; i< 5; i++){
            System.out.println((nums[i]));
        }




    }
}