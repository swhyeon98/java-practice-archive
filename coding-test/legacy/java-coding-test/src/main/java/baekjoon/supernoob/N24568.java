package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int big = Integer.parseInt(br.readLine()) * 8;
        int small = Integer.parseInt(br.readLine()) * 3;

        int na = big+small - 28;

        System.out.println(na>0?na:0);
    }
}
