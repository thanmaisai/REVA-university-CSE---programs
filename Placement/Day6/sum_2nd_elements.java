import java.util.Arrays;

public class sum_2nd_elements {
    public static void main(String[] args) {
        int arr [] = {2,5,3,1,67,89};
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[1]-arr[arr.length-2]));
    }
}
