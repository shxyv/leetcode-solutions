package Submissions;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum[] = new int[accounts.length];
        int richest = sum[0];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
            if (richest < sum[i]) {
                richest = sum[i];
            }
        }
        return richest;
    }
}
