package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 0;

        for (int i=1; i<N; i++) {
            System.out.println(N*i+1);
            answer += N*i+i;
        }

        System.out.println(answer);
    }
}
