public class palandrom {
    public static void main(String[] args) {
        String str = "11231";
        System.out.println(checkPalindrome(str, 0, str.length() - 1));
    }

    static boolean checkPalindrome(String str, int start, int end) {
        if (start >= end) { // all match so reached end
            return true;
        }
 
        if (str.charAt(start) != str.charAt(end)) { // failed as they didnt match
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1); // recurssion
    }
}
