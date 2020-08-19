package replitQ;

import java.util.Arrays;

public class Assessment3 {
    public static void main(String[] args) {

        // reverse arr string to arr string
        String[] arr = {"apple", "pear"};

        String[] reverse = new String[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[k] = arr[i];
            k++;

        }
        System.out.println(Arrays.toString(reverse));
        // sort arr
        int[] nums = {1, 5, 3, 4};

        boolean result = true;
        for (int i = 0; i <= nums.length - 2; i++) {

            if (nums[i + 1] < nums[i]) {
                 result =false;
                 break;
            }
            result =true;

            }

        System.out.println(result);

        }

    }



