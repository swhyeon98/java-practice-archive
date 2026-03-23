package baekjoon.solved.class1double;

import java.util.*;

public class N10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();

        int[] alphabet = new int[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < chars.length; i++) {
            if (alphabet[chars[i] - 'a'] == -1) {
                alphabet[chars[i] - 'a'] = i;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
