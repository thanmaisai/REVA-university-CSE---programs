package Strings;
// * 
// * *
// * * * 
// * * * *  
public class pattern2 {
    public static void main(String[] args) {
        int num=4;
        iterative_printPattern(num);
        recurssive_printPattern(num,0);
    }

    // iterative approach
    static void iterative_printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    // recurssive approach
    static int row = 0;
    static void recurssive_printPattern(int row,int col){
       if(row == 0) return;
       if(col < row){
           recurssive_printPattern(row, col+1);
           System.out.print("* ");
       }else{
           recurssive_printPattern(row-1,0);
           System.out.println();
       }
    }
}
