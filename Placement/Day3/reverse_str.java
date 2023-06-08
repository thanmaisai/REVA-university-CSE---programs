import java.util.*;
public class reverse_str {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "thanmaisai";
        char arr[] = str.toCharArray();
        int n = str.length();
        int i=0;
        while(i<n/2){
            char temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
            i++;
        }
        String rev_str ="";
        for(int j=0;j<n;j++){
           rev_str+=arr[j];
        }
        System.out.println(rev_str);
        
    }
}
