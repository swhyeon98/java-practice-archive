package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N21300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int money = 0;

        for(int i=0; i<str.length; i++){
            money += Integer.parseInt(str[i]) *5;
        }
        System.out.println(money);
    }
}
