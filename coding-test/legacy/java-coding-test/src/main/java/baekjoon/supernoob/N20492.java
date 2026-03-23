package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int one = (int)(money * 0.78);
        int two = money-(int)((money * 0.2)*0.22);

        System.out.println(one+" "+two);
    }
}
