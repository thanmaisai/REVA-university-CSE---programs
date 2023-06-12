import java.util.regex.Pattern;

public class password_checker {
    public static void main(String[] args) {
        String str = "SANJAY_LEgend123";
        String pattern = "^[a-z]+|^[A-Z]+[a-zA-Z!@#$%^&*()-_=+0-9]*$";

        if(str.matches(pattern)){
            System.out.println("Password Valid");
        }else{
            System.out.println("Password Invalid");
        }
    }
}
