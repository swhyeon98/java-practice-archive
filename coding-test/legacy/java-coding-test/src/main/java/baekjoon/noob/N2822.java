package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] score = new int[8][2];
        int[] result = new int[5];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            score[i][0] = Integer.parseInt(br.readLine());
            score[i][1] = i + 1;
        }

        Arrays.sort(score, (int[] a, int[] b) -> {
            return b[0] - a[0];
        });

        for (int i = 0; i < 5; i++) {
            sum += score[i][0];
            result[i] = score[i][1];
        }

        Arrays.sort(result);

        System.out.println(sum);

        for (int i = 0; i < 5; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
