package Submissions;

public class MaximumNumberOfWords {
    public static void main(String[] args) {
        System.out.println(countOfWords(new String[]{
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"}));
    }

    private static int countOfWords(String[] sentences) {
        int counter = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if (words.length>counter){
                counter = words.length;
            }
        }
        return counter;
    }
}
