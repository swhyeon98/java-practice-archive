package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class N1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        double max = 0;
        double riggedNumber = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (max < num) {
                max = num;
            }
        }

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            riggedNumber += num / max * 100;
        }

        System.out.println(riggedNumber / N);

        /*
        int N = Integer.parseInt(br.readLine());
        List<Integer> score = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        double M = Collections.max(score);
        double riggedNumber = 0;

        for (int i = 0; i<N;i++) {
            riggedNumber += (score.get(i) / M) * 100;
        }

        System.out.println(riggedNumber / N);
         */

    }
}
