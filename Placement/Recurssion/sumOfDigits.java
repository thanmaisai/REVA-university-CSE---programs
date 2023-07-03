public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum_of_digits(13));
         System.out.println(prod_of_digits(13));
    }

    static int res = 0;
    static int sum_of_digits(int num){
        if(num==0) return 0;
        res += num%10; // to get the last element 
        num = num/10; // change the num by removing the last element
        sum_of_digits(num); //recurssion call
        return res;
    }

    // similarly for product of digits 
    static int prod_of_digits(int num){
        if(num%10==num) return num;
        return (num%10) * prod_of_digits(num/10);
    }

    
}
