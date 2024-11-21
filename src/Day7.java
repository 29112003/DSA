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
public class Day7{
    public static void main(String[] args) {
        char [] s =new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}