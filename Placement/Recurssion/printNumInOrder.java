public class printNumInOrder {
    public static void main(String[] args) {
        printnumfrom1ton(5);
        System.out.println("-----");
        printnumfromNto1(5);
    }
    // head recurssion
    static void printnumfrom1ton(int n){ // first call then print 
        if(n==0) return;
        printnumfrom1ton(n-1);
        System.out.println(n);
    }

    // tail recurssion
    static void printnumfromNto1(int n){ // first print then call 
        if(n==0) return;
        System.out.println(n);
        printnumfromNto1(n-1);
    }
}
