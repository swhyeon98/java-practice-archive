package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[6];
        int a = 0;
        int b = 0;
        for (int i=0; i<6; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        a = arr[0]*3 + arr[1]*2 + arr[2];
        b = arr[3]*3 + arr[4]*2 + arr[5];

        if(a==b) System.out.println("T");
        else if (a>b) System.out.println("A");
        else System.out.println("B");
    }
}
