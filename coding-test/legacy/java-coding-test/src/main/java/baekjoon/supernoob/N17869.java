package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        int cnt = 0;

        while (num>1){
            if(num%2==0){
                num /= 2;
                cnt ++;
            } else {
                num++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
