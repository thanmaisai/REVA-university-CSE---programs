import java.util.*;

class Rat_count{
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int arr[] ={2,8,3,5,7,4,1,2};
        int target = r * unit;

        if(arr.length == 0){
           System.out.println(-1);return;
        }

        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        if(sum<target){
          System.out.println(0);return;
        }
        
        int res=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            res += arr[i];
            count++;
            if(res>=target) break;
        }
        System.out.println(count);
    }
}