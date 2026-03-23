package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = 0;
        while (true){
            int num = Integer.parseInt(br.readLine());
            if(num>=0) money += num;
            else break;
        }
        System.out.println(money);
    }
}
