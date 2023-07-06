package Arrays;
import java.util.Arrays;
// time complexity: O(N * logN) -> n levels, and each leven logn complexity
// time complexity: O(N)
public class mergesort {

    public static void main(String[] args) {
        //recurssive
        int arr [] ={4,6,8,9,0,1};
        System.out.println(Arrays.toString(recurssive_Mergethem(arr)));

    }

    static int[] recurssive_Mergethem(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int mid = arr.length / 2;

        // Divide the array into two halves
        int[] left = recurssive_Mergethem(Arrays.copyOfRange(arr, 0, mid));
        int[] right = recurssive_Mergethem(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mergedArr = new int[first.length + second.length];
        int i = 0; // index for the first array
        int j = 0; // index for the second array
        int k = 0; // index for the merged array

        // Compare elements from both arrays and add the smaller one to the merged array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArr[k] = first[i];
                i++;
            } else {
                mergedArr[k] = second[j];
                j++;
            }
            k++;
        }

        // Add remaining elements from the first array, if any
        while (i < first.length) {
            mergedArr[k] = first[i];
            i++;
            k++;
        }

        // Add remaining elements from the second array, if any
        while (j < second.length) {
            mergedArr[k] = second[j];
            j++;
            k++;
        }

        return mergedArr;
    }
}