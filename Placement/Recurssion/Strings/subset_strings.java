package Strings;

import java.util.ArrayList;

public class subset_strings {
    
    public static void main(String[] args) {
        getPermAndcomb("abc","");
        System.out.println();
        System.out.println(subseqRet("", "abc"));
    }

    //recurssive
    static void getPermAndcomb(String str,String result_str){
        if(str.isEmpty()){
            System.out.print(result_str + " "); 
            return;
        }
        char ch = str.charAt(0);
        getPermAndcomb(str.substring(1),result_str + ch); // take
        getPermAndcomb(str.substring(1),result_str); // don't take

    }

    //approach2: arraylist 
    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
