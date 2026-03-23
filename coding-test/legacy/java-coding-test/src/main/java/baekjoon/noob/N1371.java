package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        int max = 0;

        while (br.readLine() != null) {
            String writing = br.readLine();
            for (int index = 0; index < writing.length(); index++) {
                if (Character.isAlphabetic(writing.charAt(index))) {
                    alphabet[writing.charAt(index) - 97]++;
                }
            }
        }

        for (int index = 0; index < 26; index++) {
            if (max < alphabet[index]) {
                max = alphabet[index];
            }
        }

        for (int index = 0; index < 26; index++) {
            if (max == alphabet[index]) {
                System.out.print((char) (index+'a'));
            }
        }
    }
}
