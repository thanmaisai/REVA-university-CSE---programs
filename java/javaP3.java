/*------index-----
-->Java program to read character using Scanner
-->next().charAt(0)--Reads first character in the string
-->nextDouble()--Reads a double value from the user
-->nextFloat()
-->nextInt()
-->nextLine()--Reads a String value from the use
-->next()
*/

// next().charAt(0)---Reads first character in the string
import java.util.Scanner; 
public class javaP3
{    
	public static void main(String[] args)     
	{
    // Declare the object and initialize with        
 	// predefined standard input object         
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);           
	System.out.println("c = "+c);
	sc.close();  
    }
} 

//nextLine()----Reads a String value from the user
import java.util.Scanner; 
public class javaP3
{    
	public static void main(String[] args)     
	{
	Scanner sc = new Scanner(System.in);            
	System.out.println("Enter a line");        
	// line input         
	String s = sc.nextLine();            
	// Print the read value         
	System.out.println("entered line is = "+s); 
	sc.close();    
	} 

}

// Java program to read line using Scanner class
import java.util.Scanner; 
public class javaP3
{    
	public static void main(String[] args)     
	{
	Scanner sc = new Scanner(System.in);           
	System.out.println("Enter a line");        
	// line input         
	String s = sc.nextLine();            
	// Print the read value         
	System.out.println("entered line is = "+s);     
	} 
}
