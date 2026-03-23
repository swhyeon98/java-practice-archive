package baekjoon.solved.class1double;

import java.util.Scanner;

public class N1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        int[] alphabet = new int[26];
        int max = -1;
        char result = '?';

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'A';
            alphabet[index]++;

            if (max < alphabet[index]) {
                max = alphabet[index];
                result = (char) (index + 'A');
            } else if (max == alphabet[index]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
