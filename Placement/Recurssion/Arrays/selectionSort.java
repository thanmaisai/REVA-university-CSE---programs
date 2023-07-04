package Arrays;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={44,4,1,2,98};
        selectionSort_algo(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort_algo(int[] arr,int row,int col,int max){
        if(row == 0) return;
        if(col<row){
            // getting max element
            if(arr[col]>arr[max]){
                selectionSort_algo(arr, row,col+1,col); // change max 
            }else{
                selectionSort_algo(arr, row,col+1,max); // same max
            }
        }else{
            // swapping max with the row-1 index
            int temp = arr[row-1];
            arr[row-1] = arr[max];
            arr[max] = temp;
            
            // ignoring the last ele as its the largest for this call
            selectionSort_algo(arr, row-1,0,0); 
        }
    }
}
