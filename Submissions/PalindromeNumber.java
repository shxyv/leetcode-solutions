package Submissions;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        char [] chars = String.valueOf(x).toCharArray();
        boolean check = true;
        for (int i=0,j=chars.length-1;i<chars.length & j>=0;i++,j--){
            if (chars[i]!=chars[j]){
                check=false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(112112));
    }
}
