package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RankCalculator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] scores = new int[n];
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(input[i]);
            ranks[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) {
                    ranks[i]++;
                }
            }
        }

        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }
}
