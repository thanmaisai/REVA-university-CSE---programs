import java.util.*;
class freq_str {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int n = str.length();
        Integer [] arr = new Integer [26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=123){
                arr[str.charAt(i)-97]++;
            }
        }
        for(int i=0;i<n;i++){
                System.out.println(str.charAt(i)+":"+arr[(int)str.charAt(i)-97]);
        }
    }
    
}