//P27. 485. Max Consecutive Ones
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int [] nums = new int[size];

        System.out.println("enter all elements one by one okay");
        for(int i = 0 ; i < size ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for(int num : nums){
            if(num == 1){
                counter++;
                max = Math.max(max , counter);
            }else{
                counter = 0;
            }
        }
        return max;
    }
}
