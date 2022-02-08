/**--------------index------------
 * selection statements:-
 * if
 * if else
 * nested if
 * if-else-if
 * switch

 * itiration statements:-
 * for
 * whole
 * do while
 * for each
*/

//if()

class javaP5
{
    public static void main(String args[])
    {
        int num=70;
        if( num < 100 )
        {
            //This println statement will only execute,if the above condition is true
            System.out.println("number is less than 100") 
        }
    }
}


//if else()

class javaP5
{
    public static void main(String args[])
    {
        int num=70;
        if ( num % 2 == 0 )
        { 
	        System.out.println("Entered number is even"); 
        }
        else 
        {
	        System.out.println("Entered number is odd"); 
        }
        
    }
}






//while loop

public class javaP5
{  
    public static void main(String[] args) 
    {  
        int i=1;  
        while(i<=3)
        {  
            System.out.println(i);  
            i++;  
        }  
    }  
}


//do-while loop

public class javaP5
{  
    public static void main(String[] args) 
    {  
        int i=1;  
        do{  
            System.out.println(i);  
            i++;  
        }while(i<=3);  
    }  
    }


 //for loop

public class javaP5
 {  
public static void main(String[] args)
 {  
    //Code of Java for loop  
    for(int i=1;i<=10;i++)
{  
        System.out.println(i);  
  }  
  }  
}


//for-each loop

public class javaP5
{  
    public static void main(String[] args) 
    {  
        //Declaring an array  
        int arr[]={12,23,44,56,78};  
        //Printing array using for-each loop  
        for(int i:arr)
        {  
            System.out.println(i);  
        }  
    }  
}
