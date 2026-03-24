package bronze.bj_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int findNumber = Integer.parseInt(br.readLine());
        int result = 0;

        for (String s : str) {
            if (Integer.parseInt(s) == findNumber) {
                result++;
            }
        }

        System.out.println(result);
    }
}
