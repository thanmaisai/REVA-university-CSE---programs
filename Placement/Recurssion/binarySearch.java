public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 1;
        int result = search(0, arr.length - 1, target, arr);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int search(int lo, int hi, int target, int[] arr) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) { // change hi
            return search(lo, mid - 1, target, arr); // recurssion - 2nd half
        }
        if (target > arr[mid]) { // change lo
            return search(mid + 1, hi, target, arr); // recurssion -1st half
        }
        return -1; 
    }
}
