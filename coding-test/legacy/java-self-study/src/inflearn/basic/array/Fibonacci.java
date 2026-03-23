package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] result = new int[input];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < input; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
