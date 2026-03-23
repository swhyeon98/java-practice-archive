package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N20332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] st = str.split(" ");
        int a = 0;
        for(int i=0; i<num; i++) {
            a += Integer.parseInt(st[i]);
        }
        System.out.println(a%3==0?"yes":"no");
    }
}
