//P27. 485. Max Consecutive Ones
import java.util.Arrays;
import java.util.Scanner;
//
//public class Day8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the size of array");
//        int size = sc.nextInt();
//
//        int [] nums = new int[size];
//
//        System.out.println("enter all elements one by one okay");
//        for(int i = 0 ; i < size ; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        System.out.println(findMaxConsecutiveOnes(nums));
//    }
//    public static int findMaxConsecutiveOnes(int[] nums) {
//        int max = 0;
//        int counter = 0;
//        for(int num : nums){
//            if(num == 1){
//                counter++;
//                max = Math.max(max , counter);
//            }else{
//                counter = 0;
//            }
//        }
//        return max;
//    }
//}


//===============================================================================================================



//P28. 88. Merge Sorted Array

//
//public class Day8{
//
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int [] temp = new int[nums1.length];
//        int count = 0;
//        int count1 = 0;
//        int count2 = 0;
//
//        while(count < temp.length &&  count1 < m && count2 < n ){
//            if(nums1[count1] < nums2[count2]){
//                temp[count] = nums1[count1];
//                count1++;
//            }else{
//                temp[count] = nums2[count2];
//                count2++;
//            }
//            count++;
//        }
//
//        for(int i = count2 ; i < n ; i++){
//            temp[count] = nums2[i];
//            count++;
//        }
//
//        for(int i = count1 ; i < m ; i++){
//            temp[count] = nums1[i];
//            count++;
//        }
//
//        for(int i = 0 ; i < temp.length ; i++){
//            nums1[i] = temp[i];
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the size of array");
//        int m = sc.nextInt();
//
//        int [] nums1 = new int[m];
//
//        System.out.println("enter all elements one by one okay");
//        for(int i = 0 ; i < m ; i++){
//            nums1[i] = sc.nextInt();
//        }
//
//        System.out.println("enter the size of array");
//        int n = sc.nextInt();
//
//        int [] nums2 = new int[n];
//
//        System.out.println("enter all elements one by one okay");
//        for(int i = 0 ; i < n ; i++){
//            nums2[i] = sc.nextInt();
//        }
//
//        merge(nums1,  3,  nums2,  n);
//
//        System.out.println(nums1);
//    }
//
////    complexity is space 0(n) and  time(n)
//
//
//}



//===============================================================================================================



//// P28. 88. Merge Sorted Array optimal
import java.util.Scanner;
//
//public class Day8 {
//
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int count = nums1.length - 1;
//        int count1 = m - 1;
//        int count2 = n - 1;
//
//        while (count >= 0 && count1 >= 0 && count2 >= 0) {
//            if (nums1[count1] < nums2[count2]) {
//                nums1[count] = nums2[count2];
//                count2--;
//            } else {
//                nums1[count] = nums1[count1];
//                count1--;
//            }
//            count--;
//        }
//
//        while (count2 >= 0) {
//            nums1[count] = nums2[count2];
//            count--;
//            count2--;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the size of array nums1 (m):");
//        int m = sc.nextInt();
//
//        System.out.println("Enter the size of array nums2 (n):");
//        int n = sc.nextInt();
//
//        int[] nums1 = new int[m + n];
//
//        System.out.println("Enter elements for nums1 (m elements):");
//        for (int i = 0; i < m; i++) {
//            nums1[i] = sc.nextInt();
//        }
//
//        int[] nums2 = new int[n];
//
//        System.out.println("Enter elements for nums2 (n elements):");
//        for (int i = 0; i < n; i++) {
//            nums2[i] = sc.nextInt();
//        }
//
//        merge(nums1, m, nums2, n);
//
//        System.out.print("Merged array: ");
//        for (int num : nums1) {
//            System.out.print(num + " ");
//        }
//    }
//    ////    complexity is space 0(1) and  time(n+m)
//}


//===============================================================================================================

//P29. 941. Valid Mountain Array
//public class Day8 {
//
//
//        public static boolean validMountainArray(int[] arr) {
//            if(arr.length < 3)return false;
//            boolean peak = false;
//            for(int i = 1 ; i < arr.length-1 ; i++){
//                if(peak){
//                    if(arr[i] <= arr[i+1])return false;
//                }
//                if(arr[i] == arr[i+1])return false;
//                if(arr[i-1] < arr[i] && arr[i] > arr[i+1])peak = true;
//
//                if(arr[i-1] > arr[i] && arr[i] < arr[i+1])return false;
//            }
//            if(!peak)   return false;
//
//            return true;
//        }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the size of array");
//        int size = sc.nextInt();
//
//        int [] nums = new int[size];
//
//        System.out.println("enter all elements one by one okay");
//        for(int i = 0 ; i < size ; i++){
//            nums[i] = sc.nextInt();
//        }
//    }
//}



//===============================================================================================================



//941. Valid Mountain Array
///// by two pointer approach
//
//public  class Day8{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the size of array");
//        int size = sc.nextInt();
//
//        int [] nums = new int[size];
//
//        System.out.println("enter all elements one by one okay");
//        for(int i = 0 ; i < size ; i++){
//            nums[i] = sc.nextInt();
//        }
//    }
//    class Solution {
//
//        public boolean validMountainArray(int[] arr) {
//            int left = 0;
//            int right = arr.length - 1;
//
//            while(left < arr.length -1 && arr[left] < arr[left + 1] ){
//                left++;
//            }
//
//            while(right >= 1 && arr[right] < arr[right - 1] ){
//                right--;
//            }
//            return left == right && left > 0 && right < arr.length - 1;
//        }
//    }
//}


//===============================================================================================================

////26. Remove Duplicates from Sorted Array


//public class Day8{
//    public int removeDuplicates(int[] nums) {
//        int lastUnique = 0;
//        for(int i = 1 ; i < nums.length ; i++){
//            if(nums[i] != nums[lastUnique]){
//                lastUnique++;
//                nums[lastUnique] = nums[i];
//            }
//        }
//        return lastUnique + 1;
//    }
//    public static void main(String[] args) {
////        Time complexity: The solution runs in O(n) time because we only traverse the array once.
////        Space complexity: The solution works in-place with O(1) extra space (no need for additional arrays or extra memory).
//    }
//}


//===============================================================================================================

//P31. 1089. Duplicate Zeros
//
//        public class Day8{
//    public void duplicateZeros(int[] arr) {
//        int count = 0;
//        int [] temp = new int [arr.length];
//
//        for(int i = 0 ; i < arr.length ; i++){
//            if(count == arr.length)break;
//            temp[count++] = arr[i];
//            if(arr[i] == 0 && count < arr.length){
//                temp[count++] = 0;
//            }
//        }
//        for(int i = 0 ; i < arr.length ; i++){
//            arr[i] = temp[i];
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}

//===============================================================================================================

//P31. 1089. Duplicate Zeros
//    two pointer approach

//public class Day8 {
//
//    public void duplicateZeros(int[] arr) {
//        int countZero = 0;
//
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == 0){
//                countZero++ ;
//            }
//        }
//
//        for(int i = arr.length - 1 ; i >= 0 ; i--){
//            if(i + countZero < arr.length){
//                arr[i + countZero] = arr[i];
//            }
//            if(arr[i] == 0){
//                countZero--;
//                if(i + countZero < arr.length){
//                    arr[i + countZero] = arr[i];
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//    /// /O(n) time and uses O(1) extra space
//}


//most optimal here it is

//public int[] sortedSquares(int[] nums) {
//    int [] result = new int [nums.length];
//    int left = 0;
//    int right = nums.length - 1;
//    int count = nums.length - 1;
//
//    for(int i = 0 ; i < nums.length ; i++){
//        nums[i] = nums[i] * nums[i];
//    }
//
//    while(left <= right){
//        if(nums[left] < nums[right]){
//            result[count--] = nums[right--];
//        }else {
//            result[count--] = nums[left++];
//        }
//    }
//    return result;
//}



//===============================================================================================================

//P34. 283. Move Zeroes

//public class Day8{
//    public static void moveZeroes(int[] nums) {
//        int count = 0;
//        for(int i = 0 ; i < nums.length ; i++){
//            if(nums[i] != 0){
//                int temp  = nums[i];
//                nums[i] = nums[count];
//                nums[count] = temp;
//                count++;
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the size of array");
//        int size = sc.nextInt();
//
//        int [] nums = new int[size];
//
//        System.out.println("enter all elements one by one okay");
//        for(int i = 0 ; i < size ; i++){
//            nums[i] = sc.nextInt();
//        }
//
//        moveZeroes(nums);
//
////        Time Complexity:
////
////The time complexity of this algorithm is O(n) because you iterate over the array once, and the swapping operation is constant time for each non-zero element.
////Space Complexity:
////
////The space complexity is O(1) because you are modifying the array in place and using only a constant amount of extra space (count and temp).
//
//        System.out.println(Arrays.toString(nums));
//    }
//}



//// p 33


//most optimal here it is

//public int[] sortedSquares(int[] nums) {
//    int [] result = new int [nums.length];
//    int left = 0;
//    int right = nums.length - 1;
//    int count = nums.length - 1;
//
//    for(int i = 0 ; i < nums.length ; i++){
//        nums[i] = nums[i] * nums[i];
//    }
//
//    while(left <= right){
//        if(nums[left] < nums[right]){
//            result[count--] = nums[right--];
//        }else {
//            result[count--] = nums[left++];
//        }
//    }
//    return result;
//}