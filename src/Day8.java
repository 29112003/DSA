//P27. 485. Max Consecutive Ones
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

//// P28. 88. Merge Sorted Array optimal
import java.util.Scanner;

public class Day8 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = nums1.length - 1;
        int count1 = m - 1;
        int count2 = n - 1;

        while (count >= 0 && count1 >= 0 && count2 >= 0) {
            if (nums1[count1] < nums2[count2]) {
                nums1[count] = nums2[count2];
                count2--;
            } else {
                nums1[count] = nums1[count1];
                count1--;
            }
            count--;
        }

        while (count2 >= 0) {
            nums1[count] = nums2[count2];
            count--;
            count2--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array nums1 (m):");
        int m = sc.nextInt();

        System.out.println("Enter the size of array nums2 (n):");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];

        System.out.println("Enter elements for nums1 (m elements):");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];

        System.out.println("Enter elements for nums2 (n elements):");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    ////    complexity is space 0(1) and  time(n+m)
}
