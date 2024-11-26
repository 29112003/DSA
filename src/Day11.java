import java.lang.reflect.Array;
import java.util.Arrays;

public class Day11 {
    public static void main(String[] args) {
        int [] arr = {2 , -23 , 23, 0 ,-342};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int [] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubbleSort(int[] arr){
        boolean isSwapped = false;
        for(int i = 0 ; i < arr.length - 1; i++){
            isSwapped = false;
            for(int j = 0 ; j < arr.length - i - 1  ; j++ ){
                if(arr[j+1] < arr[j]){
                    swap(arr , j , j+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

    public static void selectionSort(int[] arr){
        int minIndex = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            minIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr , i , minIndex);
        }

    }

    public static void insertionSort(int[] arr){

        for(int i  = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                }else{
                    break;
                }
            }
        }
    }

}
