public class reverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseNum2(1489));
    }

    // my approach - take last digit and put in string and add next ele to string as 2nd digit
    static String res= "";
    static int reverseNum(int n){
        if(n==0) return 0;
        res += Integer.toString(n%10); // to get the last element 
        n = n/10; // change the num by removing the last element
        reverseNum(n); //recurssion call
        return Integer.parseInt(res);
    }

    // alternative approach 1
    static int sum = 0;
    static int reverseNum2(int n){
        if(n==0) return 0;
        sum = sum*10 + n%10;
        reverseNum2(n/10);
        return sum;
    }
}
