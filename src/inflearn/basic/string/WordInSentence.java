package inflearn.basic.string;

import java.util.Scanner;

public class WordInSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");

        String word = "";
        int min = Integer.MIN_VALUE;
        for (String s : split) {
            if (min < s.length()) {
                word = s;
                min = s.length();
            }
        }

        System.out.println(word);
    }
}
