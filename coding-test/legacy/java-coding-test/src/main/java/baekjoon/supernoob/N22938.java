package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N22938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());
        int r2 = Integer.parseInt(st2.nextToken());

        int d = (int)Math.sqrt(((x1-x2)*(x1-x2)+((y1-y2)*(y1-y2))));

        if (1l*(x1-x2)*(x1-x2)+1l*(y1-y2)*(y1-y2) < 1l*(r1+r2)*(r1+r2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
