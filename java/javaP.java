/*---------index---------
 * primitive datatypes
 * Program to understand the types of variables in java 
 * program to display the values of different constant types
 * arithmetic operators
 * conditional/ternary Operators
 * RELATIONAL OPERATORS
 * Logical Operators
 * Assignment Operators(Shorthand Assignment Operators)
 * increment & Decrement Operators
 * Bitwise  Operators
 * Type casting 
*/


// PRIMITIVE DATA TYPES 
class javaP
 {
 	public static void main(String[] args)
 	{ 
        boolean b = false;
		byte num1 = 113;
 		int num2 = 1112;
        float num3 = 19.98f;
 		short num4 = 150; 
        double num5 = -42937737.9d; 
        long num6 = -12332252626L; 
        System.out.println(b)       
		System.out.println(num1);
        System.out.println(num2);       
		System.out.println(num3); 
        System.out.println(num4);
		System.out.println(num5); 
		System.out.println(num6); 
	} 
}

class javaP 
{ 
    public static void main(String[] args) 
    { 
        // declaring character 
        char a = 'G'; 
  
        // Integer data type is generally used for numeric values 
        int i = 89; 
  
        // use byte and short , if memory is a constraint 
        byte b = 4;
        // this will give error as number is larger than byte range 
        // byte b1 = 7888888955; 
  
        short s = 56; 
        // this will give error as number is larger than short range, short s1 = 87878787878; 
  
        // by default fraction value is double in java 
        double d = 4.355453532; 
  
        // for float use 'f' as suffix 
        float f = 4.7333434f; 
  
        System.out.println("char: " + a); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b); 
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
    } 
} 


//Program to understand the types of variables in java 
public class javaP
{
	int data=50;        //instance variable
	static int m=100;   //static variable(Memory allocation for static variable happens only once when the class is loaded in the memory)
	public static void main(String[] args)
	{
		javaP a1=new javaP();
		int n=90;       //local variable
		System.out.println("local variable="+n);
		System.out.println("instance variable="+a1.data);
		System.out.println("static variable="+m);
	}
} 

// Program to display the values of different constant types
class data
{
    static final int INT_CONS= 20;
    static final String STR_CONS="HELLO";
    static final float FLOT_CONS=165.22F;
    static final char CH_CONS='C';
}
class javaP
{
    public static void main(String args[])
    {
        System.out.println("value of integer constant "+data.INT_CONS);
        System.out.println("value of string constant "+data.STR_CONS);
        System.out.println("value of float constant "+data.FLOT_CONS);
        System.out.println("value of character constant "+data.CH_CONS);
    }
}

//OPERATORS
// -------------------------------------------- arithmetic operators
class javaP
{  
	public static void main(String args[])
	{  
	int a=10;  
	int b=5;  
	System.out.println(a+b);//15  
	System.out.println(a-b);//5  
	System.out.println(a*b);//50  
	System.out.println(a/b);//2  
	System.out.println(a%b);//0 
	System.out.println(a+b*a-a/b); 
	}
}  

//--------------------------------------------Conditional/ternary Operators

class javaP
{  
	public static void main(String args[])
	{  
	int a, b; 
	a = 10; 
	b = (a == 1) ? 20: 30; 	
	System.out.println( "Value of b is : " + b ); 
	b = (a == 10) ? 20: 30; 
	System.out.println( "Value of b is : " + b ); 	
	}
}  


//--------------------------------------------RELATIONAL OPERATORS

class javaP{
	public static void main(String[] args) 
	{

		int a = 10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}
}


// --------------------------------------------Logical Operators

class javaP  
{ 
	public static void main(String[] args)  
    { 
	int x = 5; 
	System.out.println(x > 3 && x < 10); 
	System.out.println(x > 3 || x < 4);
 	System.out.println(!(x > 3 && x < 10)); 
	// returns false because ! (not) is used to reverse the result 
	}
}


// --------------------------------------------Assignment Operators(Shorthand Assignment Operators)

class javaP
{ 
    public static void main(String[] args) 
    { 
    int x = 5; 
    System.out.println(x);
    x + = 3; 	System.out.println(x); 
    x -= 4; 	System.out.println(x); 
    x *= 2;	    System.out.println(x); 
    x /= 2; 	System.out.println(x); 
    x %= 2; 	System.out.println(x); 
    x &= 3; 	System.out.println(x);
    x |= 3; 	System.out.println(x);
    x^= 3; 	    System.out.println(x); 
    } 
} 


//--------------------------------------------Increment & Decrement Operators

class javaP 
{ 
    public static void main(String[] args) 
    { 
    int var1 = 5
    int var2 = 5;
    // var1 is displayed
    // Then, var1 is increased to 6.
    System.out.println(var1++); 
    // var2 is increased to 6
    // Then, var2 is displayed 
    System.out.println(++var2);
    }
}


//--------------------------------------------Bitwise  Operators

//--------------- Bitwise OR --------------------The operator returns 1, if either of the operand’s bits are 1.
class javaP
 {
 	public static void main(String[] args) 
	{
 	int number1 = 12, number2 = 25, result; 
	result = number1 | number2; 
	System.out.println(result); 
	}
} 

//--------------- Bitwise AND --------------------The operator returns 1, if both the operand’s bits are 1.
class javaP
 {
 	public static void main(String[] args) 
	{
 	int number1 = 12,  number2 = 25, result; 
	result = number1 & number2; 
	System.out.println(result); 
	}
}

//--------------- Bitwise XOR --------------------The operator returns 1, if both the operand’s bits are opposite to each other, else it returns
class javaP
 {
 	public static void main(String[] args) 
	{
 	int number1 = 12, number2 = 25, result; 
	result = number1 ^ number2; 
	System.out.println(result); 
	}
} 


//--------------- Bitwise COMPLEMENT --------------------This operator inverts all the bits of the operand.
class javaP
 {
 	public static void main(String[] args) 
	{
 	int number1 = 35, result; 
	result = ~number1 ;
	System.out.println(result); 
	}
}


//--------------- Bitwise LEFT SHIFT --------------------This operator shifts the bits to left by an offset provided by the user.
class javaP
 {
 	public static void main(String[] args) 
	{
 	int number = 212, result; 	System.out.println(number << 0); 
	System.out.println(number << 1);
	System.out.println(number << 2); 	System.out.println(number << 4); 
	}
}

//--------------- Bitwise RIGHT SHIFT --------------------This operator shifts the bits to right by an offset provided by the user.
class javaP
 {
 	public static void main(String[] args) 
	{
 	int number = 212, result; 	System.out.println(number >> 0); 
	System.out.println(number >> 1);
	System.out.println(number >> 2); 	System.out.println(number >> 3); 
	}
 } 
}


//Type casting 
//------------Widening/implisit example programs 

//example1
class javaP
 {    
	public static void main(String args[]) 
	{        
		int num1 = 4;
		double num2=2.5;
		double d = num1 / num2;             //num1 is also converted to double
		System.out.println(“Value is: " + d); 		
	}
}

//example2
public class javaP
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

//example3
public class javaP 
{ 
	public static void main(String[] args) 
	{ 
		char ch =   ‘C’;
		int i  = ch;
		System.out.println(i); 				
	}
} 


//---------------Narrowing /Explicit conversion  example programs 
				   
//example1
public class javaP
{ 
  public static void main(String[] argv) 
  { 
    char ch = 'c'; 
    int num = 88; 
    ch = (char) num; 
    System.out.println(ch);
  } 
} 

//example2
//Java program to illustrate conversion of integer to character data type
public class javaP 
{
   public static void main(String args[])
   {
    int i=97;
    char ch = (char) i;
    System.out.println("Character value of the given integer: "+ch);
   }
}

//example3
class javaP
{ 
    public static void main(String[] args) 
    { 
        	double d = 200.03;  
	long l = (long)d; //explicit type casting 
	int i = (int)l; //explicit type casting  
        	System.out.println("Double value "+d); 
                  //fractional part lost 
        	System.out.println("Long value "+l);  
                  //fractional part lost 
        	System.out.println("Int value "+i);  
    }  
} 
 
