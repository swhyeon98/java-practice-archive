package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 0;
        for(int i=0; i<str.length();i++){
            num += Math.pow((int)str.charAt(i)-'0',5);
        }
        System.out.println(num);
    }
}
