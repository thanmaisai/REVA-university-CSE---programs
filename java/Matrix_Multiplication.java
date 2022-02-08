import java.util.Scanner;
class Matrix_Multiplication{
public static void main(String args[])
    {
    int m,n,p,q,c,d,k,Sum=0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows of matrix1");
    m = in.nextInt();
    System.out.println("Enter the number columns of matrix 1");
    n = in.nextInt();
    System.out.println("Enter the number of rows of matrix2");
    p = in.nextInt();
    System.out.println("Enter the number of columns of matrix 2");
    q = in.nextInt();
    if(n==p)
    {   
        int First[][]=new int[m][n];
        System.out.println("Enter the elements of matrix1");
        for (c=0;c<m;c++ )
        { 
           for (d=0;d<n;d++)
               First[c][d] = in.nextInt();
 
        }
        int Second[][]=new int[p][q];
        int Multiply[][]=new int[m][q];
        System.out.println("Enter the elements of matrix2");
        for (c=0;c<p;c++)
        { 
            for (d=0;d<q;d++ )
                Second[c][d]=in.nextInt();
 
        }
        System.out.println("\noutput matrix:-");
        for (c=0;c<m;c++ )
        {
            for (d=0;d<q;d++)
            {
                for (k=0;k<p;k++)
                {
                    Sum += First[c][k]*Second[k][d];
                }
            Multiply[c][d]=Sum;
            Sum=0;
            }
        }
        System.out.println("The product of the two matrices is:");
        for (c=0;c<n;c++)
        {
            for (d=0;d<q;d++)
            {
               System.out.print(Multiply[c][d]+"\t");
            }
            System.out.println("\n");
        }
    }
    else
        System.out.print("multipication does not exist ");
    
}
}