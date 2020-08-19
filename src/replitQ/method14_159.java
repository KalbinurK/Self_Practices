package replitQ;

public class method14_159 {
    /*
    Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
     */
    public static void main(String[] args) {
        int [] nums={2, 5, 5, 6, 3, 6, 9, 34, 3};
        for(int i =0; i <= nums.length-1; i++){
            int num1 = nums[i];
            int count =0;

        for(int j =0 ; j<= nums.length-1; j++){
            int each = nums[j];
            if(each==num1){
                count++;
            }
        }   if(count ==1){
            System.out.println(num1);
        }

    }
}
    }

