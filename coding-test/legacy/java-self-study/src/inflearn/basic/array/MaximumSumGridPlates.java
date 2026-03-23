package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumSumGridPlates {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[] row = new int[N];
        int[] column = new int[N];
        int diagonal = 0;
        int reverseDiagonal = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int number = Integer.parseInt(st.nextToken());
                arr[i][j] = number;
                row[i] += number;
                column[j] += number;
            }

            diagonal += arr[i][i];
            reverseDiagonal += arr[i][N - 1 - i];
        }

        for (int i = 0; i < N; i++) {
            if (row[i] > result) {
                result = row[i];
            }

            if (column[i] > result) {
                result = column[i];
            }
        }

        if (diagonal > result) {
            result = diagonal;
        }

        if (reverseDiagonal > result) {
            result = reverseDiagonal;
        }

        System.out.println(result);
    }
}

