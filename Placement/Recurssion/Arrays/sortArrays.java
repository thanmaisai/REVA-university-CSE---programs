package Arrays;

public class sortArrays {
public static void main(String[] args) {
    int arr[]={6,7};
    System.out.println(checkSortedOrNot(arr,0));
}
static boolean checkSortedOrNot(int arr [],int i){
    if (i>=arr.length-1) { 
            return true;
        }
 
        if (arr[i]>arr[i+1]) { 
            return false;
        }

        return checkSortedOrNot(arr, i+1);
}
}

