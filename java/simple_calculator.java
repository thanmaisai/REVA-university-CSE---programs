import java.util.*;
public class simple_calculator
{
    public static void main(String [] args)
    {
        double num1,num2;
        Scanner in= new Scanner(System.in);
        System.out.println("Eneter the first number: ");
        num1=in.nextDouble();
        System.out.println("Eneter the second number: ");
        num2=in.nextDouble();
        System.out.println("Eneter the operator(+,-,*,/): ");
        char operator=in.next().charAt(0);
        in.close();
        double output;
        switch(operator)
        {
            case'+': output=num1+num2;break;
            case'-': output=num1-num2;break;
            case'*': output=num1*num2;break;
            case'/': output=num1/num2;break;
            default: System.out.print("You have entered worng operator");
            return;
        }
        System.out.println(num1+" "+operator+" "+num2+" "+output);
    }
}