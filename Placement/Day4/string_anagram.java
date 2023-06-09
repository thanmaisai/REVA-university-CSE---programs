import java.util.Arrays;

public class string_anagram {
 public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    char [] arr1 = (str1.toCharArray());
    Arrays.sort(arr1);
    char [] arr2 = (str2.toCharArray());
    Arrays.sort(arr2);
    // Boolean flag=false;
    // if(str1.length()!=str2.length()){
    //     System.out.println("Not Anagram");
    // }else{
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        // for(int i=0;i<arr1.length;i++){
        //     if(arr2[i]==arr2[i]){
        //         flag=true;
        //     }
        // }
        // if(flag==true){
        //     System.out.println("Anagram");
        // }else{
        //     System.out.println("Not Anagram");

        // }
    }
 }
