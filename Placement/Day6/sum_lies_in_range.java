import java.sql.Array;
import java.util.Arrays;

public class sum_lies_in_range {
    public static void main(String[] args) {
        int n=4;
        int m=20;
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum1 = sum1+i;
            }
             if(i%n!=0){
                sum2 = sum2+i;
            }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
