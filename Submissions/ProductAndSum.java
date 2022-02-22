package Submissions;

public class ProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        char[] digitChar = String.valueOf(n).toCharArray();
        int sum = 0;
        int product = 1;
        for (char c : digitChar) {
            var value = Integer.parseInt(String.valueOf(c));
            sum += value;
            product *= value;
        }
        return product - sum;
    }
}
