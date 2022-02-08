// strings
//>>>>>>> concat()----used to join 2 different strings
class javaP2
{
    public static void main(String args[])
    {
        String s1="thanmai";
        String s2="sai";
        String s3="pinni";
        String s4=s1.concat(s2);
        String s5=s1.concat(s2).concat(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}

//>>>>>>>>substring()----returns a part of the string.

public class javaP2
{
    public static void main(String args[])
    {
    String s="Sachin Tendulkar";
    System.out.println(s.substring(6));//Tendulkar.
    System.out.println(s.substring(0,6));//Sachin.
    }
}


//>>>>>>>>equals()-----compares the two given strings based on the content of the string

public class javaP2
{  
    public static void main(String args[])
    {  
    String s1="reva";
    String s2="reva";  
    String s3="REVA";  
    String s4="python";  
    System.out.println(s1.equals(s2)); //true because content and case is same  
    System.out.println(s1.equals(s3)); //false because case is not same  
    System.out.println(s1.equals(s4)); //false because content is not same  
    }
} 


//>>>>>>>>compareTo()------compares values lexicographically and returns an integer difference value that describes

class javaP2
{  
    public static void main(String args[])
    {  
    String s1="hello";  
    String s2="hello";  
    String s3="meklo";  
    String s4="hemlo";  
    String s5="flag";  
    System.out.println(s1.compareTo(s2));//0 because both are equal  
    System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
    System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
    System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
    }
}  


//>>>>>>>>==-----Compare reference not the values 

class javaP2
{  
 	public static void main(String args[])
    {
  	String s1=“Reva";  
   	String s2=“Reva";  
   	String s3=“University";  
	String s4=new String(“Reva”);
  	System.out.println(s1==s2);
   	System.out.println(s1==s3)  
	System.out.println(s1==s4) 
   	}  
}  


//>>>>>>>>toLowerCase()---converts string to lowercase

import java.io.*;
public class javaP2
{   
	public static void main(String args[]) 
	{      
	String Str = new String("Welcome to REVA");      	
    System.out.print("Return Value :");      	
    System.out.println(Str.toLowerCase());
	}
}


//>>>>>>>>toUpperCase()---converts string to uppercase

import java.io.*;
public class javaP2 
{  
	public static void main(String args[]) 
	{      
	String Str = new String("Welcome to reva");      	
    System.out.print("Return Value :" );      	
    System.out.println(Str.toUpperCase() );   
	}
} 


//>>>>>>>>charAt()---finds the indexing character in the string

public class javaP2
{  
	public static void main(String args[])
	{  
	String name="REVA UNIVERSITY";  
	char ch=name.charAt(5);
	System.out.println(ch);  
	}
} 


//>>>>>>>>length()--- returns the length of the string

public class javaP2
{  
	public static void main(String args[])
	{  
	String s1="corona virus";  
	String s2="India";  
	System.out.println("string length is: "+s1.length());
	System.out.println("string length is: "+s2.length());
	}
}  


//>>>>>>>>replace()---- replaces a particular character in the whole string

public class javaP2
{     
	public static void main(String args[])
	{      
	String s1= "St_y Home Stay S_fe";      
	String replaceString=s1.replace('_','a'); 	
    System.out.println(replaceString);      
	}
} 



//>>>>>>>>trim()-----removes the string

public class javaP2
{      
	public static void main(String args[])
	{      
	String s1="  REVA   ";      
	System.out.println(s1+"Bangalore"); 	
	System.out.println(s1.trim()+"Bangalore");
	}
} 


//>>>>>>>>split()--- splits the words in the string

public class javaP2
{      
	public static void main(String args[])
	{      
	String s1="REVA University is best educational institute";      	
    String[] words=s1.split("\\s");     	
		for(String w:words)
		{      
		System.out.println(w);      
		}      
	}
} 


//>>>>>>>>contains()---checks the substring is present or not in the main string and returns value in boolean

class javaP2
{      
	public static void main(String args[])
	{      
	String name="what do you know about me";      	
    System.out.println(name.contains("do you"));      	
    System.out.println(name.contains("about"));      	
    System.out.println(name.contains("hello"));      
	}
} 


//>>>>>>>>isEmpty()----checks wether the string is empty or not

public class javaP2
{  
   public static void main(String args[])
   {  
    String s1="";  
    String s2="COVID-19";  
    System.out.println(s1.isEmpty());  
    System.out.println(s2.isEmpty());  
   }
}  


