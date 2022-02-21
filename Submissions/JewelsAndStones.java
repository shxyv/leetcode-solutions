package Submissions;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelChars = jewels.toCharArray();
        char[] stoneChars = stones.toCharArray();
        int counter = 0;

        for (int i = 0; i < jewelChars.length; i++) {
            for (int j = 0; j < stoneChars.length; j++) {
                if (jewelChars[i] == stoneChars[j]) {
                    counter++;
                }
            }
        }
        return counter;


    }
}
