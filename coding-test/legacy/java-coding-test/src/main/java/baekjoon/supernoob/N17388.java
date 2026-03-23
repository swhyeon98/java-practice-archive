package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N17388{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if(s+k+h>=100) System.out.println("OK");
        else {
            if (s<k && s<h) System.out.println("Soongsil");
            else if (k<s && k<h) System.out.println("Korea");
            else if (h<s && h<k) System.out.println("Hanyang");
        }
    }
}
