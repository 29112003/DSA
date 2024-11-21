import java.util.Arrays;
import java.util.Scanner;
//p 23
//public class Day7 {
//    public static void main(String[] args) {
//
//        int [] arr = {1,2,342,34,423,23,-324};
//
//        int Largest = Integer.MIN_VALUE;
//
//        int secondLargest = Integer.MIN_VALUE;
//
//        for(int i  = 0 ; i < arr.length ; i++){
//
//            if(Largest  < arr[i]){
//
//                secondLargest = Largest;
//                Largest = arr[i];
//
//            }else if(Largest != arr[i] && secondLargest < arr[i]){
//
//                secondLargest = arr[i];
//
//            }
//
//
//        }
//        if(secondLargest == Integer.MIN_VALUE){
//
//            System.out.print(Largest + " and the secondLargest is not available in array");
//
//        }else {
//
//            System.out.print(Largest + " and the secondLargest is : " + secondLargest);
//
//        }
//
//    }
//
//}
// p 24 leetcode : 344
//public class Day7{
//    public static void main(String[] args) {
//        char [] s =new char[] {'h', 'e', 'l', 'l', 'o'};
//        reverseString(s);
//        System.out.println(Arrays.toString(s));
//    }
//    public static void reverseString(char[] s) {
//        int left = 0;
//        int right = s.length - 1;
//
//        while(left <= right){
//            char temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//            left++;
//            right--;
//        }
//    }
//}
//   P25. Left Rotation by K elements
//public class Day7{
//    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//
//        Scanner sc = new Scanner(System.in);
//
//        int k = sc.nextInt();
//
//        k = k % arr.length;
//
//        if(k != 0){
//
//        reverseString(arr , 0 , k -1);
//        reverseString(arr , k , arr.length - 1);
//        reverseString(arr , 0 , arr.length - 1);
//
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void reverseString(int [] s , int left , int right) {
//
//        while(left <= right){
//            int temp = s[left];
//            s[left] = s[right];
//            s[right] = temp;
//            left++;
//            right--;
//        }
//    }
//
//}

//P26. 189. Rotate Array

public class Day7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int size = sc.nextInt();

        System.out.println("enter the kth from right");
        int k = sc.nextInt();

        int [] nums = new int[size];

        System.out.println("enter the elements in the array");

        for(int i = 0 ; i < size ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Original array ");
        System.out.println(Arrays.toString(nums));

        System.out.println("Rotated array is : ");

        rotate(nums , k);

        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        if(k != 0){

            reverseArray(nums , nums.length - k   , nums.length - 1);
            reverseArray(nums , 0 , nums.length - k - 1);
            reverseArray(nums , 0 , nums.length - 1);

        }

    }
    public static void reverseArray(int [] arr , int left , int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

//    Overall Complexity:
//    Time Complexity: O(n), where n is the number of elements in the array.
//    Space Complexity: O(1), since the algorithm performs the rotations in-place without requiring extra space.

}