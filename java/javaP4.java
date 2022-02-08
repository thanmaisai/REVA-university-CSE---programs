// declaration, instantiation and initialization of Java 1D array in a single line 


//Java Program to illustrate the use of declaration, instantiation and initialization of 
//Java 1D array in a single line 
//example1: 
class javaP4
{
    public static void main(String[] args) 
    {
        int[] anArray;	        // declare an array of integers
        anArray = new int[10];	// create an array of integers

        // assign a value to each array element and print 
        for (int i = 0; i <anArray.length; i++) 
        {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
        //System.out.println();
    }
}

//example2:

 class MyClass 
{
  public static void main(String[] args) 
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars)
        {
            System.out.println(i);
        }    
    }
}

//-------------------------------------------------------------------------------------------------------

//Print all elements of 2d array Using Loop

class javaP4
{ 
    public static void main(String[] args) 
    { 
        int[][] a = { 
        {-4, -5, 6, 9},
        {1, -2, 3},
        {7}, 
        }; 
        for (int i = 0; i < a.length; ++i) 
        { 
            for(int j = 0; j < a[i].length; ++j) 
            { 
             System.out.println(a[i][j]); 
            } 
        }   
    } 
} 


//jagged 2Darray --reating odd number of columns in a 2D array

class javaP5 //TestJaggedArray
{  
    public static void main(String[] args){  
        //declaring a 2D array with odd columns  
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for (int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
    }  
}




