package Arrays;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        bubbleSort_algo(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    // note: this is similar to the pattern1.java program 
    // similar concept is applied here
    static void bubbleSort_algo(int arr[],int row,int col){
        if(row==0) return;
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col]=arr[col+1];
                arr[col+1] = temp;
            }

            bubbleSort_algo(arr, row, col+1);
        }else{
            bubbleSort_algo(arr, row-1, 0);
        }
    }

}
