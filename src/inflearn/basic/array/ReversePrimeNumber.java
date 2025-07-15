package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        for (String number : numbers) {
            int reversed = Integer.parseInt(new StringBuilder(number).reverse().toString());
            boolean isPrime = true;

            for (int i = 2; i * i <= reversed; i++) {
                if (reversed % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && reversed > 1) {
                System.out.print(reversed + " ");
            }
        }
    }
}
