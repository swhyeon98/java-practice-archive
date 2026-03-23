package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class N1264 {
    private static final List<Character> vowel = List.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            String sentence = br.readLine().toLowerCase();
//            int vowelCount = 0;
//
//            if (sentence.equals("#")) {
//                break;
//            }
//
//            for (int index = 0; index < sentence.length(); index++) {
//                if (vowel.contains(sentence.charAt(index))) {
//                    vowelCount++;
//                }
//            }
//
//            System.out.println(vowelCount);
//        }
        while (true) {
            String sentence = br.readLine().toLowerCase();
            int consonantCount = (sentence.replaceAll("a|e|i|o|u|", "")).length();

            if (sentence.equals("#")) {
                break;
            }

            System.out.println(sentence.length() - consonantCount);
        }
    }
}
