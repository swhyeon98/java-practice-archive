package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 1; i<a; i++) {
            cnt ++;
        }
        System.out.println(a*cnt);
    }
}
