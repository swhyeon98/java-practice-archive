package inflearn.basic.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VisibleStudent {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int result = 1;
        int max = Integer.parseInt(input[0]);

        for (int i = 0; i < count - 1; i++) {
            if (Integer.parseInt(input[i]) < Integer.parseInt(input[i + 1])
                    && max < Integer.parseInt(input[i + 1])) {
                result++;
            }

            if (max < Integer.parseInt(input[i + 1])) {
                max = Integer.parseInt(input[i + 1]);
            }
        }

        System.out.println(result);
    }
}
