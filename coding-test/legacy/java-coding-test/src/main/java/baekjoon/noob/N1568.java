package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = 1;
        int answer = 0;
        while (N!=0) {
            N -= K;
            K++;
            answer++;
            if (N < K) {
                K=1;
            }

        }
        System.out.println(answer);
    }
}
