package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            int k = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j=1;j<=k; j+=2){
                result += j;
            }
            System.out.println(result);
        }

    }
}
