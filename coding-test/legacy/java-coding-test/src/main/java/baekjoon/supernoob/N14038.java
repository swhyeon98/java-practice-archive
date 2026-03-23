package baekjoon.supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N14038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for(int i=0; i<6; i++){
            if (br.readLine().charAt(0) == 'W') cnt ++;
        }
        System.out.println(cnt>0? (cnt>=5 ? 1:(cnt>=3?2:3)) : -1);

    }
}
