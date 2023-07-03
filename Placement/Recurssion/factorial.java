public class factorial {
    public static void main(String[] args) {
       System.out.println( factorial_num(5));
    }

    //approach:- TC: O(n)
    static int factorial_num(int n){
        if(n<=1) return 1;
        return n * factorial_num(n-1);
    }
}
