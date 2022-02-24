package Submissions;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }


}
