package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class N1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iteration = Integer.parseInt(br.readLine());
        int ball = 1;

        for (int index = 0; index < iteration; index++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (ball == x) {
                ball = y;
            } else if (ball == y) {
                ball = x;
            }
        }

        System.out.println(ball);
    }
}
