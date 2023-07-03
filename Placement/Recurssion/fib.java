// logic: fibonacci(n-1)+fibonacci(n-2)
public class fib {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(fibonacci(num));
    }

    // approach1:- Time Complexity: O(2^n), Space: O(n)
    static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Time Complexity: O(n), Space: O(n) - using memoization
    static int[] arr = new int[51]; // to store the values already calculated and use it
    static int optimised_fibonacci(int n) {
        if (n <= 1)
            return n;
        if (arr[n] != 0) {
            return arr[n];
        }else{
            arr[n] = optimised_fibonacci(n - 1) + optimised_fibonacci(n - 2);
        }
        return arr[n];
    }
}
