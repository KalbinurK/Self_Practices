package replitQ;

import java.util.ArrayList;

public class Dilivery_calculate211 {
    public static void main(String[] args) {
        /*
        refuel_times([7,7,7],7)
returns:3 (3 fuel stops 7 units each delivery)

refuel_times([9,1],3)
returns:4 (3 fuel stops for first delivery and +1 stop for second)

refuel_times([100,200,10],10)
returns:31


         */

        ArrayList<Integer> deliveries = new ArrayList<>();
        deliveries.add(100);
        deliveries.add(200);
        deliveries.add(10);

        int max_fuel = 10;

        int refueltime = 0;
        int sum =0;
        for(Integer each : deliveries){
            sum += each;

            if(sum%max_fuel==0){
                refueltime = sum/max_fuel;
            }
            if(sum%max_fuel!=0){
                refueltime =sum/max_fuel+1;
            }
        }
        System.out.println(refueltime);

    }
}
