public class paraenthesis_checker {
    public static void main(String[] args) {
        // String str1 = "{}[]()";
        String str1 = "{}[(])";
        // String str1 = "{[)])}";
        int curly=0;
        int square=0;
        int parm=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == '{'){
                curly++;
            }else if(str1.charAt(i) == '}'){
                curly--;
            }else if(str1.charAt(i) == '['){
                square++;
            }else if(str1.charAt(i) == ']'){
                square--;
            }else if(str1.charAt(i) == '('){
                parm++;
            }else{
                parm--;
            }
        }
        if(curly==0 && square==0 && parm==0){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
