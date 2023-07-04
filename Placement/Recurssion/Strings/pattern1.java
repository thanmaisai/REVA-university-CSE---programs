package Strings;
// * * * *  
// * * * 
// * *
// * 
public class pattern1 {
    public static void main(String[] args) {
        int num=4;
        iterative_printPattern(num);
        recurssive_printPattern(num,0);
    }

    // iterative approach
    static void iterative_printPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static int row = 0;
    static void recurssive_printPattern(int row,int col){
       if(row ==0) return;
       if(col < row){
        System.out.print("* ");
        recurssive_printPattern(row, col+1);
       }else{
        System.out.println();
        recurssive_printPattern(row-1,0);
       }
    }
}
