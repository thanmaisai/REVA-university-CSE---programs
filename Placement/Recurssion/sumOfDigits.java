public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum_of_digits(1345));
    }

    static int res = 0;
    static int sum_of_digits(int num){
        if(num==0) return 0;
        res += num%10; // to get the last element 
        num = num/10; // change the num by removing the last element
        sum_of_digits(num); //recurssion call
        return res;
    }
    
}
