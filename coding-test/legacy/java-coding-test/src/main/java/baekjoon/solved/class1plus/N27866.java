package baekjoon.solved.class1plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());

        System.out.println(str.charAt(i-1));
    }
}
