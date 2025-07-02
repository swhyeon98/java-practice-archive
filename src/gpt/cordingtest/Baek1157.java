package gpt.cordingtest;

import java.util.Scanner;

public class Baek1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        int[] alphabet = new int[26];

        for (int i = 0; i < input.length(); i++) {
            alphabet[input.charAt(i) - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                result = (char) (i + 'A');
            } else if (max == alphabet[i]) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
