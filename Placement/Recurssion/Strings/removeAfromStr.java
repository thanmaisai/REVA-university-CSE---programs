package Strings;

public class removeAfromStr {
    public static void main(String[] args) {
        String str = "bacapplecad";
        String res_str ="";
        skip(res_str,str);
        System.out.println(res_str);
        String word = "apple";
        System.out.println(skip_word(str, word));
    }

    // my approach
    static String Result_str ="";
    static String removeAfromString(String str,int s,int e){ //str,start,end
        if(s>=e) return Result_str;

        if(str.charAt(s)!='a'){
            Result_str+=str.charAt(s);
            removeAfromString(str,s+1,e);
        }else{
            removeAfromString(str,s+1,e);
        }

        return Result_str;
    }

    //kunal approach
    static void skip(String res_str,String str){
        if(str.isEmpty()){
            System.out.println(res_str);
            return;
        }
        char ch = str.charAt(0);

        if(ch=='a'){
            skip(res_str, str.substring(1));
        }else{
            skip(res_str+ch, str.substring(1));
        }
    }


    //kunal approach2 - implace
    static String skip2(String str){

        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip2(str.substring(1));
        }else{
             return ch+str.substring(1);
        }
    }

    // remove a word(set if characters) from the str
    static String skip_word(String str,String word){
        if(str.isEmpty())return"";
        if(str.startsWith(word)){
            return skip_word(str.substring(word.length()), word);
        }
        return str.charAt(0)+skip_word(str.substring(1), word);
    }
}
