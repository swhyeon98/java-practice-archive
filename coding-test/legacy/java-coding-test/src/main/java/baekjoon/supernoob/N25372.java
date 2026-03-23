package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            String str = br.readLine();
            if(str.length() >= 6 && str.length() <= 9) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
