package silver.bj_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(input);
        int result = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += input[i];
            result += sum;
        }

        System.out.println(result);


    }
}
