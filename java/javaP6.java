/**---------index---------
 * type convetion
 * ---implicit/weinding conversion
 * ---explicit/narrow conversion
 
 * input/output statements
 * 
 */
//-----------------------implicit/weinding type conversion------------------------

//ex1
public class javaP6 
{

	public static void main(String args[])
	{
		int i =100;
		double L = 200;
		double d = i/L;
    	System.out.println("implicit conversion of int to double:"+ d);

	}

}
//ex2
public class javaP6
{
	public static void main(String[] args)
	{
		char ch ='C';
		int i = ch;
		System.out.println(i); 				
	}	
} 
//ex3
public class javaP6
{
	public static void main(String[] args)
	{
		int i = 100;
		long l = i; //no explicit type casting required 
		float f = l; //no explicit type casting required 
		System.out.println("Int value "+i);
		System.out.println("Long value "+l);
		System.out.println("Float value "+f);
	}
} 

//------------------explicit/narrow type conversion------------------------

//ex1
public class javaP6
{
    public static void main(String [] args)
    {
        char ch = 'c';
        int num = 88;
        char ch = (char) num;
        System.out.println(ch);
    }
} 
//ex2
public class javaP6
{
    public static void main(String args[])
    {
        int i=97;
        char ch = (char) i;
        System.out.println("Character value of the given integer: "+ch);
	}
}
//ex3
class Narrow2
{
public static void main(String[] args)
    {
        double d = 200.03;
        long l = (long)d;                       //explicit type casting 
        int i = (int)l;                         //explicit type casting  
        System.out.println("Double value "+d);  //fractional part lost 
        System.out.println("Long value "+l);    //fractional part lost                   
        System.out.println("Int value "+i);
    }
}



//------------------------------constructors in java------------------------------
//--------------------default constructor 

class Bike1
{  
//creating a default constructor  
    Bike1()
    {
        System.out.println("Bike is created");
    }  
//main method  
    public static void main(String args[])
    {  
        //calling a default constructor  
        Bike1 b=new Bike1();  
    }  
}  




//--------------------parameterised constructor
class Square                                // square is a costructor 
{
    int width,height;  
    Square( int a , int b)                  // declaring parameters
    {
        width = a;
        height = b;
    }
    int area() 
    {
        return width * height;
    }
}
class javaP6 //main class 
{
    public static void main(String[] args)
    {
        Square s1 = new Square(10,20);      // creating object and initializing values
        int area_of_sqaure = s1.area();     //calling method square
        System.out.println("The area of square is:" + area_of_sqaure);
    }
}

//-----------------------------------input/output statements-------------------------------------------
//print statement:

import java.io.*;
class javaP6
{
	public static void main(String[] args)
    {
        // using print()  all are printed in the same line
        System.out.print("reva ");
        System.out.print("reva ");
        System.out.print("reva ");
    }
} 


//println

import java.io.*;
class javaP6
{
	public static void main(String[] args)
	{
	    // using println() all are printed in the   different line         
	    System.out.println("Reva ");
	    System.out.println("Reva "); 
	    System.out.println("Reva ");
	}
} 


//printf

import java.util.Date;
class javaP6
{
    public static void main(String args[])
    {
        String data = "Hello World!";
        int x = 9876;
        Date date = new Date();
        System.out.printf("Printing multiple data at once: %S %d %t\n", data,x,date);
    } 
}
