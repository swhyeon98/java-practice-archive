package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bug = br.readLine();
        String[] str = bug.split("/");

        int kill = Integer.parseInt(str[0]);
        int death = Integer.parseInt(str[1]);
        int assi = Integer.parseInt(str[2]);

        System.out.println(kill+assi < death || death==0 ? "hasu":"gosu");
    }
}
