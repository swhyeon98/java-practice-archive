package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] k = new int[num];

        for(int i=0; i<num; i++){
            int n = Integer.parseInt(br.readLine());
            k[i] = n;
        }

        for(int i=1; i<k.length; i++){
            if(k[0]<k[i]) k[0] = -1;
        }

        System.out.println(k[0]>0?"S":"N");
    }
}
