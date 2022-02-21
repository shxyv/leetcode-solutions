package Submissions;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {

            newArr[j++] = nums[i];
            newArr[j++] = nums[i + n];
        }
        return newArr;
    }
}
