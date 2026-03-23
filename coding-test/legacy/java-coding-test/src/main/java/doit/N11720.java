package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 스트림 활용
        /*
        br.readLine();
        int sum = Arrays.stream(br.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);
        */

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        char[] numbers = br.readLine().toCharArray();

        for (int index = 0; index < N; index++) {
            sum += numbers[index] - '0';
        }

        System.out.println(sum);
    }
}
