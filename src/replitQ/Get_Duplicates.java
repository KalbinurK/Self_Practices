package replitQ;

public class Get_Duplicates {
    public static void main(String[] args) {

        String [] r = {"1","2","aa","1", "aa"};

        int sum =0;

        for( String ch : r) {  // get ele
            int count = 0;

            for (String each : r) { // compare ele to get count of ele
                if (ch.equals(each)) {
                    count++;
                }

            }
            System.out.println(count);

                if(count>1) {
                    sum += 1;
                }
            }
            System.out.println(sum);


        }}

