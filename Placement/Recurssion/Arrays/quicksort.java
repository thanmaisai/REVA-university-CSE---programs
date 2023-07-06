package Arrays;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int arr [] ={4,6,8,9,0,1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr, int low, int high){
        if(low>=high) return;

        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = arr[mid]; // pivot is mid ele

        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
