package Strings;

public class subset_strings {
    
    public static void main(String[] args) {
        getPermAndcomb("abc","");
    }

    //recurssive
    static void getPermAndcomb(String str,String result_str){
        if(str.isEmpty()){
            System.out.println(result_str); 
            return;
        }
        char ch = str.charAt(0);
        getPermAndcomb(str.substring(1),result_str + ch); // take
        getPermAndcomb(str.substring(1),result_str); // don't take

    }
}
