package Submissions;

import java.util.Arrays;

public class MinimumSumOfFourDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }

    public static int minimumSum(int num) {
        char[] digitChar = ("" + num).toCharArray();
        Arrays.sort(digitChar);
        return Integer.parseInt(("" + digitChar[0] + digitChar[2])) + Integer.parseInt(("" + digitChar[1] + digitChar[3]));
    }


}
