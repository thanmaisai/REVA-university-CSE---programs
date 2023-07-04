package Arrays;
public class binarySearch2 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int key = 1;
        int result = searchKey(0, arr.length - 1, key, arr);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static int searchKey(int start,int end,int key,int [] arr){
        if(start > end) return -1;

        int mid = start + (end-start)/2;
        if(arr[mid]==key) return mid;

        if(arr[start] <= arr[mid]){
            if(key >= arr[start] && key <= arr[mid]){
                return searchKey(start, mid-1, key, arr);
            }else{
                return searchKey(mid+1, end, key, arr);
            }
        }

        if(key>=arr[mid] && key <= arr[end]){
            return searchKey(mid+1, end, key, arr);
        }else{
            return searchKey(start, mid-1, key, arr);

        }
    }
}
