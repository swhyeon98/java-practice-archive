package bronze.bj_4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int[] score = new int[count];
            for (int j = 0; j < count; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            int avgOverStudent = 0;
            double avg = (double) Arrays.stream(score).sum() / count;
            for (int j = 0; j < count; j++) {
                if (avg < score[j]) {
                    avgOverStudent++;
                }
            }

            double result = (double) avgOverStudent / count * 100;
            System.out.printf("%.3f%%%n", result);
        }
    }
}
