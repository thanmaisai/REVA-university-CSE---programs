import java.util.*;
public class Str_dublicates {
    public static void main(String[] args) {
        String str = "thanmaisai";
        System.out.println(removeDublicates(str));
    }    

    public static String removeDublicates(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
