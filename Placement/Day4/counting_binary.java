import java.util.*;
public class counting_binary {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int snum = sc.nextInt();
       int db = sc.nextInt();
       int res = DecimalToanybase(snum,db);
       System.out.println("Number of 1's are "+countOnes(res));
       sc.close(); 
       }
       public static int DecimalToanybase(int snum,int db){
           int ans = 0;
           int multiplier = 1;
           while(snum!=0){
               int rem = snum % db; // source num % desination base(db)
               ans = ans + (rem*multiplier);
               multiplier *= 10; // since we multiply them every time with 10 which is the sourse base(sb)
               snum = snum / db; // we need to divide the source num with destination base now

           }
           return ans;
       }
       public static int  countOnes(int num){
        int count=0;
        String str= Integer.toString(num);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
       }
}