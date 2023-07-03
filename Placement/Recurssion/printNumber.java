class printNumber {
    public static void main(String[] args) {

        int n=10;
        printnum(n,1);
    }

    static void printnum(int n,int start) {
        if(start==n) { // bc
            System.out.println(start);
            return;
        }
        System.out.println(start);
        printnum(n,start+1); // tail recurssion
    }
}